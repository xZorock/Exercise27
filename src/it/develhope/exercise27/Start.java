package it.develhope.exercise27;

public class Start {
    public static void main(String[] args) {
        //Variables declaration for the boolean expression 'A' and 'B'

        int a = 1;
        int b = 3;
        int c = a * b;
        int d = c;
        int x = 5;
        int y = 6;
        boolean f = true;
        boolean t = false;

        boolean A = (d / c + 2) >= b || !(c + b - c / a == 3); /* First condition is true and the second is false but
                                                                    with boolean operator OR ||
                                                                    the boolean expression result is true */
        boolean B = (x * x - y * y / 2 != 12) || !t && f; /* all the conditions are true (we need just 1) so the
                                                                    boolean expression result is true */
    }
}
