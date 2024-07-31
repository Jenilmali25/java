import java.lang.Math.*;
class point{
    double x, y;

    //default cons
    point(){
        x=0;
        y=0;
    }

    //parameterized cons
    point(double a, double b){
        x=a;
        y=b;
    }

    //object parameterizzed cons
    point(point c){
        x=c.x;
        y=c.y;
    }

    double finddist(double a, double b){
        return (Math.sqrt(Math.pow(x-a, 2)+Math.pow(y-b, 2)));
    }

    double finddist(point c){
        return (Math.sqrt(Math.pow(x-c.x, 2)+Math.pow(y-c.y, 2)));
    }

    void disp(){
        System.out.println("points: " +  "(" + x + ", " + y + ")");
    }
}

class pointt{
    public static void main(String args[]){
        point p1= new point(3.25, 7.89);
        p1.disp();
        point p2 = new point(5.37, 18.12);
        p2.disp();
        point p3 = new point(p2);
        p3.disp();
        System.out.println("first Distance: "+p1.finddist(7.9, 16.25));
        System.out.println("Second Distance: "+p1.finddist(p3));

    }
}