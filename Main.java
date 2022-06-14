
public class Main {

    static Scanner keyboard = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("00.00");

    // Method to read in and return an integer
    public static int readInteger(String text) {
        System.out.println("Enter " + text);
        return keyboard.nextInt();
    }//readInteger

    // Method which accepts an integer and return 3 times the integer
    public static int multiplyBy3(int num) {
        return num * 3;
    }//multiplyBy3

    // Method to accept a number and return the number plus 1
    public static int addOne(int num) {
        num++;
        return num;
    }//sum

    // Method to accept 3 numbers and return their product
    public static int product(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }//product

    // Method to accept 3 integers (yards, feet, inches) and return equivalent metres
    public static double convertToMetres(int yards, int feet, int inches) {
        final int INCHINFOOT = 12;
        final int FOOTINYARD = 3;
        final double INCHINMETRE = 39.39;
        int totalInches;

        totalInches = (yards * INCHINFOOT * FOOTINYARD) + (feet * INCHINFOOT) + inches;
        return totalInches / INCHINMETRE;
    }//convertToMetres

    // Method to accept an integer and return the equivalent word
    public static String convertToWords(int num) {
        String text = "";

        switch (num) {
            case 0:
                text = "zero";
                break;
            case 1:
                text = "one";
                break;
            case 2:
                text = "two";
                break;
            case 3:
                text = "three";
                break;
            case 4:
                text = "four";
                break;
            case 5:
                text = "five";
                break;
            case 6:
                text = "six";
                break;
            case 7:
                text = "seven";
                break;
            case 8:
                text = "eight";
                break;
            case 9:
                text = "nine";
                break;
        }//switch
        return text;
    }//convertToWords

    public static void main(String[] args) {
        int number1, number2, number3, answer;
        double metres;
        String numberInWords;

        System.out.println("Testing multiplyBy3()");
        System.out.println("*********************");
        number1 = readInteger("a number: ");
        answer = multiplyBy3(number1);
        System.out.println(number1 + " multiplied by 3 = " + answer + "\n");

        System.out.println("Testing addOne()");
        System.out.println("*************");
        number1 = readInteger("a number: ");
        answer = addOne(number1);
        System.out.println(number1 + " + 1 = " + answer + "\n");

        System.out.println("Testing product()");
        System.out.println("*****************");
        number1 = readInteger("first number: ");
        number2 = readInteger("second number: ");
        number3 = readInteger("third number: ");
        answer = product(number1, number2, number3);
        System.out.println(number1 + " * " + number2 + " * " + number3 + " = " + answer + "\n");

        System.out.println("Testing convertToMetres()");
        System.out.println("*************************");
        number1 = readInteger("yards: ");
        number2 = readInteger("feet: ");
        number3 = readInteger("inches: ");
        metres = convertToMetres(number1, number2, number3);
        System.out.println(number1 + " yards, " + number2 + " feet, " + number3 + " inches = " + df.format(metres) + " metres\n");

        System.out.println("Testing convertToWords()");
        System.out.println("************************");
        number1 = readInteger("a number: ");
        numberInWords = convertToWords(number1);
        System.out.println(number1 + " = " + numberInWords + "\n");

    }//main
}//class
