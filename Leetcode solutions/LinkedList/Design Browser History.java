class Node{
        String val;
        Node prev=null;
        Node next=null;
        Node(String val){
            this.val=val;

        }
        Node(String val,Node nd,Node prev){
            this.val=val;
            this.prev=prev;
        }
        public Node insert(Node nd,String val){
            Node node=new Node(val);
            node.prev=nd;
            nd.next=node;
            return node;
        }
        public void delete(Node nd,String val){

        }
    }
    class BrowserHistory {
    Node nd=new Node("BrowserHistory");
    public BrowserHistory(String homepage) {
        nd=new Node(homepage);
    }
    
    public void visit(String url) {
       nd= nd.insert(nd,url);

        
    }
    
    public String back(int steps) {
        Node curr=nd;
        while(curr.prev!=null && steps-->0){
            curr=curr.prev;
        }
        nd=curr;
        return curr.val;
    }
    
    public String forward(int steps) {
        Node curr=nd;
        while(curr.next!=null && steps-->0){
            curr=curr.next;
        }
        nd=curr;
        return curr.val;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */