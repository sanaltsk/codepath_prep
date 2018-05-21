import java.util.Stack;

public class LinkedList {
    static Node head;
    public static void append(int value) {
        if(head==null) {
            head = new Node(value);
            return;
        }
        Node current = head;
        while(current.next!=null) {
            current=current.next;
        }
        current.next=new Node(value);
    }

    public static void prepend(int value) {
        Node newHead = new Node(value);
        newHead.next = head;
        head = newHead;
    }

    public static void deleteWithValue(int value) {
        if(head==null) return;
        if(head.value==value) {
            head=head.next;
        }
        Node current=head;
        while(current.next!=null) {
            if(current.next.value == value) {
                current.next = current.next.next;
                return;
            }
            current=current.next;
        }
    }

    static Node hasCycle() {
        if(head==null) return null;
        Node fast = head;
        Node slow = head;
        while(fast!=null && slow!=null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow) {
                return fast;
            }
        }
        return null;


    }

    static void print(Node head) {
        Node current = head;
        while(current!=null){
            System.out.print(current.value+"=>");
            current=current.next;
        }
        System.out.println();
    }

    static Node reverse(Node start) {
        Node current,next,prev;
        current = start;
        prev = null;
        while(current!=null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        start=prev;
        return start;
    }

    static  boolean isPalindrome(Node head) {
        if(head==null) return true;
        Node current = head;
        Stack<Integer> s = new Stack<>();
        while(current!=null) {
            s.add(current.value);
            current=current.next;
        }

        current = head;
        while(current!=null) {
            if(!s.pop().equals(current.value)) return false;
            current=current.next;
        }
        return true;
    }

    static  void removeDuplicates(Node head) {
        Node current = head;
        if(current==null) return;
        while(current.next!=null) {
            if(current.value==current.next.value) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }



    public static void main(String[] args) {
        append(10);
        append(20);
        append(30);
        append(40);
        append(50);
        append(60);
        append(70);
        append(80);
        print(head);
//        head = reverse(head);
//        print(head);
//        System.out.println("Is list palindrome :" + isPalindrome(head));
//        removeDuplicates(head);
//        print(head);
//        head.next.next.next.next = head.next.next;
//        System.out.println(hasCycle().value);
    }
}

class Node {
    Node next;
    int value;

    public Node(int value) {
        this.value = value;
    }
}
