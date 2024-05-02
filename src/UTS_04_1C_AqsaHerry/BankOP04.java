package UTS_04_1C_AqsaHerry;

public class BankOP04 {
  Bank04 listBk[] = new Bank04[5];
  int idx;

  void tambah04(Bank04 m){
    if (idx < listBk.length) {
      listBk[idx] = m;
      idx++;
    } else {
      System.out.println("Data sudah penuh!");
    }
  }
  void tampil04(){
    for (Bank04 m : listBk) {
      m.tampilDataNorek04();
    }
  }

}
