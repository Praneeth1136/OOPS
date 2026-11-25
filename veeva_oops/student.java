class student {
    private String name;
    private int age;
    private int rollNo;

    public void displayDetails(){
        System.out.println("Name: " + this.name + ", Age: " + this.age + ", Roll No: " + this.rollNo);

    }
    public student(String name,int age,int rollNo){
        this.name = name;
        this.age=age;
        this.rollNo=rollNo;
    }
    public static void main(String[] args){
        student s1 = new student("Praneeth",20,1);
        student s2 = new student("Bhanu",19,2);
        student s3 = new student("Sri",18,3);

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();

    }
}


class Employee{
    int id;
    String name;
    int age;
    public Employee(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public Employee(){
        this.name="Not assigned";
        this.id=2;
        this.age=20;

    }
    public Employee(int age){
        this.age=age;
    }
    public Employee(int id,int age){
        this.id=id;
        // this.name=name;
        this.age=age;
    }

    public void displayDetails() {
        System.out.println("ID: " + this.id + " | Name: " + this.name + " | Age: " + this.age);
    }

    public static void main(String args[]){
        Employee e1 = new Employee(1,"Praneeth",12);
        Employee e2 = new Employee();
        Employee e3 = new Employee(12);
        Employee e4 = new Employee(2,30);

        e2.displayDetails();
        e1.displayDetails();
        e3.displayDetails();
        e4.displayDetails();
    }
}


class Product{
    int price;
    String name;
    int id;

    public Product(int price,String name,int id){
        this.price=price;
        this.name=name;
        this.id=id;
    }
    public void displayDetails() {
        System.out.println("Price: " + this.price + " | Name: " + this.name + " | id: " + this.id);
    }
    public static void main(String[]args){
        Product p1 = new Product(20,"Soap",2);
        p1.displayDetails();
    }
}