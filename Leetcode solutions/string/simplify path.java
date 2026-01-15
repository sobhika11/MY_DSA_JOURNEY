class Solution {
    public String simplifyPath(String path) {
        	String [] arr=path.split("/");
        Stack<String>st=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!st.isEmpty() && arr[i].equals(".."))
                st.pop();
            else if(!arr[i].equals(".") && !arr[i].equals("") && !arr[i].equals("..") )
            {
                st.push(arr[i]);
                
            }
        }
        String res="/" + String.join("/", st);
    return res;
    }
}