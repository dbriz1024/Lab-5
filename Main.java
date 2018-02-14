import java.util.Scanner;
public class Main {

    public static void main(String args[]) {
        //int A, a = 10, B, b = 11, int C, c = 12, int D, d = 13, int E, e = 14, int F, f = 15;
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String s = scnr.next();
        int index = 0;
        double hex;
        long total = 0;

        if (s.charAt(0) == '0' && s.charAt(1) == 'x') {
            index += 2;
        }

        while (index < s.length()) {

            if (s.charAt(index) == 'A' || s.charAt(index) == 'a') {
                double value = Math.pow(16, s.length()-index-1);
                hex  = value * 10;
                total += hex;
            }
            else if (s.charAt(index) == 'B' || s.charAt(index) == 'b'){
                double value = Math.pow(16, s.length()-index-1);
                hex = value * 11;
                total += hex;
            }
            else if (s.charAt(index) == 'C' || s.charAt(index) == 'c') {
                double value = Math.pow(16, s.length()-index-1);
                hex = value * 12;
                total += hex;
            }
            else if (s.charAt(index) == 'D' || s.charAt(index) == 'd') {
                double value = Math.pow(16, s.length()-index-1);
                hex = value * 13;
                total += hex;
            }
            else if (s.charAt(index) == 'E' || s.charAt(index) == 'e') {
                double value = Math.pow(16, s.length()-index-1);
                hex = value * 14;
                total += hex;
            }
            else if (s.charAt(index) == 'F' || s.charAt(index) == 'f') {
                double value = Math.pow(16, s.length()-index-1);
                hex = value * 15;
                total += hex;
            }
            else if (s.charAt(index) == '0') {
                double value = Math.pow(16, s.length()-index-1);
                hex = value * 0;
                total += hex;
            }
            else if (s.charAt(index) == '1') {
                    double value = Math.pow(16, s.length()-index-1);
                    hex = value * 1;
                    total += hex;
            }
            else if (s.charAt(index) == '2') {
                double value = Math.pow(16, s.length()-index-1);
                hex = value * 2;
                total += hex;
            }
            else if (s.charAt(index) == '3') {
                double value = Math.pow(16, s.length()-index-1);
                hex = value * 3;
                total += hex;
            }
            else if (s.charAt(index) == '4') {
                double value = Math.pow(16, s.length()-index-1);
                hex = value * 4;
                total += hex;
            }
            else if (s.charAt(index) == '5') {
                double value = Math.pow(16, s.length()-index-1);
                hex = value * 5;
                total += hex;
            }
            else if (s.charAt(index) == '6') {
                double value = Math.pow(16, s.length()-index-1);
                hex = value * 6;
                total += hex;
            }
            else if (s.charAt(index) == '7') {
                double value = Math.pow(16, s.length()-index-1);
                hex = value * 7;
                total += hex;
            }
            else if (s.charAt(index) == '8') {
                double value = Math.pow(16, s.length()-index-1);
                hex = value * 8;
                total += hex;
            }
            else if (s.charAt(index) == '9') {
                double value = Math.pow(16, s.length()-index-1);
                hex = value * 9;
            }
            else {
                double value = Math.pow(16, s.length()-index-1);
                hex = s.charAt(index) * value;
                total += hex;

            }

            index++;
        }

        System.out.println("Your number is " + total + " in decimal");



    }
}# Lab-5
#Lab-5
