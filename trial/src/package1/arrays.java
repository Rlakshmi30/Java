package package1;
import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []findx=new int[size];
        for(int i=0;i<size;i++){
            findx[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        for(int i=0;i<findx.length;i++){
            if(findx[i]==x){
                System.out.println("x found at "+i);
            }
        }
       
    }
    
}
