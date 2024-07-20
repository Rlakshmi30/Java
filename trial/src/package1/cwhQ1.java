package package1;
import java.util.Scanner;
public class cwhQ1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Total Marks");
        int total=sc.nextInt();
        System.out.println("Enter Marks of Subjects:");
        int eng=sc.nextInt();
        int hin=sc.nextInt();
        int maths=sc.nextInt();
        int sci=sc.nextInt();
        int comp=sc.nextInt();
      int total_marks=eng+hin+maths+sci+comp;
      float percentage=total_marks*100/(total) ;     
System.out.println("Percentage"+percentage);
    }
    
}
