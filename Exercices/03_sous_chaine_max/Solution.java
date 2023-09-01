
import java.util.ArrayList;

public class Solution {

    public static boolean existeInChaine(char lettre, StringBuilder str) {
        for (int i = 0; i < str.length(); i++) {
            if (lettre == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public static int tailleMaxSubString(String s, int index) {
        char lettre = s.charAt(index);
        String sousChaine = s.substring(index + 1, s.length());

        StringBuilder str = new StringBuilder(lettre);
        int count = 1;
        for (int i = 0; i < sousChaine.length(); i++) {
            if (existeInChaine(sousChaine.charAt(i), str)) {

                return count;
            } else {
                str.append(sousChaine.charAt(i));
                count++;
            }

        }

        return count;
    }

    // public static int countMax(HashMap<String, Integer> hMap) {
    // int max = 0;

    // for (Map.Entry<String, Integer> couple : hMap.entrySet()) {
    // if (max < couple.getValue()) {
    // max = couple.getValue();
    // }
    // }

    // return max;

    // }

    public static int max(ArrayList<Integer> list) {
        int max = list.get(0);

        for (int i : list) {
            if (max < list.get(i)) {
                max = list.get(i);
            }

        }

        return max;
    }

    public static int lengthOfLongestSubstring(String s) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < s.length() - 1; i++) {
            int count = tailleMaxSubString(s, i);
            list.add(count);
        }

        int res = max(list);

        return res;
    }

    public static void main(String[] args) {

        // Test 1 :
        System.out.println("----- Test1 ------");

        String str1 = "abcabcbb";

        int i1 = lengthOfLongestSubstring(str1);

        System.out.println("------Input------");
        System.out.println(str1);

        System.out.println("-----Output------");
        System.out.println(i1);

    }
}