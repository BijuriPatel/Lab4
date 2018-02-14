import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner userInput = new Scanner(System.in);
        String hexNum; //hexadecimal number
        int inverse; //variable for the power of 16 because the place starts with 1 but the power of 16 starts with 0
        long decNum = 0; //decimal number
        int numLength; //length of number
        int x = 0; //greater than x because numLength needs to ignore the 0 and x in the beginning
        char numPlace; //location or place of number

        System.out.print("Enter a hexadecimal number: ");
        hexNum = userInput.next();
        hexNum = hexNum.toLowerCase();
        if (hexNum.substring(0, 2).equals("0x")) {
            hexNum = hexNum.replace("0x", "");
        }
        numLength = hexNum.length();
        inverse = hexNum.length() - 1;
        while (numLength > x) {
            numPlace = hexNum.charAt(x);
            if (numPlace == '0') {
                decNum += 0 * Math.pow(16.0, inverse);
            }
            else if (numPlace == '1') {
                decNum += 1 * Math.pow(16.0, inverse);
            }
            else if (numPlace == '2') {
                decNum += 2 * Math.pow(16.0, inverse);
            }
            else if (numPlace == '3') {
                decNum += 3 * Math.pow(16.0, inverse);
            }
            else if (numPlace == '4') {
                decNum += 4 * Math.pow(16.0, inverse);
            }
            else if (numPlace == '5') {
                decNum += 5 * Math.pow(16.0, inverse);
            }
            else if (numPlace == '6') {
                decNum += 6 * Math.pow(16.0, inverse);
            }
            else if (numPlace == '7') {
                decNum += 7 * Math.pow(16.0, inverse);
            }
            else if (numPlace == '8') {
                decNum += 8 * Math.pow(16.0, inverse);
            }
            else if (numPlace == '9') {
                decNum += 9 * Math.pow(16.0, inverse);
            }
            else if (numPlace == 'a') {
                decNum += 10 * Math.pow(16.0, inverse);
            }
            else if (numPlace == 'b') {
                decNum += 11 * Math.pow(16.0, inverse);
            }
            else if (numPlace == 'c') {
                decNum += 12 * Math.pow(16.0, inverse);
            }
            else if (numPlace == 'd') {
                decNum += 13 * Math.pow(16.0, inverse);
            }
            else if (numPlace == 'e') {
                decNum += 14 * Math.pow(16.0, inverse);
            }
            else if (numPlace == 'f') {
                decNum += 15 * Math.pow(16.0, inverse);
            }
            else {
            }
            inverse--;
            x++;
        }
        System.out.println("Your number is " + decNum + " in decimal");
    }
}