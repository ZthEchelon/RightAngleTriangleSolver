import java.util.Scanner;

public class RightAngleTriangleSolver{
    public static void main(String [] args){


        double a;
        double b;
        double c;

        Scanner input = new Scanner(System.in);

        System.out.println("If value is unknown put 0");

        System.out.println("Enter value for a");
        a= input.nextDouble();
        System.out.println("Enter value for b");
        b = input.nextDouble();
        System.out.println("Enter value for c");
        c= input.nextDouble();

        //check how to handle if person doesnt put number


        if (c==0){

            System.out.println("The answer is " +  Math.sqrt(a*a+b*b));
        }
        else if (a==0){

            System.out.println("The answer is " + Math.sqrt(c*c-b*b));
        }
        else if (b==0){

            System.out.println("The answer is " + Math.sqrt(c*c-a*a));
        }
        input.close();



        /* 

        result = Math.pow (2, 5); // raise a to power of b

        result = Math.abs(-5); //gives absolute of value

        result = Math.sqrt(9) ;


        result = Math.round (5.5);

        result = Math.ceil(3.14); // rounds always up also Math.floor always rounds down

        result = Math.max(10,20) // has same thing Math.min

        */

        





    }
}
