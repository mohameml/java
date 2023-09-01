
public class Solution {

    public static int[] testTarget(int indice, int target, int[] nums) {

        int nb1 = nums[indice];

        for (int i = 0; i < nums.length; i++) {
            if (i != indice) {
                if (nb1 + nums[i] == target) {
                    int[] tab = { indice, i };
                    return tab;
                }
            }

        }

        int[] tab_defaut = { 0, 1 };
        return tab_defaut;

    }

    public static int[] twoSum(int[] nums, int target) {

        int[] OutputTarget = { 0, 1 };

        int indice = 0;
        while (nums[OutputTarget[0]] + nums[OutputTarget[1]] != target && indice < nums.length) {
            OutputTarget = testTarget(indice, target, nums);
            indice++;

        }

        return OutputTarget;

    }

    public static void main(String[] args) {
        int[] tab = { 3, 2, 4 };
        int target = 6;

        int[] OutputTarget = twoSum(tab, target); // [1,2]

        for (int i : OutputTarget) {
            System.out.println(i);
        }
    }
}