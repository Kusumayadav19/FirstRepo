package FirstRepo;

import java.util.*;

public class VDT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum :" + (a + b));
        System.out.println("Product :" + (a * b));
        System.out.println("Sub :" + (a - b));
        System.out.println("Division: " + (a / b));
        System.out.print("Enter the Radius :");
        float radius = sc.nextFloat();
        System.out.println("Area of Circle :" + (3.14 * radius * radius));
        sc.close();
    }
    
}
