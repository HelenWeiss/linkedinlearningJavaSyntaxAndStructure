package gross_calculator;

public class CalculateNumbers {

    static double calculateNumbers(int firstNumber, int secondNumber) {
        double result = 0;

        result = add(firstNumber, secondNumber);
        result = subtract(result, secondNumber);
        result = multiply(result, firstNumber);
        result = divide(result, secondNumber);

        return result;
    }

    static double add(double num1, double num2){
        // TODO: Your code goes here
        double sum = num1 + num2;
        return sum;
    }

    static double subtract(double num1, double num2){
        // TODO: Your code goes here
        double subtract = num1 - num2;
        return subtract;
    }

    static double multiply(double num1, double num2){
        // TODO: Your code goes here
        double multiply = num1 * num2;
        return multiply;
    }

    static double divide(double num1, double num2){
        // TODO: Your code goes here
        double divide = num1 / num2;
        return divide;
    }

}
