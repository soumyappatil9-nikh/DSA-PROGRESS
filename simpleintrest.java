import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, y, si, z;

        System.out.println("Enter principal:");
        x = sc.nextInt();

        System.out.println("Enter rate:");
        y = sc.nextInt();

        System.out.println("Enter time:");
        z = sc.nextInt();

        si = (x * y * z) / 100;

        System.out.println("Simple Interest = " + si);

        sc.close();
    }
}

