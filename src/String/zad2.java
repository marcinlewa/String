package String;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wyraz");
        String word = scanner.next();
        System.out.println("Podaj liczbę ostatnich znaków");
        int lastSign = scanner.nextInt();
        System.out.println(word.substring(word.length() -lastSign));


    }
}
