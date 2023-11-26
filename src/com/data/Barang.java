/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.data;

import java.util.Random;

/**
 *
 * @author ASUS
 */
public class Barang {//konstruktor dengan nama kelas Barang untuk menginisialisasi beberapa atribut dibawah ini
    public int id;  
    public int no;
    public int jumlah;
    public String tanggal;
    public String kode;
    public String nama;
    public String keterangan;
    public Barang(int no, int jumlah, String tanggal, String kode, String nama, String keterangan) {
        Random rand = new Random();
        this.no = no;
        this.jumlah = jumlah;
        this.tanggal = tanggal;
        this.kode = kode;
        this.nama = nama;
        this.keterangan = keterangan;
        this.id = rand.nextInt(100000);
    }
    //public int ini untuk method eksport barang
    public int getNo() {
        return no;
    }
    
    public int getTanggal() {
        return no;
    }
    
    public int getKode() {
        return no;
    }
    
    public int getNama() {
        return no;
    }
    
    public int getJumlah() {
        return no;
    }
    
    public int getKeterangan() {
        return no;
    }
    
    public void print() {
        System.out.println("ID: " + this.id);
        System.out.println("NO: " +this.no);
        System.out.println("Jumlah: " + this.jumlah);
        System.out.println("Tanggal: " + this.tanggal);
        System.out.println("Kode: "+this.kode);
        System.out.println("Nama: " + this.nama);
        System.out.println("Keterangan:" + this.keterangan);
    }
}
