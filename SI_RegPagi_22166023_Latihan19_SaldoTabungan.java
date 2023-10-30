/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166023_latihan19_saldo.tabungan;
import java.text.DecimalFormat;
/**
 *
 * @author user
 * NAMA : Peni Nurul Fauzah
 * KELAS : PBO19
 * NIM : 22166023
 * DESKRIPSI PROGRAM : Program Saldo Tabungan
 */
public class SI_RegPagi_22166023_Latihan19_SaldoTabungan {

    public static void main(String[] args) {
        // Saldo Awal
        double saldoAwal = 2500000;
        // Bunga per Bulan (dalam persen)
        double bungaPerBulan = 15;
        // Lama (bulan)
        int lamaBulan = 6;
        
         // Format saldo awal sebagai mata uang
        DecimalFormat df = new DecimalFormat("#,###,###");
        String saldoAwalFormatted = df.format(saldoAwal);

        // Hitung saldo per bulan
        for (int i = 1; i <= lamaBulan; i++) {
            double bunga = saldoAwal * (bungaPerBulan / 100);
            saldoAwal += bunga;
        // Format saldo per bulan sebagai mata uang
        String saldoBulanFormatted = df.format(saldoAwal);
        System.out.println("Saldo di Bulan ke- " + i + ": Rp. " + saldoBulanFormatted);
        }
    }
    
}
