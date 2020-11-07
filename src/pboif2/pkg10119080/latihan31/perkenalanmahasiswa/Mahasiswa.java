/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119080.latihan31.perkenalanmahasiswa;

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * (OBJECT ORIENTED) Perkenalan Mahasiswa
 */
class Mahasiswa {
    public String nim;
    public String nama;
    
    public void perkenalanDiri() {
        System.out.println("Hello Everyone");
        System.out.println("My NIM is ".concat(nim));
        System.out.println("My Name is ".concat(nama).concat("\n"));
    }
    
}