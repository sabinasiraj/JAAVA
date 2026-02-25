class Student {
    String name;
    int rollNo;
    double mark1, mark2, mark3;
    double total, average;

    void getData() {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();

        System.out.print("Enter three marks: ");
        mark1 = sc.nextDouble();
        mark2 = sc.nextDouble();
        mark3 = sc.nextDouble();
    }

    void calculate() {
        total = mark1 + mark2 + mark3;
        average = total / 3;
    }

    void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.getData();
        s.calculate();
        s.display();
    }
}
