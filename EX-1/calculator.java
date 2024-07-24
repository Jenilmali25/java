import java.util.*;

public class calculator {
    public static void main(String args[]) {
        int a, b;
        int n;
        String ch;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.println("Menu");
            System.out.println("-----------------------------------");
            System.out.println("1. ADD");
            System.out.println("2. SUB");
            System.out.println("3. MUL");
            System.out.println("4. DIV");
            System.out.println("5. MOD");
            System.out.println("-----------------------------------");
            n = obj.nextInt();

            switch(n) {
                case 1:
                    System.out.println("Enter a and b: ");
                    a = obj.nextInt();
                    b = obj.nextInt();
                    System.out.println("Sum: " + (a + b));
                    break;
                case 2:
                    System.out.println("Enter a and b: ");
                    a = obj.nextInt();
                    b = obj.nextInt();
                    System.out.println("SUB: " + (a - b));
                    break;
                case 3:
                    System.out.println("Enter a and b: ");
                    a = obj.nextInt();
                    b = obj.nextInt();
                    System.out.println("MUL: " + (a * b));
                    break;
                case 4:
                    System.out.println("Enter a and b: ");
                    a = obj.nextInt();
                    b = obj.nextInt();
                    if (b != 0) {
                        System.out.println("DIV: " + (a / b));
                    } else {
                        System.out.println("Error: Division by zero");
                    }
                    break;
                case 5:
                    System.out.println("Enter a and b: ");
                    a = obj.nextInt();
                    b = obj.nextInt();
                    System.out.println("MOD: " + (a % b));
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
            System.out.println("Continue (Y/N): ");
            ch = obj.next(); // Read a single word (Y or N)
        } while (ch.equals("y")); // Compare strings using == (not recommended)
    }
}
