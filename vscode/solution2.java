import java.util.Scanner;
public class solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0&&n>=2&&n<=5){
        System.out.print("NOT WEIRD");
        }     else if(n%2==0&&n>=6&&n<=20){
             System.out.print("WEIRD");
          }else if(n>20){
             System.out.print("NOT WEIRD");
            }else{
                System.out.print("Weird");
            }
        }}
               
