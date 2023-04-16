package pg7;

import java.util.*;
import java.time.LocalDate;
interface Calculate{
    void display(Bill[] bill, int n);
}

class Bill implements Calculate{
    int id, quantity, price, total = 0, n;
    String name;

    public Bill(int id, int quantity, int price, String name
    ) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.name = name;
        this.n = n;
    }

    public void display(Bill[] bill, int n){
        LocalDate date = LocalDate.now();
        System.out.println("Order No: 1");
        System.out.println("Date: "+date);
        System.out.println("Product ID   Name   Quantity   Price   Total");
        System.out.println("................................................");
        for(int i=0; i< n; i++){
            System.out.println(bill[i].id+"            "+bill[i].name+"    "+bill[i].quantity+"           "+bill[i].price+"        "+(bill[i].quantity * bill[i].price));
            total = total + (bill[i].quantity * bill[i].price);
        }
        System.out.println("...............................................");
        System.out.println("           Net Amount "+total);
        }

    public Bill() {
    }
}

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bill bill1 = new Bill();
        Bill[] bill = new Bill[100];
        System.out.println("Enter the number of products: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Enter the id: ");
            int id = sc.nextInt();
            System.out.println("Enter the name: ");
            String name = sc.next();
            System.out.println("Enter the quantity: ");
            int quantity = sc.nextInt();
            System.out.println("Enter the price: ");
            int price = sc.nextInt();
            bill[i] = new Bill(id, quantity, price, name);
        }
        bill1.display(bill,n);
    }
}