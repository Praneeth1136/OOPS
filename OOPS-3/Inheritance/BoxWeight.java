package Inheritance;
public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight = -10;
    }
    public BoxWeight(double l,double w,double h,double weight){
        super(l,w,h);
        this.weight = weight;
    }
}
