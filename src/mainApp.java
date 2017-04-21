import java.util.Scanner;

/**
 * Calculate a square and triangle's perimeter and area
 *
 * @author Michael Riley
 * @author Marin Bizbiqi
 * @author  Sarah Guarino
 */
public class mainApp {
    public static void main(String[] args) {
        Square mySquare = new Square();
        Triangle myTriangle = new Triangle();
        Scanner scan = new Scanner (System.in);
        String userInput;

        double s1;
        double s2;
        double s3;

        do {

            // CALCULATE SQUARE
            System.out.print("Enter the side length of a square: ");
            s1 = scan.nextDouble();

            System.out.println("The square has a side length of " + s1
                    + ". Its area is " + mySquare.calculateArea(s1)
                    + " and its perimeter is " + mySquare.calculatePerimeter(s1) + ".");
            scan.nextLine();

            System.out.println("Enter the side lengths of the triangle: ");
            s1 = scan.nextDouble();
            s2 = scan.nextDouble();
            s3 = scan.nextDouble();

            // CALCULATE TRIANGLE

            System.out.println("A triangle with side lengths of "
                    + s1 + ", " + s2 + ", and " +  s3
                    +  " has a perimeter of " + myTriangle.calculatePerimeter(s1, s2, s3)
                    + " and an area of " + myTriangle.calculateArea(s1, s2, s3) + ".");
            scan.nextLine();

            System.out.println("Would you like to continue: (y/n) " );
            userInput = scan.nextLine();
        } while(Character.toString(userInput.charAt(0)).equalsIgnoreCase("y"));

    }

}
