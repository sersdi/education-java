package examples;

public class Rect {
    double length;
    double width;
    void setDimens(double length, double width){
        this.length = length;
        this.width = width;

    }
    double ploshad(){
        return 0.5*width*length;
    }

}


