package latihanSoal;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        int[] bilangan = new int [2];
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Bilangan Pertama");
        bilangan[0] = input.nextInt();

        System.out.println("Masukkan Bilangan kedua : ");
        bilangan[1] = input.nextByte();

        if (bilangan[1] > bilangan[0]) {
            System.out.println(bilangan[1]);
        } else {
            System.out.println(bilangan[0]);
        }
    }
}
