class loan {
    long loanno;
    String name;
    int months;
    double loanamt;
    double payamt;
    float interest;
    double emi;

    loan(long loanno, String name, int months, double loanamt, float interest) {
        this.loanno = loanno;
        this.name = name;
        this.months = months;
        this.loanamt = loanamt;
        this.interest = interest;
        calculateEMI();
    }

    void calculateEMI() {
        if (interest > 0) {
            double r = interest / 12 / 100;
            emi = (loanamt * r * Math.pow(1 + r, months)) / (Math.pow(1 + r, months) - 1);
        } else {
            emi = loanamt / months;
        }
        payamt = emi * months;
    }

    void display() {
        System.out.println("Loan Number: " + loanno);
        System.out.println("Customer Name: " + name);
        System.out.println("Loan Amount: " + loanamt);
        System.out.println("Months: " + months);
        System.out.println("Interest Rate: " + interest);
        System.out.println("EMI: " + emi);
        System.out.println("Total Payable Amount: " + payamt);
    }
}

class carloan extends loan {
    String carno;

    carloan(long loanno, String name, int months, double loanamt, float interest, String carno) {
        super(loanno, name, months, loanamt, interest);
        this.carno = carno;
    }

    void display() {
        super.display();
        System.out.println("Car Number: " + carno);
    }
}

class agriloan extends loan {
    float landarea;

    agriloan(long loanno, String name, int months, double loanamt, float interest, float landarea) {
        super(loanno, name, months, loanamt, interest);
        this.landarea = landarea;
        if (loanamt < 200000 && months < 24) {
            this.interest = 0;
            calculateEMI();
        }
    }
    void display() {
        super.display();
        System.out.println("Land Area: " + landarea + " acres");
    }
}

public class loandemo {
    public static void main(String[] args) {
        loan[] loans = new loan[2];
        
        loans[0] = new carloan(1001, "John Doe", 36, 500000, 8.5f, "KA05M1234");
        loans[1] = new agriloan(1002, "Jane Smith", 18, 150000, 6.5f, 3.5f);
        
        for (loan l : loans) {
            l.display();
            System.out.println("----------------------------");
        }
    }
}
