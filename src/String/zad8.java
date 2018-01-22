package String;

import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszy wyraz");
        String word1 = scanner.next();
        System.out.println("Podaj drugi wyraz");
        String word2 = scanner.next();
        if (word1.equals(word2)){
            System.out.println("Podane wyrazy są takie same");
        }
        else {
            System.out.println("Podane wyrazy różnią się");
        }

    }
}
