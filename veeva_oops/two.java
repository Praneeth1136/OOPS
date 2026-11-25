public class two {
    private int id;
    private int age;

    two(int id,int age){
        this.id=id;
        this.age=age;
    }
    void updateId(int id){
        this.id=id;
    }
    void display(){
        System.out.println("ID: "+this.id+" Age: "+this.age);
    }
    static void main(String[]args){
        two t1 = new two(12,3);
        t1.display();

        t1.updateId(2232);
        t1.display();
    }
}


class Counter{
    private int count=0;
    public Counter(){
        count++;
    }

    int getCount(){
        return count;
    }

    public static void main(String[] args){
        Counter c1 = new Counter();
        System.out.print(c1.getCount());
    }

}

// class Bank{
//     int principal;
//     int rate;
//     int time;

//     int interest(int p,int r,int t){
//         return (p*t*r)/100;
//     }

//     static void main(String[] args){
//         Bank b1 = new Bank();
//         System.out.println(b1.interest(10,10,10));
//     }
// }


class bank{
    static double rate=7.5;
    int principle;
    int time;

    bank(int principle,int time){
        this.principle=principle;
        this.time=time;
    }
    double calcInterest(){
        return (this.principle*rate*this.time)/100;
    }
    static void main(String[] args){
        bank b1 = new bank(1000,2);
        System.out.println(b1.calcInterest());
    }
}


class Box {
    static int sharedCount = 0;
    int individualCount = 0;

    public Box() {
        sharedCount++;
        individualCount++;
    }

    public void show() {
        System.out.println("sharedCount = " + sharedCount + ", individualCount = " + individualCount);
    }

    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box();
        Box b3 = new Box();

        b1.show();
        b2.show();
        b3.show();
    }
}