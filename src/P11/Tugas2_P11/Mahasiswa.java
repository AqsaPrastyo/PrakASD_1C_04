package P11.Tugas2_P11;

public class Mahasiswa {
  String nim;
  String nama;

  public Mahasiswa(String nim, String nama) {
      this.nim = nim;
      this.nama = nama;
  }

  @Override
  public String toString() {
      return "NIM: " + nim + ", Nama: " + nama;
  }
}
