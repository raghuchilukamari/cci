import java.util.Stack;

public class LinkedList {

    Node head;


    public LinkedList add (LinkedList ll,Node element){

        if(ll.head == null)  ll.head = element;
        else {
            Node next = ll.head;
            while(next.next != null){
                next = next.next;
             }
            next.next = element;
        }
        return ll;
    }

    public void delete (Node element) {

    }

    public void print(LinkedList ll){

        Node curr = ll.head;

        while (curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }

    }


    public static void main(String[] args) {



        LinkedList ll = new LinkedList();

        Node element1 = new Node(1);
        ll = ll.add(ll,element1);

        Node element2 = new Node(2);
        ll = ll.add(ll,element2);

        ll.print(ll);

        System.out.println(ll.head.data);




    }

}

class Node {

    int data;
    Node next;

    Node(int d){
        data = d;
    }


}

