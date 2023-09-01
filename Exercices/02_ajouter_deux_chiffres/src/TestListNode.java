package src;

public class TestListNode {

    public static void afficheTab(int[] tab) {
        System.out.printf("[");
        for (int i = 0; i < tab.length - 1; i++) {
            System.out.printf("%d ,", tab[i]);
        }
        System.out.printf("%d]\n", tab[tab.length - 1]);
    }

    public static void main(String[] args) {

        /*
         * Test de construcuteur :
         */
        System.out.println("----------- Test des constructeures -------");
        ListNode list1 = new ListNode();
        list1.afficheListNode();

        ListNode list2 = new ListNode(3);
        list2.afficheListNode();

        ListNode list3 = new ListNode(4, new ListNode(1));
        list3.afficheListNode();

        System.out.println("");

        System.out.println("----------- Test de la méthode add ---------");
        System.out.println("");
        /*
         * Test de la méthode add
         */
        list1.add(new ListNode(1));
        list1.add(new ListNode(2));
        list1.add(new ListNode(3));

        System.out.println("");
        System.out.println("----------- Test de la méthode afficheListNode ---------");
        /*
         * Test de la méthode afficheListNode :
         * 
         */
        list1.afficheListNode();

        // Test de la méthode size() :
        System.out.println("");
        System.out.println("--- Test de la méthode size() ----");

        System.out.println("la Taille de list1 est :" + list1.size());
        System.out.println("la Taille de list2 est :" + list2.size());
        System.out.println("la Taille de list3 est :" + list3.size());

        // Test de la méthode getValues :
        System.out.println("");
        System.out.println("----- Test de la méthode getValues() ----");

        int[] valList1 = list1.getValues();
        afficheTab(valList1);
        int[] valList2 = list2.getValues();
        afficheTab(valList2);
        int[] valList3 = list3.getValues();
        afficheTab(valList3);
    }

}
