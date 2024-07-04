package package1;
import java.util.Scanner;
public class darrays {
    public static void main(String[] args) {  
    Scanner sc=new Scanner(System.in);
    int rows=sc.nextInt();
    int columns=sc.nextInt();
    int matrix[][]=new int[rows][columns];
    for(int r=0;r<rows;r++){
        for(int c=0;c<columns;c++){
            matrix[r][c]=sc.nextInt();
        }
    }
    for(int r=0;r<rows;r++){
        for(int c=0;c<columns;c++){
            System.out.print(matrix[r][c]+ " ");
}
System.out.println();
}  
}
}
