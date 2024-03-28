package P6;

public class DaftarBuku04 {
  Buku04 listrBk[] = new Buku04[5];
  int idx;

  void tambah(Buku04 m){
    if (idx < listrBk.length) {
      listrBk[idx] = m;
      idx++;
    } else {
      System.out.println("Data sudah penuh!");
    }
  }

void tampil(){
  for (Buku04 m : listrBk) {
    m.tampilDataBuku();
  }
}

void bubbleSort(){
  for (int i = 0; i < listrBk.length - 1; i++) {
    for (int j = 0; j < listrBk.length  - i - 1; j++) {
      if (listrBk[j].stok > listrBk[j+1].stok) {
        Buku04 tempBK = listrBk[j];
        listrBk[j] = listrBk[j+1];
        listrBk[j+1] = tempBK; 
      }
    }
  }

}


}
