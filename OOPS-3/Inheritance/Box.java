package Inheritance;
public  class Box {
    double l;
    double w;
    double h;


    Box(){
        this.h = -2;
        this.l = -4;
        this.w = -2;

    }

    Box(double l,double w,double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(double side){
        this.w = side;
        this.h = side;
        this.l = side;
    }
    Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }
}