import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String args[]) {

        int[] sides = new int[3];

        String[] ordinals = new String[]{"side1", "side2", "side3"};

        Scanner input = new Scanner(System.in);
        for (int i=0; i<3; i++) {
            System.out.println("Input " + ordinals[i] + " of the triangle:");
            sides[i] = input.nextInt();
            while (sides[i]<=0) {
                System.out.println("negative or '0' value not allowed.");
                System.out.println("Input " + ordinals[i] + " of the triangle:");
                sides[i] = input.nextInt();
            }
        }
        Arrays.sort(sides);

        //First we need to know if the triangle can exist given the inputs
        if (sides[0]+sides[1]<=sides[2]) {
            System.out.println("The Triangle is False!");
            return;
        }
        System.out.println("The triangle is true!");

        //we determine triangle type using Pythagorean Theorem.
        int diff = sides[0]*sides[0] + sides[1]*sides[1] - sides[2]*sides[2];

        System.out.print("The Triangle is...");

        if (diff==0) {
            System.out.print("Right, ");
        } else if (diff < 0) {
            System.out.print ("Acute, ");
        } else {
            System.out.print ("Obtuse, ");
        }

        if ((sides[0]) == (sides[1]) && (sides[1]) == (sides[2])) {
            System.out.println("equilateral");
        } if ((sides[0]) == (sides[1]) && (sides[1]) != (sides[2])) {
            System.out.println("isosceles");
        } if ((sides[0]) != (sides[1]) && (sides[1]) == (sides[2])) {
            System.out.println("isosceles");
        } if ((sides[0]) == (sides[2]) && (sides[1]) != (sides[2])) {
            System.out.println("isosceles");
        } if ((sides[0]) != (sides[1]) && (sides[1]) != (sides[2])) {
            System.out.println("scalene");
        }

        //Optional: area of triangle
        int area = (sides[0] * sides[1]) /2;
        System.out.println("The area of triangle is: " + area);
    }
}