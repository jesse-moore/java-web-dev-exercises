package studios.areaofacircle;
import java.util.Scanner;

public class Area {

    public static void main(String[] args){
        double radius = -1;
        boolean isNumber = false;
        boolean isPositive = false;
        String userInput;
        Scanner input;

        input = new Scanner(System.in);

        while(!isNumber && !isPositive){
            System.out.println("Enter a radius: ");
            if(input.hasNextDouble()){
                radius = input.nextDouble();
                isNumber = true;
                isPositive = radius >=0;
            } else {
                input.close();
                isNumber = false;
                isPositive = false;
            }

//            System.out.println(isNumber + " " + isPositive);
        }

        input.close();
        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }


//    private static boolean isNumber()
}
