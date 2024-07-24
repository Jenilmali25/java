class Base {
    int m1, m2, m3, m4, m5, tot, avg;

    public Base(int m1, int m2, int m3, int m4, int m5) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.m5 = m5;
        tot = 0; // Initialize tot to 0
        avg = 0; // Initialize avg to 0
    }

    public void marks() {
        tot = m1 + m2 + m3 + m4 + m5;
        avg = tot / 5;
        System.out.println("Total Marks: " + tot);
        System.out.println("Average Marks: " + avg);
    }

    public String grade() {
        if (tot >= 50) {
            return "S";
        } else if (tot >= 40) {
            return "A+";
        } else if (tot >= 30) {
            return "A";
        } else if (tot >= 20) {
            return "B";
        } else if (tot >= 10) {
            return "C n D";
        } else {
            return "F";
        }
    }
}

public class Student_Calculator {
    public static void main(String[] args) {
        System.out.println("===================================");
        System.out.println("CIA I");
        System.out.println("===================================");
        Base cia1 = new Base(50, 49, 48, 43, 50);
        cia1.marks();
        System.out.println("Grade: " + cia1.grade());
        System.out.println();

        System.out.println("===================================");
        System.out.println("CIA II");
        System.out.println("===================================");
        Base cia2 = new Base(44, 50, 50, 49, 48);
        cia2.marks();
        System.out.println("Grade: " + cia2.grade());
        System.out.println();

        // Calculate average to compare with 95
        int average = (cia1.avg + cia2.avg) / 2;

        System.out.println("===================================");
        System.out.println("CIA III");
        System.out.println("===================================");


        if (average >= 45) {
            System.out.println("Average of CIA 1 and CIA 2 is " + average);
            System.out.println("CIA III: Absent");
        } else {
            Base cia3 = new Base(48, 43, 43, 45, 50); // Example marks for CIA 3
            cia3.marks();
            System.out.println("Grade: " + cia3.grade());
            System.out.println();
        }
    }
}
