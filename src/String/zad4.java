package String;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String word = scanner.next();
        if (Character.isDigit(word.charAt(0))){
            System.out.println("Pierwszy znak jest cyfrą");
        }
        else{
            System.out.println("Pierwszy znak nie jest cyfrą");
        }
    }
}
