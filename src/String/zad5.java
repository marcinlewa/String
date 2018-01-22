package String;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Podaj wyraz");
        String word = scanner.next();
        if (word.charAt(0) == word.charAt(word.length() - 1)){
            System.out.println("Podany wyraz ma takie same znaki na koncu i początku");
        }
        else {
            System.out.println("Znaki na końcu i początku wyrazu różnią się");
        }
    }
}
