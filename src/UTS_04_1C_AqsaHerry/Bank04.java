package UTS_04_1C_AqsaHerry;

public class Bank04 {
  String noRekening;
  String nama;
  String namaIbu;
  String noHp;
  String email;

  Bank04(String noRekening, String nama, String namaIbu, String noHp, String email){
    this.noRekening = noRekening;
    this.nama = nama;
    this.namaIbu = namaIbu;
    this.noHp = noHp;
    this.email = email;
  }

public void tampilDataNorek04(){
  System.out.println("=======================");
  System.out.printf("|%-12s| %-20s| %-20s| %-8s| %10s| %n", "No Rekening", "Nama", "NamaIbu", "Nohp", "Email");
  System.out.printf("|%-12s| %-20s| %-20s| %-8s| %10s| %n", noRekening, nama, namaIbu, noHp, email);
}


}
