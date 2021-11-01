package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input
        double angle_1 = scanner.nextDouble();
        double angle_2 = scanner.nextDouble();
        double angle_3 = scanner.nextDouble();

        //Calculations
        String output = "";
        if (angle_1 + angle_2 + angle_3 <= 180) {
            if (angle_1 < 90 && angle_2 < 90 && angle_3 < 90) {
                output = "The triangle is acute.";
            } else if (angle_1 == 90 || angle_2 == 90 || angle_3 == 90) {
                output = "The triangle is right-angled.";
            } else if (angle_1 > 90 || angle_2 > 90 || angle_3 > 90) {
                output = "The triangle is obtuse.";
            }
        } else {
            output = "The triangle is not possible. Please enter new angles";
        }

        if (!output.equals("The triangle is not possible. Please enter new angles")) {
            if (angle_1 == 60 && angle_2 == 60) {
                output = output.concat(" The triangle is equilateral.");
            }
            else if ((angle_1 == angle_2) || (angle_1 == angle_3) || (angle_2 == angle_3)) {
                output = output.concat(" The triangle is isosceles.");
            }
            else if ((angle_1 != angle_2) && (angle_1 != angle_3) && (angle_2 != angle_3)) {
                output = output.concat(" The triangle is multifaceted.");
            }
        }

        //Printing
        System.out.println(output);
    }
}
