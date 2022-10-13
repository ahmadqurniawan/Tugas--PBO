package com;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.sound.sampled.SourceDataLine;

public class PBO1 {
    public static void main(String[] args){
        //program array 2 dimensi
        int jumlahBaris, jumlahKolom; // variabel dan tipe data
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Jumlah indeks baris martriks : ");
        jumlahBaris = scanner.nextInt();
        System.out.print("Masukan Jumlah indeks kolom martriks : ");
        jumlahKolom = scanner.nextInt();
        Integer[][] array = new Integer[jumlahBaris][jumlahKolom];

        for (int i = 0; i < jumlahBaris; i++) {
            for (int j = 0; j < jumlahKolom; j++) {
                System.out.print("Masukan isi indeks beris ke " + i + " kolom ke "+j+":");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println();
        System.out.println("berikut adalah isi array yang tadi dimasukan:");
        for (int i = 0; i < jumlahBaris; i++) {
            for (int j = 0; j < jumlahKolom; j++) {
                System.out.println("Isi indeks baris ke " + i + " kolom ke "+j+" adalah :" + array[i][j]);
            }
        }
         System.out.println();
        System.out.println("Bentuk matriks:");
        for (int i = 0; i < jumlahBaris; i++) {
            for (int j = 0; j < jumlahKolom; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    
        System.out.println();

        // array 1 dimensi
        int angka[]={10,20,30,40,50};
        int b;
        System.out.println("Hasil array 1 dimensi");
        for(b=0;b<5;b++){
            System.out.println("Cetak angka "+ angka[b]);
        }
        //while do while
        System.out.println();
        int a=1;
        while(a<1){
            System.out.println("Belajar bahasa java");
            a++;
        }
        do{
            System.out.println("Belajar bahasa java");
            a++;
        }while(a<1);

        // percabangan if else
        int nilai;
        System.out.print("Input nilai anda (0-100): ");
        nilai = scanner.nextInt();
        if(nilai >= 90){
            System.out.println("A");
        }
        else if (nilai >= 80 && nilai < 90) {
            System.out.println("B");
          }
          else if (nilai >= 60 && nilai < 80) {
            System.out.println("C");
          }
          else if (nilai >= 40 && nilai < 60) {
           System.out.println("D");
          }
          else if (nilai < 40) {
            System.out.println("E");
          }
          else {
            System.out.println("Maaf, format nilai tidak sesuai");
          }
    
    }
}

    
    
    
