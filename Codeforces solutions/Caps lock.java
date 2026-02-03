import java.util.*;
public class Main{
     public static void main(String args []){
        Scanner read=new Scanner(System.in);
        String s=read.nextLine();
        String sec=s.substring(1,s.length());
        String ch=Character.toString(s.charAt(0));
        if (s.equals(s.toUpperCase()))
            s = s.toLowerCase();
        else if(sec.equals(sec.toUpperCase())){
          sec=sec.toLowerCase();
          ch=ch.toUpperCase();
          s=ch+sec;
        }
        System.out.println(s);
        
     }
}