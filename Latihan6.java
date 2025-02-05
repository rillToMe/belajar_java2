package com.Belajar;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Latihan6 {
    public static void main(String[] args) throws IOException {
        String nama;
        int umur;
        //Membuat Object inputStream
        InputStreamReader isr = new InputStreamReader(System.in);
        //Membuat Object bufferreader
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Input nama Anda ");
        nama = br.readLine();
        System.out.print("Sebutkan umur Anda : ");
        umur = Integer.parseInt(br.readLine());
        //Tampil output isi variable nama
        System.out.println("Nama Anda adalah " + nama);
        System.out.println(" Umur " + umur);

        
    }
}
