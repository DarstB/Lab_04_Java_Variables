public class Main {
    public static void main(String[] args) {
        //int variables
        int intOperandA = 1;
        int intOperandB = 9;
        int intSum = intOperandA + intOperandB;
        int intProduct = intOperandA * intOperandB;
        int intDifference = intOperandA - intOperandB;
        int intQuotient = intOperandA / intOperandB;
        int intModulo = intOperandA % intOperandB;

        //double variables
        double doubleOperandA = 3.50;
        double doubleOperandB = 9.25;
        double doubleSum = doubleOperandA + doubleOperandB;
        double doubleProduct = doubleOperandA * doubleOperandB;
        double doubleDifference = doubleOperandA - doubleOperandB;
        double doubleQuotient = doubleOperandA / doubleOperandB;

        //int operations
        System.out.println("The sum of using ints of " + intOperandA + " + " + intOperandB + " is " + intSum);
        System.out.println("The product of using ints of " + intOperandA + " * " + intOperandB + " is " + intProduct);
        System.out.println("The difference of using ints of " + intOperandA + " - " + intOperandB + " is " + intDifference);
        System.out.println("The quotient of using ints of " + intOperandA + " / " + intOperandB + " is " + intQuotient);
        System.out.println("The modulus of using ints of " + intOperandA + " % " + intOperandB + " is " + intModulo + "\n");

        //double operations
        System.out.println("The sum of using doubles of " + intOperandA + " + " + intOperandB + " is " + doubleSum);
        System.out.println("The product of using doubles of " + intOperandA + " * " + intOperandB + " is " + doubleProduct);
        System.out.println("The difference of using doubles of " + intOperandA + " - " + intOperandB + " is " + doubleDifference);
        System.out.println("The quotient of using doubles of " + intOperandA + " / " + intOperandB + " is " + doubleQuotient + "\n");

        //variables
        double costOfLunch = 12.50;
        int numOfKids = 2;
        String isRaining = "No";
        double gasPrice = 3.29;
        int favNumber = 14;
        int shoeSize = 11;
        String birthMonth = "November";
        String fullName = "Braden Darst";

        //outputs
        System.out.println("The cost of my lunch was $" + costOfLunch);
        System.out.println("The number of kids in my family is " + numOfKids);
        System.out.println("Is it raining today: " + isRaining);
        System.out.println("The price of gas is $" +gasPrice);
        System.out.println("My favorite number is " + favNumber);
        System.out.println("My shoe size is " + shoeSize);
        System.out.println("My birth month is " + birthMonth);
        System.out.println("My full name is " + fullName);

    }
}