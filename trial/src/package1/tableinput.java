package package1;
import java.util.Scanner;

public class tableinput {
    public static void main(String[] args) {    
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No:");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+"*"+i+"="+num*i);
        }
    }
    
}
