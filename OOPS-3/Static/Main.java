package Static;


class Student{
    int rno;
    String name;
    boolean married;


    Student(){
        this.rno = 13;
        this.name = "Praneeth";
        this.married = false;
    }
    Student (int rno,String name, boolean married){
        this.rno = rno;
        this.name = name;
        this.married = married;
    }
}

class Human{
    int age;
    String name;
    static int population;


    Human(){
        this.age = 10;
        this.name = "Pop";
        Human.population = 21;
    }
}

class StaticBlock{
    static int a = 5;
    static int b = 8;
    
    static{
        System.out.println("Im in a staic Block");
        b = a *5;
    }
}


class InnerClass{
    static class Test{
        String name;
        Test(String name){
            this.name = name;
        }
        
    }
}

public class Main {
    public static void main(String[] args){
        Student stu = new Student();
        Student stu1 = new Student(14,"bhanu",true);
        stu.name = "Praneeth";
        // System.out.println(stu.rno);
        // System.out.println(stu.name);
        // System.out.println(stu1.name);

        Human human = new Human();


        // System.out.println(Human.population);
        Main obj = new Main();
        // obj.greeting();

        // greeting();


        StaticBlock block = new StaticBlock();
        // System.out.println(block.a);

        InnerClass.Test test = new InnerClass.Test("Praneeth");
        System.out.println(test.name);
    

    }
     void greeting(){
        System.out.println("Hello");
    }


    
}
