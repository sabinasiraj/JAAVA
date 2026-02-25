class Product {

    int pcode;
    String pname;
    double price;
    void setData(int c, String n, double p) {
        pcode = c;
        pname = n;
        price = p;
    }
    void display() {
        System.out.println("Product Code: " + pcode);
        System.out.println("Product Name: " + pname);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {

        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
      
        p1.setData(101, "Laptop", 50000);
        p2.setData(102, "Mobile", 20000);
        p3.setData(103, "Tablet", 30000);

        
        Product lowest = p1;

        if (p2.price < lowest.price) {
            lowest = p2;
        }

        if (p3.price < lowest.price) {
            lowest = p3;
        }

        System.out.println("Product with Lowest Price:");
        lowest.display();
    }
}
