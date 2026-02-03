import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner read=new Scanner(System.in);
	String s=read.nextLine();
	ArrayList<Character>li=new ArrayList<>(Arrays.asList('a','y','e','i','o','u'));
	s=s.toLowerCase();
	StringBuilder sb=new StringBuilder();
	for(char ch:s.toCharArray()){
	    if(li.contains(ch))
	      continue;
	    else if(Character.isLetter(ch)){
	        sb.append('.');
	      sb.append(ch);
	    }
	    else if (ch == ' ')
    sb.append(' ');
	}
	System.out.println(sb.toString());
	
	
	}
}