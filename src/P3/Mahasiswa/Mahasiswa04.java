package P3.Mahasiswa;

public class Mahasiswa04 {
    private String nama;
    private String nim;
    private char jenisKelamin;
    private double ipk;

    
    public Mahasiswa04(String nama, String nim, char jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }

    
    public String Nama() {
        return nama;
    }

    public String Nim() {
        return nim;
    }

    public char JenisKelamin() {
        return jenisKelamin;
    }

    public double Ipk() {
        return ipk;
    }

}
