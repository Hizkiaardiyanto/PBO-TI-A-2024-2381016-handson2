package latihanSoal;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Angka ke-1: ");
        int angka1 = input.nextInt();

        System.out.println("Masukkan Angka ke-2: ");
        int angka2 = input.nextInt();

        System.out.println("Masukkan Angka ke-3: ");
        int angka3 = input.nextInt();

        if (angka1 > angka2 && angka1 > angka3){
            System.out.println("Angka Terbesar " + angka1);
        } else if (angka2 > angka1 && angka2 > angka3){
            System.out.println("Angka Terbesar " + angka2);
        } else {
            System.out.println("Angka Terbesar " + angka3);
        }
        //Mencari nilai Maksimum dari 3 bilangan
    }
}
