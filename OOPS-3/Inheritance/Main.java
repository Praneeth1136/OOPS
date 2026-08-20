package Inheritance;
public class Main {
    public static void main(String[] args){
        Box box = new Box();
        Box box2 = new Box(box);
        
        BoxWeight weigh = new BoxWeight();
        BoxWeight weigh1 = new BoxWeight(1,2,3,5);

        // System.out.println(box.l+" "+box.w);
        // System.out.println(box2.l);
        System.out.println(weigh1.w);

    //     Box box3 = new BoxWeight(1,2,3,4);
    //     System.out.println(box3.weight);

    //     BoxWeight box4 = new Box(1,2,3);
    //     System.out.println(box4.l);
    // }
    }
}
