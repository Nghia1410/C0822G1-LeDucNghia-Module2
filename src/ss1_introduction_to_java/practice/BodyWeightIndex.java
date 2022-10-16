package thuc_hanh;

import java.util.Scanner;

public class BodyWeightIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Your weight (in kilogram):");
        weight = scanner.nextDouble();

        System.out.print("Your height (in meter):");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.println("bmi" + " Interpretation");
        if (bmi < 18)
            System.out.println(bmi + "  Underweight");
        else if (bmi < 25.0)
            System.out.println(bmi + "  Normal");
        else if (bmi < 30.0)
            System.out.println(bmi + "  Overweight");
        else
            System.out.println(bmi + "  Obese");
    }
}
