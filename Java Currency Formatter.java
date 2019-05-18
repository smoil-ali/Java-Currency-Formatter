import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        Locale lc=new Locale("en","IN");
        NumberFormat one=NumberFormat.getCurrencyInstance(Locale.US);
        String us=one.format(payment);
        NumberFormat two=NumberFormat.getCurrencyInstance(lc);
        String india=two.format(payment);
        NumberFormat three=NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china=three.format(payment);
        NumberFormat four=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france=four.format(payment);

        
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

