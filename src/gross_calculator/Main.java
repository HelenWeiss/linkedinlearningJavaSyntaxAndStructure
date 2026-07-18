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

        //You can edit this code to try different testing cases.
        int numOfPennies = 10;
        int numOfNickels = 3;
        int numOfDimes = 5;
        int numOfQuarters = 1;
        boolean resultA = DollarGame.isADollar(numOfPennies, numOfNickels, numOfDimes, numOfQuarters);
        System.out.println(resultA);

        boolean resultB = DollarGame.isADollar(0, 8, 2, 2);
        System.out.println(resultB);

    }
}
