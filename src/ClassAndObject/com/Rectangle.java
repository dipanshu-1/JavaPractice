package ClassAndObject.com;

import java.util.Scanner;

public class Rectangle {
    private int length=0;
    private int breadth=0;

    Rectangle(int l, int b){
        this.length=l;
        this.breadth=b;
    }
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }

    public static void main(String[] args) {


    }
}
