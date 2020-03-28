package exercises.LC_Runthrough4.I;

public class Caluculations_Test {

    public static void main (String[] args){
        double radious = 10;
        Calculations_Share area = new Calculations_Share();

        System.out.println("area of circle - " + area.areaOfCircle(radious));

        double width = 5;
        double length = 5;
        System.out.println("area of rectangle - " + area.areaOfRectangle(length,width));
        double depth = 5;
        System.out.println("area of Cube - " + area.areaOfCube(length,width, depth));



    }

}
