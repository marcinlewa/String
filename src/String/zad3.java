package String;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String word = scanner.next();
        if (word.endsWith("m")) {
            System.out.println("Tak");
        }
        if (word.endsWith("M")){
            System.out.println("Tak");
        }
        else {
            System.out.println("Nie");
        }

    }
}
