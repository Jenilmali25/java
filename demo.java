import java.util.Scanner;

class Loan {
    long loanNo;
    String customerName;
    int months;
    double loanAmount;
    double payableAmount;
    float interest;
    double emi;

    void getDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Loan Number: ");
        loanNo = scanner.nextLong();
        scanner.nextLine();  
        System.out.print("Enter Customer Name: ");
        customerName = scanner.nextLine();
        System.out.print("Enter Loan Amount: ");
        loanAmount = scanner.nextDouble();
        System.out.print("Enter Months: ");
        months = scanner.nextInt();
        System.out.print("Enter Interest Rate: ");
        interest = scanner.nextFloat();
    }

    void display() {
        System.out.println("Loan Number: " + loanNo);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Months: " + months);
        System.out.println("Interest Rate: " + interest);
        System.out.println("Payable Amount: " + payableAmount);
        System.out.println("EMI: " + emi);
    }

    void calculateEMI() {
        double monthlyInterestRate = interest / (12 * 100);
        emi = (loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, months)) / (Math.pow(1 + monthlyInterestRate, months) - 1);
        payableAmount = emi * months;
    }
}

class CarLoan extends Loan {
    String carNo;

    void getDetails() {
        super.getDetails();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Car Number: ");
        carNo = scanner.nextLine();
    }

    @Override
    void display() {
        super.display();
        System.out.println("Car Number: " + carNo);
    }
}

class AgriLoan extends Loan {
    float landArea;

    void getDetails() {
        super.getDetails();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Land Area: ");
        landArea = scanner.nextFloat();
    }

    @Override
    void calculateEMI() {
        if (loanAmount < 200000 && months < 24) {
            interest = 0;
        }
        super.calculateEMI();
    }

    @Override
    void display() {
        super.display();
        System.out.println("Land Area: " + landArea);
    }
}

public class LoanDemo {
    public static void main(String[] args) {
        CarLoan carLoan = new CarLoan();
        System.out.println("Enter details for Car Loan:");
        carLoan.getDetails();
        carLoan.calculateEMI();
        carLoan.display();

        System.out.println();

        AgriLoan agriLoan = new AgriLoan();
        System.out.println("Enter details for Agri Loan:");
        agriLoan.getDetails();
        agriLoan.calculateEMI();
        agriLoan.display();
    }
}