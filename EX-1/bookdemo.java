class book{
    String bkname, bkauthor;
    int bkid;

    public book(String name, String author, int id){
        bkname=name;
        bkauthor=author;
        bkid=id;
    }
    public book(){
        bkname="default name";
        bkauthor="unknown";
        bkid=0;
    }
    public void bkupdatedetails(String name, String author, int id){
        bkname=name;
        bkauthor=author;
        bkid=id;
    }
    public void bkdisplay(){
        System.out.println("Book Name: " + bkname);
        System.out.println("Book Author: "+ bkauthor);
        System.out.println("Book id: " + bkid);
    }
}

public class bookdemo{
    public static void main(String[] args){
        book obj = new book();
        obj.bkdisplay();
        book obj1 = new book("jenil", "patterson", 101);
        obj1.bkdisplay();
        obj1.bkupdatedetails("jeeeennnniilll", "pattt", 111);
        obj1.bkdisplay();

    }
}