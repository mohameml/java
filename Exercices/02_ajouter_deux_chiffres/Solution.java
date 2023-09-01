import src.TestListNode;
import src.ListNode;

public class Solution {

    public static int recuperChiffres(int[] tab, int size) {

        int res = 0;
        System.out.println("---Info-----");
        System.out.println(size);
        TestListNode.afficheTab(tab);

        for (int i = 0; i < tab.length; i++) {
            res += tab[tab.length - 1 - i] * Math.pow(10, size - 1 - i);
        }
        System.out.println("res :" + res);
        return res;

    }

    public static ListNode solution(ListNode l1, ListNode l2) {

        int[] tab1 = l1.getValues();
        int[] tab2 = l2.getValues();

        // on recuper les deux chiffres tout d'abord :
        int chiffre1 = recuperChiffres(tab1, l1.size());
        int chiffre2 = recuperChiffres(tab2, l2.size());

        int res = chiffre1 + chiffre2;

        String resString = "" + res;

        if (res == 0) {
            ListNode output = new ListNode();
            return output;

        } else {

            ListNode output = new ListNode((int) resString.charAt(resString.length() - 1) - '0');

            for (int i = 1; i < resString.length(); i++) {
                output.add(new ListNode((int) resString.charAt(resString.length() - 1 - i) - '0'));

            }

            return output;
        }

    }

    public static void main(String[] args) {

        // Test de Exemple 1 :
        // System.out.println("--------- Test1 -------------");
        // ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        // ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        // ListNode res = solution(l1, l2);

        // System.out.println("------Input:-----");
        // l1.afficheListNode();
        // l2.afficheListNode();

        // System.out.println("-----Output:-------");
        // res.afficheListNode();

        // test d'exemple 2 :

        ListNode l3 = new ListNode(9);
        // [1,9,9,9,9,9,9,9,9,9]
        ListNode l4 = new ListNode(1);

        for(int i = 0 ; i<9 ; i++)
        {
            l4.add(new ListNode(9));
        }

        System.out.println("-------- Test2 ----------");

        System.out.println("---Input:-----");
        l3.afficheListNode();
        l4.afficheListNode();

        ListNode res2 = solution(l3,l4);

        System.out.println("-----Output-----");
        res2.afficheListNode();


        // test de recuperChiifres :
        int[] tabTest = {1,9,9,9,9,9,9,9,9,9}; 
        int res = recuperChiffres(tabTest, tabTest.length) ;




    }

}
