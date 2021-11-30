package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0721;

import java.util.*;

class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        // key:email
        Map<String, Node> map = new HashMap<>();

        //o(n^2)...
        for (int i = 0; i < accounts.size(); i++) {
            List<String> account = accounts.get(i);
            for (int j = 1; j < account.size(); j++) {
                String email = account.get(j);
                Node node = map.getOrDefault(email, new Node(account.get(0), email));
                map.put(email, node);
            }
            for (int j = 1; j < account.size() - 1; j++) {
                for (int k = j + 1; k < account.size(); k++) {
                    String email1 = account.get(j);
                    String email2 = account.get(k);
                    map.get(email1).children.add(map.get(email2));
                    map.get(email2).children.add(map.get(email1));
                }
            }
        }

        Set<String> used = new HashSet<>();
        List<List<String>> ret = new ArrayList<>();
        for (Node node : map.values()) {
            if (!used.contains(node.email)) {
                List<String> list = new ArrayList<>();
                find(node.email, list, used, map);
                Collections.sort(list);
                list.add(0, node.name);
                ret.add(list);
            }
        }
        return ret;
    }

    private void find(String email, List<String> list, Set<String> used, Map<String, Node> map) {
        if (used.contains(email)) return;
        list.add(email);
        used.add(email);
        for (Node child : map.get(email).children) find(child.email, list, used, map);
    }

}

class Node {
    public String name;
    public String email;
    public Set<Node> children;

    Node(String name, String email) {
        this.name = name;
        this.email = email;
        children = new HashSet<>();
    }
}
