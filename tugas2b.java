package com.mycompany.tugas2b;

import java.util.Scanner;

public class Tugas2b {

    public static void main(String[] args) {
        Scanner objekInput = new Scanner(System.in);
        System.out.print("Masukkan jumlah uang: ");
        
        int uang = objekInput.nextInt();

        boolean lebihDari10000 = uang > 10000;
        System.out.println("Saya akan pergi ke mie gacoan: " + lebihDari10000);

        System.out.print("Apakah Anda tidak ada kelas kuliah? ");
        
        boolean tidakAdaKelas = objekInput.nextBoolean();

        boolean kuliah = !tidakAdaKelas;
        System.out.println("Saya tidak ada kelas kuliah: " + kuliah);
    }
}
