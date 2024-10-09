import java.util.*;
class vehicle implements Comparable<vehicle>{
    int id;
    String brand;
    String color;

    vehicle(int id, String brand, String color){
        this.id=id;
        this.brand=brand;
        this.color=color;
    }

    int vid(){
        return id;
    }

    String getbrand(){
        return brand;
    }

    String getcolor(){
        return color;
    }

    public String toString(){
        return "id: " + id + ", Brand: " + brand + ", color: " + color;
    }

    public int compareTo(vehicle a){
        return Integer.compare(this.id, a.id);
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, vehicle> hm = new HashMap<>();

        System.out.println("Enter n: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        int id;
        String brand;
        String color;
        for(int i = 1; i<=n; i++){
             System.out.println("Enter id, brand, and color:");
            id = sc.nextInt();
            sc.nextLine();  // Clear the buffer
            brand = sc.nextLine();
            color = sc.nextLine();
            hm.put(i, new vehicle(id, brand, color));
        }

        List<vehicle> list = new ArrayList<>(hm.values());
        Collections.sort(list);

        System.out.println("Sorted Vehicles: ");
        for(vehicle i : list){
            System.out.println(i);
        }

        System.out.println("Enter brand name to search: ");
        brand=sc.nextLine();

        boolean flag = false;
        for(vehicle i : list){
            if(i.getbrand().equalsIgnoreCase(brand)){
                System.out.println(i);
                flag=true;
            }
        }

        if(!flag){
            System.out.println("No Vehicles found");
        }

    }
}
