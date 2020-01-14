package com.company;

import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        String menu;
        String[][] data = {
                {"Tipe 22", "Tipe 27", "Tipe 36"},
                {"183000000", "254000000", "281000000"},
                {"18300000", "38100000", "56200000"},
                {"10%", "15%", "20%"}
        };
        int stok[] = {50, 25, 15};
        int totalPenjualan[] = {0, 0, 0};
        int penghasilan = 0;
        boolean lanjut = true;
        boolean cek = false;


        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter waktu =DateTimeFormatter.ofPattern("dd, MMM YYYY h:mm a");
        String sekarang = waktu.format(time);

        System.out.println(sekarang);
        do {
            menu = JOptionPane.showInputDialog("Menu aplikasi\n" +
                    "1 : Lihat Properti\n" +
                    "2 : Cari Properti\n" +
                    "3 : Transaksi\n" +
                    "4 : Angsuran\n" +
                    "5 : Laporan\n" +
                    "6 : Keluar\n" +
                    "Masukan pilihan : ");

            switch (menu) {
                case "1":
                    //todo

                    JOptionPane.showMessageDialog(null, "Properti    Harga\n" +
                            "--------------------------------------\n" +
                            data[0][0] + "    Rp" + data[1][0] + "\n" +
                            data[0][1] + "    Rp" + data[1][1] + "\n" +
                            data[0][2] + "    Rp" + data[1][2]);
                    break;
                case "2":
                    //todo
                    String key = JOptionPane.showInputDialog("Cari Properti!");
                    for (int i = 0; i < 3; i++) {
                        if (key.equalsIgnoreCase(data[0][i])) {
                            cek = true;
                        }

                    }
                    if (cek) {
                        if(key.equalsIgnoreCase(data[0][0])){
                            JOptionPane.showMessageDialog(null, "Status  : Ada!\n" +
                                    "Stok : "+ stok[0]);
                        }else if (key.equalsIgnoreCase(data[0][1])){
                            JOptionPane.showMessageDialog(null, "Status  : Ada!\n" +
                                    "Stok : "+ stok[1]);
                        }else if (key.equalsIgnoreCase(data[0][2])) {
                            JOptionPane.showMessageDialog(null, "Status  : Ada!\n" +
                                    "Stok : " + stok[2]);
                        }else {
                            JOptionPane.showMessageDialog(null,"Status  : Tidak Ada!");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Status  : Tidak Ada!");
                    }
                    break;
                case "3":
                    //todo

                    String nama = JOptionPane.showInputDialog("Nama");
                    String alamat = JOptionPane.showInputDialog("Alamat");
                    String tlp = JOptionPane.showInputDialog("No. Telepon");
                    String properti = JOptionPane.showInputDialog("Properti    Harga\n" +
                            "--------------------------------------\n" +
                            "1. " + data[0][0] + "    Rp" + data[1][0] + "\n" +
                            "2. " + data[0][1] + "    Rp" + data[1][1] + "\n" +
                            "3. " + data[0][2] + "    Rp" + data[1][2] + "\n" +
                            "Pilih Properti");
                    String metbyr = JOptionPane.showInputDialog("Metode Bayar\n" +
                            "> Cash\n" +
                            "> Kredit\n" +
                            "Pilih");

                    if (metbyr.equalsIgnoreCase("cash")) {
                        System.out.println("Metode bayar adalah cash!");
                        String uang = JOptionPane.showInputDialog("uang >");

                        if (properti.equals("1")) {
                            System.out.println("pilihan = 1");
                            int duit = Integer.valueOf(uang);
                            int harga = Integer.valueOf(data[1][0]);
                            int totalDiskon = Integer.valueOf(data[2][0]);
                            int total = harga-totalDiskon;
                            penghasilan = penghasilan+total;
                            if (duit < harga ) {
                                JOptionPane.showMessageDialog(null,"Mohonn maaf, Uang tidak mencukupi");
                            }else {
                                System.out.println("200jt");

                                int kembalian = duit - total;
                                stok[0] = stok[0] - 1;
                                totalPenjualan[0] = totalPenjualan[0] + 1;
                                JOptionPane.showMessageDialog(null, sekarang+"\n" +
                                        "Nama = "+ nama + "\n" +
                                        "Alamat = "+alamat + "\n" +
                                        "Telepon = "+tlp + "\n" +
                                        "Properti = "+data[0][0] + "\n" +
                                        "Metode byr = "+metbyr + "\n" +
                                        "Uang = Rp."+uang + "\n" +
                                        "Diskon = "+ data[3][0] +"\n" +
                                        "Total Diskon = Rp."+ data[2][0] +"\n" +
                                        "Harga Properti = Rp."+harga+"\n"+
                                        "Total = Rp."+total + "\n" +
                                        "Kembalian = Rp."+kembalian);
                            }
                            break;

                        } else if (properti.equals("2")) {
                            System.out.println("Pilihan = 2");
                            int duit = Integer.valueOf(uang);
                            int harga = Integer.valueOf(data[1][1]);
                            int totalDiskon = Integer.valueOf(data[2][1]);
                            int total = harga-totalDiskon;
                            penghasilan = penghasilan+total;
                            if (duit < harga ) {
                                JOptionPane.showMessageDialog(null,"Mohonn maaf, Uang tidak mencukupi");
                            }else {
                                System.out.println("200jt");

                                int kembalian = duit - total;
                                stok[1] = stok[1] - 1;
                                totalPenjualan[1] = totalPenjualan[1] + 1;
                                JOptionPane.showMessageDialog(null, sekarang+"\n" +
                                        "Nama = "+ nama + "\n" +
                                        "Alamat = "+alamat + "\n" +
                                        "Telepon = "+tlp + "\n" +
                                        "Properti = "+data[0][1] + "\n" +
                                        "Metode byr = "+metbyr + "\n" +
                                        "Uang = Rp."+uang + "\n" +
                                        "Diskon = "+ data[3][1] +"\n" +
                                        "Total Diskon = Rp."+ data[2][1] +"\n" +
                                        "Harga Properti = Rp."+harga+"\n"+
                                        "Total = Rp."+total + "\n" +
                                        "Kembalian = Rp."+kembalian);
                            }
                            break;
                        } else if (properti.equals("3")) {
                            System.out.println("Pilihan = 3");
                            int duit = Integer.valueOf(uang);
                            int harga = Integer.valueOf(data[1][2]);
                            int totalDiskon = Integer.valueOf(data[2][2]);
                            int total = harga-totalDiskon;
                            penghasilan = penghasilan+total;
                            if (duit < harga ) {
                                JOptionPane.showMessageDialog(null,"Mohonn maaf, Uang tidak mencukupi");
                            }else {
                                System.out.println("200jt");

                                int kembalian = duit - total;
                                stok[2] = stok[2] - 1;
                                totalPenjualan[2] = totalPenjualan[2] + 1;
                                JOptionPane.showMessageDialog(null, sekarang+"\n" +
                                        "Nama = "+ nama + "\n" +
                                        "Alamat = "+alamat + "\n" +
                                        "Telepon = "+tlp + "\n" +
                                        "Properti = "+data[0][2] + "\n" +
                                        "Metode byr = "+metbyr + "\n" +
                                        "Uang = Rp."+uang + "\n" +
                                        "Diskon = "+ data[3][2] +"\n" +
                                        "Total Diskon = Rp."+ data[2][2] +"\n" +
                                        "Harga Properti = Rp."+harga+"\n"+
                                        "Total = Rp."+total + "\n" +
                                        "Kembalian = Rp."+kembalian);
                            }
                            break;
                        } else {
                            System.out.println("Wrong!");
                        }
                        break;
                    } else if (metbyr.equalsIgnoreCase("kredit")) {
                        System.out.println("Metode bayar adalah kredit!");
                        String lamaKredit = JOptionPane.showInputDialog("lama kredit >");
                        String DownPayment = JOptionPane.showInputDialog("Masukan Dp > ");

                        if (properti.equals("1")) {
                            System.out.println("pilihan = 1");
                            int kredit = Integer.valueOf(lamaKredit);
                            int Dp = Integer.valueOf(DownPayment);
                            int harga = Integer.valueOf(data[1][0]);
                            int total = (harga - Dp) / kredit;
                            stok[0] = stok[0] - 1;
                            totalPenjualan[0] = totalPenjualan[0] + 1;
                            JOptionPane.showMessageDialog(null, sekarang+"\n" +
                                    "Nama = "+ nama + "\n" +
                                    "Alamat = "+alamat + "\n" +
                                    "Telepon = "+tlp + "\n" +
                                    "Properti = "+data[0][0] + "\n" +
                                    "Metode byr = "+metbyr + "\n" +
                                    "Lama kredit = "+lamaKredit + " bulan\n" +
                                    "Angsuran perbulan = Rp."+total + "\n" +
                                    "Down Payment = Rp."+Dp);
                            break;
                        } else if (properti.equals("2")) {
                            System.out.println("Pilihan = 2");
                            int kredit = Integer.valueOf(lamaKredit);
                            int Dp = Integer.valueOf(DownPayment);
                            int harga = Integer.valueOf(data[1][1]);
                            int total = (harga - Dp) / kredit;
                            stok[1] = stok[1] - 1;
                            totalPenjualan[1] = totalPenjualan[1] + 1;
                            JOptionPane.showMessageDialog(null, sekarang+"\n" +
                                    "Nama = "+ nama + "\n" +
                                    "Alamat = "+alamat + "\n" +
                                    "Telepon = "+tlp + "\n" +
                                    "Properti = "+data[0][1] + "\n" +
                                    "Metode byr = "+metbyr + "\n" +
                                    "Lama kredit = "+lamaKredit + " bulan\n" +
                                    "Angsuran perbulan = Rp."+total + "\n" +
                                    "Down Payment = Rp."+Dp);
                        } else if (properti.equals("3")) {
                            int kredit = Integer.valueOf(lamaKredit);
                            int Dp = Integer.valueOf(DownPayment);
                            int harga = Integer.valueOf(data[1][2]);
                            int total = (harga - Dp) / kredit;
                            stok[2] = stok[2] - 1;
                            totalPenjualan[2] = totalPenjualan[2] + 1;
                            JOptionPane.showMessageDialog(null, sekarang+"\n" +
                                    "Nama = "+ nama + "\n" +
                                    "Alamat = "+alamat + "\n" +
                                    "Telepon = "+tlp + "\n" +
                                    "Properti = "+data[0][2] + "\n" +
                                    "Metode byr = "+metbyr + "\n" +
                                    "Lama kredit = "+lamaKredit + " bulan\n" +
                                    "Angsuran perbulan = Rp."+total + "\n" +
                                    "Down Payment = Rp."+Dp);
                        } else {
                            System.out.println("Wrong!");
                        }

                    }
                case "5":
                    //todo


                    JOptionPane.showMessageDialog(null, "\tPenjualan produk\n\n" +
                            "\tTipe 22\n" +
//                            "\tJumlah stok = "+stok[0] + "\n" +
                            "\tTotal penjualan = "+totalPenjualan[0]+"\n" +
                            "\n\n"+
                            "\tTipe 27" +"\n" +
//                            "\tJumlah stok = "+stok[1] + "\n" +
                            "\tTotal penjualan = "+totalPenjualan[1]+"\n" +
                            "\n\n"+
                            "\tTipe 36\n" +
//                            "\tJumlah stok = "+stok[2] + "\n" +
                            "\tTotal penjualan = "+totalPenjualan[2]+"\n\n" +
                            "pendapatan = Rp."+penghasilan);
                    break;

                case "6":
                    //todo
                    JOptionPane.showMessageDialog(null,"Terimakasih!");
                    lanjut = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Tidak ada pilihan!");


            }
            System.out.println("App is Worked!");


        } while (lanjut) ;

    }
}