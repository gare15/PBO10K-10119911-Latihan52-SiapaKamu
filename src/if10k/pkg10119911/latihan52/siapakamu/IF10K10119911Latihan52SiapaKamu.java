/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119911.latihan52.siapakamu;

/**
 *
 * @author tegar
 */
public class IF10K10119911Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.setNIP("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        System.out.println("NIP DOSEN = " + dosen.getNIP());
        dosen.siapaKamu();
        dosen.mengajarApa();
        
        System.out.println("");
        
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNIM("10116228");
        mhs.setNama("Gandy Christian Situmorang");
        mhs.setUmur(23);
        mhs.setKelas("PBO6K");
        System.out.println("NIM MAHASISWA = " + dosen.getNIP());
        mhs.siapaKamu();
        mhs.kelasApa();
    }
    
}
