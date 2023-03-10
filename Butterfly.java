import java.util.*;
public class Butterfly {
    public static void main(String[] args) {
        int n=4;
        //First Half
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            //Spaces
            int space=2*(n-i);
            for (int k=1;k<=space;k++){
                System.out.print(" ");
            }
            for (int L=1;L<=i;L++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Second Half
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            //Spaces
            int space=2*(n-i);
            for (int k=1;k<=space;k++){
                System.out.print(" ");
            }
            for (int L=1;L<=i;L++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
