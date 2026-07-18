package gross_calculator;

public class Main {

    public static void main (String[] args) {

        // Practice: class GrossPayCalculator
/*
        // Option 1 to call class GrossPayCalculator
        //GrossPayCalculator.main(args);
        //GrossPayCalculator.main(new String[0]);

        // Option 2 to call class GrossPayCalculator
        // !only if the Method is static in class! public static double calculateGrossPay(int hours, double payRate)
        double grossPayA = GrossPayCalculator.calculateGrossPay(20, 20.5);
        System.out.println("Gross pay: " + grossPayA);

        // Option 3 to call class GrossPayCalculator
        // if the Method without KeyWord static: public  double calculateGrossPay(int hours, double payRate)
        GrossPayCalculator calculator = new GrossPayCalculator();
        double grossPayB = calculator.calculateGrossPay(40, 21.5);
        System.out.println("Gross pay: " + grossPayB);
*/

        // Practice: class Blank
/*
        Blank.fillInTheBlank("winter", 4, "cold");
        Blank.fillInTheBlank("summer", 0, "rainy");
 */

        //Practice: SalaryCalculator
/*
        // Option 1 to call class GrossPayCalculator
        //SalaryCalculator.main(args);

        // Option 2 to call class GrossPayCalculator
        SalaryCalculator salaryCalculatorA = new SalaryCalculator();
        int salaryA  = salaryCalculatorA.calculateSalary(9);
        System.out.println(salaryA);

        SalaryCalculator salaryCalculatorB = new SalaryCalculator();
        int salaryB  = salaryCalculatorB.calculateSalary(40);
        System.out.println(salaryB);
*/

        // Practice: class TestResults
/*
        TestResults resultTestA = new TestResults();
        char gradeA = resultTestA.gradeScore(95.00);
        System.out.println(gradeA);

        TestResults resultTestB = new TestResults();
        char gradeB = resultTestA.gradeScore(88.00);
        System.out.println(gradeB);

        TestResults resultTestD = new TestResults();
        char gradeD = resultTestA.gradeScore(59.00);
        System.out.println(gradeD);
*/

        // Practice: class GradeMessage
/*
        // Option 1 to call class GradeMessage
        GradeMessage.main(args);

        // Option 2 to call class GradeMessage
        GradeMessage messageGradeA = new GradeMessage();
        String messageA = messageGradeA.gradeMessage("A");
        System.out.println(messageA);

        GradeMessage messageGradeF = new GradeMessage();
        String messageF = messageGradeF.gradeMessage("F");
        System.out.println(messageF);
*/

        // Practice: class DollarGame
/*
        //You can edit this code to try different testing cases.
        int numOfPennies = 10;
        int numOfNickels = 3;
        int numOfDimes = 5;
        int numOfQuarters = 1;
        boolean resultA = DollarGame.isADollar(numOfPennies, numOfNickels, numOfDimes, numOfQuarters);
        System.out.println(resultA);

        boolean resultB = DollarGame.isADollar(0, 8, 2, 2);
        System.out.println(resultB);
*/

        // Practice: class GrossPayInputValidator (while loop)
/*
        // Option 1 to call class GrossPayInputValidator
        GrossPayInputValidator.main(args);

        // Option 2 to call class GrossPayInputValidator
        // if the Method without KeyWord static: public int validateGrossPayInput(int payRate, int maxHours, int hoursWorked)

        GrossPayInputValidator validateGrossPayInputA = new GrossPayInputValidator();
        int validationA = validateGrossPayInputA.validateGrossPayInput(32, 40, 39);
        System.out.println(validationA);

        GrossPayInputValidator validateGrossPayInputB = new GrossPayInputValidator();
        int validationB = validateGrossPayInputB.validateGrossPayInput(32, 40, 40);
        System.out.println(validationB);

        GrossPayInputValidator validateGrossPayInputC = new GrossPayInputValidator();
        int validationC = validateGrossPayInputC.validateGrossPayInput(32, 40, 41);
        System.out.println(validationC);

        GrossPayInputValidator validateGrossPayInputD = new GrossPayInputValidator();
        int validationD = validateGrossPayInputD.validateGrossPayInput(32, 40, 0);
        System.out.println(validationD);

        GrossPayInputValidator validateGrossPayInputE = new GrossPayInputValidator();
        int validationE = validateGrossPayInputE.validateGrossPayInput(32, 40, 1);
        System.out.println(validationE);
*/

        // Practice: class AddNumbers  (do while loop)
        //AddNumbers.main(args);

        // Practice: Cashier (for loop)
        Cashier.main(args);
    }
}
