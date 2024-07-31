class mobile{
    int mno;
    String mname;
    double cost;
    int size;
    String color;
    int mcapacity;
    int pixsize;

    mobile(){
        mno=0;
        mname=null;
        cost=0;
        size=0;
        color=null;
        mcapacity=0;
        pixsize=0;
    }

    mobile(int mno, String mname){
        this.mno=mno;
        this.mname=mname;
    }
    mobile(String color, int pixsize, int size){
        this.size=size;
        this.color=color;
        this.pixsize=pixsize;
    }
    mobile(String mname, double cost, int size, String color){
        this.mname=mname;
        this.cost=cost;
        this.size=size;
        this.color=color;
    }
}

class mobilephone{
    public static void main(String args[]){
        mobile obj1 = new mobile(123, "aaa");
        mobile obj2 = new mobile("Red", 123, 111);
        mobile obj3 = new mobile("S21FE", 20000, 122, "Cyan");
    }
}