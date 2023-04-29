public class stackll{
    private static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    static class stack{
        public static Node head = null;

        public static void push(int data){
            Node nn = new Node(data);
            if(head == null){
                head = nn;
                return;
            }

            nn.next = head;
            head = nn;
        }

        public static int pop(){
            if(head == null){
                return -1;
            }
            int res = head.data;
            head=head.next;
            return res; 
        }

        public static int peek(){
            if(head == null){
                return -1;
            }

            return head.data;
        }

        public static boolean isEmpty(){
            return head==null ; 
        }
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(0);
        s.push(1);
        s.push(2);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }


    }
}