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
public class PBOIF210119080Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nim = "10110269";
        mahasiswa1.nama = "Rizki Adam Kurniawan";
        
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nim = "10110270";
        mahasiswa2.nama = "Indra Tiola";
        
        Mahasiswa mahasiswa3 = new Mahasiswa();
        mahasiswa3.nim = "10110271";
        mahasiswa3.nama = "Robi Tanzil Ganefi";
        
        Mahasiswa mahasiswa4 = new Mahasiswa();
        mahasiswa4.nim = "10110269";
        mahasiswa4.nama = "Muhammad Nur Awaludin";
        
        mahasiswa1.perkenalanDiri();
        mahasiswa2.perkenalanDiri();
        mahasiswa3.perkenalanDiri();
        mahasiswa4.perkenalanDiri();
    }
    
}