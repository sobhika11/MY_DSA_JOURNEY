/*The structure of the node of the queue is
class QueueNode
{
    int data;
    QueueNode next;
    QueueNode(int a)
    {
        data = a;
        next = null;
    }
}*/

class MyQueue {
    QueueNode front=null, rear=null;
    int size=0;

    // Function to push an element into the queue.
    void push(int a) {
        // Your code here
        QueueNode nd=new QueueNode(a);
        if(front==null && rear==null)
            {
                front=nd;
                rear=nd;
            }
            else
        {rear.next = nd;
            rear = nd;}
        // size++;
    }

    // Function to pop front element from the queue.
    int pop() {
        if(front==null)
            return -1;
        int t=front.data;
        front=front.next;
        if(front==null) rear=null;
        return t;
        
       // Your code here
    }
}