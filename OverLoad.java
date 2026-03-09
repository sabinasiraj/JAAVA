import java.util.Scanner;
public class OverLoad {
    void area(float x) {
        System.out.println("the area of the square is " + Math.pow(x, 2) + " sq units");
    }

    void area(float x, float y) {
        System.out.println("the area of the rectangle is " + x * y + " sq units");
    }

    void area(double x) {
        double z = 3.14 * x * x;
        System.out.println("area of circle is " + z + " sq units");
    }
}
class overload {
    public static void main(String[] args) 
    {
        OverLoad ob = new OverLoad();
        Scanner sc = new Scanner(System.in);
        Scanner ar = new Scanner(System.in);
        while (true) {
            System.out.println("enter your choice");
            System.out.println("1. area of square");
            System.out.println("2. rectangle");
            System.out.println("3. radius circle");
            System.out.println("4. exit");
            int choice;
            float a, b;
            double x;
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter area of square");
                    a = ar.nextFloat();
                    ob.area(a);
                    break;
                case 2:
                    System.out.println("Enter area of rectangle");
                    a = ar.nextFloat();
                    b = ar.nextFloat();
                    ob.area(a, b);
                    break;
                case 3:
                    System.out.println("Enter radius of circle");
                    x = ar.nextDouble();
                    ob.area(x);
                    break;
                case 4:
                    System.out.println("Existing......");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
