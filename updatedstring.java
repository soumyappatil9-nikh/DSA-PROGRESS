import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int[] arr={1,2,3,4,5,6,7};
       arr[2]=sc.nextInt();
       for(int i=6; i>=0; i--){
           System.out.println(arr[i]);

       }
       System.out.println();
       for(int i=0; i<=6; i++){
          System.out.println(arr[i]);

       }
    }   
}
