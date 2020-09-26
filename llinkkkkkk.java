import javax.lang.model.type.NullType;

class llinkkkkkk {
    static class Node {
        int data;
        Node next;
    }

    public static void trav(Node ptr) {
        while (ptr != null) {
            System.out.println("Elements:- " + ptr.data);
            ptr = ptr.next;

        }
    }

    static Node insertatfirst(Node head, int data) {
        Node a = new Node();
        a.data = data;
        a.next = head;
        return a;

    }

    static Node insertatlast(Node head, int data) {
        Node p = new Node();
        Node q = head;
        while (q.next != null) {
            q = q.next;
        }
        p.data = data;
        q.next = p;
        p.next = null;
        return head;
    }

    static Node insertatindex(Node head, int index, int data) {
        Node n = new Node();
        Node p = head;
        int i = 0;
        for (i = 0; i < index - 1; i++) {
            p = p.next;
        }
        n.data = data;
        n.next = p.next;
        p.next = n;
        return head;
    }

    static Node insertbyvalue(Node head, int value, int data) {
        Node p = new Node();
        p.data = data;
        Node q = head;
        while (q.data != value && q.next != null) {
            q = q.next;
        }
        if (q.data == value) {
            p.next = q.next;
            q.next = p;

        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node();
        Node sec = new Node();
        Node thr = new Node();

        head.data = 10;
        head.next = sec;

        sec.data = 20;
        sec.next = thr;

        thr.data = 30;
        thr.next = null;

        System.out.println("The Linked list");
//        llinkkkkkk ob=new llinkkkkkk();
//        ob.trav(head);
        trav(head);
        System.out.println("insert at firtst");
        head = insertatfirst(head, 50);
        trav(head);
        System.out.println("Insert at last");
        head = insertatlast(head, 90);
        trav(head);

        System.out.println("insert at a given index");
        head=insertatindex(head,2,62);
        trav(head);
        System.out.println("Insert by value");
        head = insertbyvalue(head, 20, 69);
        trav(head);

    }

}
