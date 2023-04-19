package desafio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        int x = 0;
        int y = 1;
        int z;
        List<Integer> fibonacci = new ArrayList<>();

        for(int i = 0; i < 40; i++){
            fibonacci.add(x);
            z = x;
            x = x + y;
            y = z;
        }

        if(fibonacci.contains(numero)){
            System.out.println("O número pertence à sequência!");
        }else {
            System.out.println("O número NÃO pertence à sequência!");
        }

        sc.close();
    }
}

