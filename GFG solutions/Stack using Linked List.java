class MyStack {
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }
    StackNode top;
    int size=0;
    // Function to push an integer into the stack.
    void push(int a) {
       
        StackNode nd=new StackNode(a);
        nd.next=top;
        top=nd;
        
    }

    // Function to remove an item from top of the stack.
    int pop() {
        // Add your code here
        if(top==null) return -1;
        int t=top.data;
        top=top.next;
        return t;
        
    }
}