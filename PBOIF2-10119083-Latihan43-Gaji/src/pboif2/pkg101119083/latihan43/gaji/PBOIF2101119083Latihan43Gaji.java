/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg101119083.latihan43.gaji;

import java.util.Scanner;

/**
 *
 * @Nama     : Rafsan Zen Mustaofa
 * NIM       : 10119083
 * Kelas     : IF2
 * Deskripsi : Menampilkan program Gaji
 */
public class PBOIF2101119083Latihan43Gaji {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scan = new Scanner(System.in);
        GajiPegawai gajiPegawai = new GajiPegawai();
        
        gajiPegawai.setNama("Rizki Adam Kurniawan");
        gajiPegawai.setAlamat("Jl. Semar dlm 4 No 72/66");
        gajiPegawai.setUangTransport(250000);
        gajiPegawai.setUangTunjangan(300000);
        gajiPegawai.setGajiPokok(4500000);
        gajiPegawai.setTotalGaji(gajiPegawai.totalGaji(gajiPegawai.getUangTransport(),
                gajiPegawai.getUangTunjangan(), gajiPegawai.getGajiPokok()));
        gajiPegawai.tampilData(gajiPegawai.getNama(),gajiPegawai.getAlamat(),gajiPegawai.getUangTransport(),
                gajiPegawai.getUangTunjangan(),gajiPegawai.getGajiPokok(),gajiPegawai.getTotalGaji());
        
        System.out.println("==========================================");
        System.out.println("Developed by : Rafsan Zen Mustaofa");
    }
    
}
