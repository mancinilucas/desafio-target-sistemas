package desafio5;

import java.util.Scanner;

public class desafio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a palavra que você deseja inverter: ");

        String word = sc.nextLine().toUpperCase();
        String reversedWord = "";

        for(int i = word.length() - 1; i >= 0; i--){
            reversedWord = reversedWord + Character.toString(word.charAt(i));
        }
        System.out.println(reversedWord);

        sc.close();
    }
}
