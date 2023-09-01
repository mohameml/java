package src;

public class ListNode {
    // les attributs , les getteres et les setteres
    private int val;

    public int getVal() {
        return this.val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    private ListNode next;

    public ListNode getNext() {
        return this.next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    // un constructeur :

    public ListNode() {

    }

    public ListNode(int val) {
        this.val = val;
        this.next = null;

    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    // les méthodes

    public void add(ListNode node) {

        // on parcourir le Liste jusqu'a la fin :
        ListNode ptr = this;

        while (ptr.next != null) {
            ptr = ptr.next;
        }

        ptr.next = node;

    }

    public void afficheListNode() {

        ListNode List = this;
        while (List.next != null) {
            System.out.printf("%d -> ", List.val);
            List = List.next;
        }

        System.out.printf("%d -> null \n", List.val);

    }

    public int size() {
        ListNode list = this;

        int lenght = 0;

        while (list != null) {
            lenght++;
            list = list.next;
        }

        return lenght;
    }

    public int[] getValues() {

        int[] tab = new int[this.size()];

        int indice = 0;

        ListNode list = this;

        while (list != null) {
            tab[indice] = list.val;
            list = list.next;
            indice++;
        }
        return tab;
    }

}
