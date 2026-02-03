import java.util.*;
public class Main{
     public static void main(String args []){
          Scanner read=new Scanner(System.in);
          int t=read.nextInt();
          while(t-->0){
               int a=read.nextInt();
               int b=read.nextInt();
               int c=read.nextInt();
               if(a+b==c)
                    System.out.println("+");
               else
                    System.out.println("-");
          }
     }
}