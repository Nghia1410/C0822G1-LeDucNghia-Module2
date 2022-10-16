package ss8_clean_code_and_refactoring.practice.split_variable;

public class FizzBuzz {
    public static String fizzBuzz(int number) {
        boolean num1 = number % 3 == 0;
        boolean num2 = number% 5 == 0;
        if (num1 && num2)
            return "FizzBuzz";

        if (number % 3 == 0)
            return "Fizz";

        if (number % 5 == 0)
            return "Buzz";

        return number + "";
    }
}
