/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119044.yohanasrirejeki.no2;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan hasil saldo tabungan
 */

class Tabungan {
    private int saldo;
    Scanner input = new Scanner(System.in);
    
    public Tabungan(int saldo){
        this.saldo = saldo;
    }
    
    public int ambilUang(int jumlah){
        System.out.print("Masukkan Saldo Awal : ");
        saldo = input.nextInt();
        System.out.print("Jumlah uang yang diambil : ");
        jumlah = input.nextInt();
        
        if((saldo-jumlah)<=0){
            System.out.println("Jumlah uang yang diambil harus lebih sedikit dari saldo Anda");
        }else{
            int saldoAkhir = saldo-jumlah;
            System.out.println("Saldo Anda Sekarang : "+saldoAkhir);
        }
        
        return jumlah;
    }
}
