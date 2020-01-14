package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class menuAngsuran {
    public static void main(String[] args) {



//        ArrayList namaPlnggan = new ArrayList();
//        ArrayList lamaAngsur = new ArrayList();

        String namaPelanggan[] = {"","","","",""};
        int lamaAngsur[] = {0,0,0,0,0};

        int n = 0;
        String cek;



        int harga = 5000000;
        do {

            System.out.println("Menu\n" +
                    "1.Transksi\n" +
                    "2.Angsuran\n" +
                    "3.Keluar");
            Scanner input = new Scanner(System.in);
            Scanner utknama = new Scanner(System.in);
            String pilih = input.next();

            switch (pilih) {
                case "1":
                    String nama = JOptionPane.showInputDialog(null,"Nama ");
                    int angsur =Integer.valueOf(JOptionPane.showInputDialog(null,"Angsuran "));
                    int dp = Integer.valueOf(JOptionPane.showInputDialog(null,"Masukan dp"));

                    namaPelanggan[n] = nama;
                    lamaAngsur[n] = angsur;

                    int total = (harga - dp) / angsur;
                    JOptionPane.showMessageDialog(null,"Angsuran perbulan = "+ total);
                    n = n + 1;
                    break;
                case "2":
                    boolean stat= false;
                    String cari = JOptionPane.showInputDialog(null,"cari");
                    for (int i = 0; i < namaPelanggan.length ; i++) {
                        if (cari.equalsIgnoreCase(namaPelanggan[i])) {
                            stat = true;
                        }
                    }
                    if (stat) {
                        JOptionPane.showMessageDialog(null,"Ada!");
                    }else {
                        JOptionPane.showMessageDialog(null,"Tidak Ada!");
                    }
                    break;
                case "3":
                    for (int i = 0; i < lamaAngsur.length ; i++) {
                        System.out.println(lamaAngsur[i]);
                    }
                    break;
                default:
                    System.out.println("Wrong!");
            }
            System.out.println("lanjut ? y/t");
            cek = utknama.nextLine();
        }while (cek.equalsIgnoreCase("y"));


    }
}
