package leetcode.hdkshjm.month11.week2.chap3488;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {

    Solution s = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{-1, 0, 3, 5, 9, 12}, 9, 4),
                Arguments.of(new int[]{-1, 0, 3, 5, 9, 12}, 2, -1),
                Arguments.of(new int[]{-999, -998, -997, -995, -992, -990, -989, -985, -980, -979, -977, -968, -966, -965, -964, -962, -960, -959, -957, -956, -953, -952, -950, -946, -943, -942, -941, -939, -938, -934, -932, -928, -926, -925, -923, -922, -920, -918, -916, -912, -906, -902, -901, -900, -899, -897, -894, -892, -891, -890, -887, -884, -883, -882, -875, -874, -873, -871, -870, -867, -863, -862, -860, -859, -857, -856, -855, -854, -853, -849, -848, -847, -844, -842, -840, -839, -838, -836, -829, -828, -826, -825, -824, -822, -816, -812, -809, -804, -802, -801, -799, -797, -794, -793, -792, -791, -790, -786, -784, -783, -781, -780, -778, -776, -773, -770, -769, -768, -766, -765, -764, -762, -758, -757, -756, -754, -753, -752, -751, -750, -749, -745, -739, -737, -735, -730, -729, -726, -722, -721, -719, -717, -716, -715, -714, -711, -709, -708, -706, -703, -700, -699, -697, -692, -688, -685, -682, -681, -680, -679, -671, -670, -669, -668, -667, -666, -661, -660, -657, -648, -646, -644, -642, -637, -634, -633, -631, -623, -618, -615, -613, -612, -609, -605, -604, -603, -601, -596, -595, -592, -590, -589, -587, -586, -584, -582, -581, -580, -579, -576, -571, -570, -565, -563, -561, -559, -556, -550, -548, -547, -544, -541, -540, -538, -537, -535, -534, -532, -530, -527, -526, -524, -523, -519, -516, -515, -514, -512, -511, -510, -508, -507, -506, -503, -502, -499, -498, -496, -491, -488, -487, -486, -485, -484, -480, -478, -474, -473, -467, -465, -462, -460, -457, -456, -453, -452, -450, -449, -447, -443, -441, -440, -438, -437, -436, -435, -434, -433, -431, -430, -428, -424, -423, -422, -419, -417, -416, -414, -413, -410, -407, -406, -404, -403, -401, -400, -398, -396, -394, -393, -390, -388, -386, -385, -381, -380, -378, -376, -375, -374, -373, -372, -369, -368, -367, -362, -360, -359, -357, -352, -349, -348, -347, -346, -342, -340, -339, -337, -336, -328, -327, -325, -324, -323, -322, -319, -318, -317, -315, -313, -310, -309, -307, -306, -304, -302, -301, -300, -298, -293, -292, -289, -288, -286, -283, -282, -278, -276, -275, -273, -272, -271, -269, -267, -266, -263, -260, -259, -258, -256, -254, -253, -252, -251, -250, -246, -240, -239, -236, -235, -234, -233, -232, -231, -230, -228, -227, -224, -221, -220, -217, -215, -214, -212, -211, -205, -204, -203, -198, -195, -193, -192, -191, -187, -185, -183, -178, -177, -174, -172, -167, -166, -164, -162, -158, -156, -149, -147, -145, -141, -140, -139, -136, -134, -133, -129, -127, -123, -121, -120, -119, -117, -115, -114, -112, -110, -106, -104, -100, -95, -93, -92, -91, -90, -89, -88, -87, -86, -85, -84, -80, -75, -72, -71, -67, -66, -65, -63, -59, -46, -45, -43, -42, -41, -40, -35, -33, -32, -28, -24, -23, -22, -21, -18, -17, -12, -10, -8, -6, -3, -1, 1, 2, 3, 4, 5, 7, 9, 12, 17, 18, 19, 20, 21, 23, 24, 26, 27, 28, 32, 33, 35, 36, 37, 39, 40, 41, 42, 44, 45, 50, 51, 53, 54, 56, 57, 59, 61, 62, 64, 65, 66, 67, 70, 71, 73, 76, 80, 83, 85, 88, 90, 91, 94, 95, 96, 97, 99, 100, 102, 103, 105, 106, 107, 108, 109, 111, 112, 113, 114, 116, 117, 119, 121, 122, 123, 124, 126, 133, 134, 137, 138, 139, 140, 142, 143, 145, 146, 149, 150, 154, 155, 157, 158, 160, 162, 163, 164, 165, 166, 172, 175, 178, 179, 181, 182, 185, 186, 187, 191, 192, 193, 194, 195, 196, 198, 200, 201, 203, 204, 205, 206, 207, 209, 211, 212, 213, 214, 215, 217, 218, 219, 220, 221, 222, 223, 225, 226, 227, 228, 229, 230, 235, 236, 237, 238, 240, 243, 244, 245, 248, 255, 258, 259, 261, 262, 264, 266, 267, 268, 270, 271, 272, 273, 275, 276, 277, 279, 281, 284, 289, 295, 297, 298, 300, 301, 304, 305, 306, 307, 314, 317, 320, 326, 327, 328, 329, 331, 335, 336, 337, 338, 340, 341, 342, 344, 350, 356, 357, 359, 365, 366, 367, 369, 372, 374, 375, 376, 377, 380, 383, 384, 387, 388, 389, 390, 393, 394, 396, 399, 401, 405, 406, 408, 409, 411, 415, 417, 420, 423, 424, 425, 427, 428, 429, 430, 431, 433, 436, 438, 441, 443, 446, 448, 449, 450, 453, 455, 456, 458, 460, 461, 462, 463, 469, 471, 472, 475, 476, 477, 478, 479, 480, 484, 485, 488, 491, 494, 496, 497, 500, 504, 505, 507, 509, 511, 513, 514, 515, 516, 518, 519, 520, 521, 522, 523, 524, 527, 528, 529, 531, 535, 536, 537, 539, 540, 541, 542, 544, 546, 547, 549, 550, 551, 552, 553, 554, 556, 557, 558, 559, 561, 562, 563, 569, 571, 574, 575, 578, 582, 583, 585, 586, 587, 596, 597, 598, 600, 601, 603, 605, 608, 611, 612, 613, 616, 617, 618, 619, 620, 623, 629, 630, 632, 634, 635, 638, 639, 640, 641, 642, 643, 644, 646, 651, 652, 656, 661, 663, 664, 667, 668, 670, 676, 677, 680, 681, 682, 684, 685, 688, 689, 691, 692, 693, 694, 695, 696, 698, 700, 701, 703, 704, 705, 706, 709, 711, 714, 715, 716, 717, 718, 719, 720, 722, 723, 725, 726, 727, 735, 736, 737, 739, 741, 742, 744, 746, 747, 748, 750, 752, 753, 758, 767, 768, 771, 772, 773, 774, 775, 781, 782, 784, 785, 786, 787, 788, 790, 791, 795, 796, 797, 799, 801, 803, 804, 805, 810, 811, 812, 813, 818, 819, 822, 824, 825, 828, 829, 831, 832, 835, 837, 838, 839, 842, 843, 845, 846, 847, 850, 853, 854, 855, 856, 857, 859, 862, 863, 864, 865, 866, 871, 872, 874, 875, 876, 879, 880, 883, 885, 886, 890, 891, 892, 893, 894, 895, 896, 897, 901, 902, 903, 906, 908, 910, 911, 914, 919, 920, 921, 922, 924, 927, 929, 931, 935, 938, 941, 942, 943, 944, 945, 946, 948, 950, 951, 952, 953, 954, 956, 957, 959, 962, 964, 967, 968, 969, 973, 975, 977, 979, 980, 982, 983, 988, 989, 990, 994, 995, 998},
                        -571, 190)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, int target, int expected) {
        int result = s.search(nums, target);
        Assertions.assertEquals(expected, result);
    }
}
