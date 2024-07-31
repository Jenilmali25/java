import java.util.*;
import java.lang.Math;
public class si_ci{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        double p, r, t;
        System.out.println("Enter principal(rs), rate(perc), time(yrs): ");
        p = obj.nextDouble();
        r = obj.nextDouble();
        t = obj.nextDouble();

        System.out.println("S.I = " + (p*r*t));
        System.out.println("C.I = " + ((p*Math.pow(1+r, t))-p));
    }
}