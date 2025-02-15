package com.mycompany.tugas2c;

public class Tugas2c {
    public static void main(String[] args) {
        
        char a = '4';
        char b = '6';

        int asciiChar1 = (int) a;
        int asciiChar2 = (int) b;

        int jumlahAscii = asciiChar1 + asciiChar2;

        System.out.println("Kode ASCII karakter '4': " + asciiChar1);
        System.out.println("Kode ASCII karakter '6': " + asciiChar2);
        System.out.println("Jumlah kode ASCII: " + jumlahAscii);
    }
}
