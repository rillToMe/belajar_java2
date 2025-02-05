package com.Belajar;
import javax.swing.JOptionPane;
public class Latihan5 {
    public static void main(String[] args) {
        String nama = "";
        nama = JOptionPane.showInputDialog("Silahkan Masukkan Nama Anda");
        String msg = "Hello " + nama + "!";
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
