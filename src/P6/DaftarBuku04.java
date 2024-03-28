package P6;

public class DaftarBuku04 {
  Buku04 listBk[] = new Buku04[5];
  int idx;

  void tambah(Buku04 m){
    if (idx < listBk.length) {
      listBk[idx] = m;
      idx++;
    } else {
      System.out.println("Data sudah penuh!");
    }
  }

void tampil(){
  for (Buku04 m : listBk) {
    m.tampilDataBuku();
  }
}

void bubbleSort(){
  for (int i = 0; i < listBk.length - 1; i++) {
    for (int j = 0; j < listBk.length  - i - 1; j++) {
      if (listBk[j].stok > listBk[j+1].stok) {
        Buku04 tempBK = listBk[j];
        listBk[j] = listBk[j+1];
        listBk[j+1] = tempBK; 
      }
    }
  }

}

void selectionSort(){
  for (int i = 0; i < listBk.length - 1; i++) {
  int idxMax = i;
    for (int j = i + 1; j < listBk.length; j++) {
     if (listBk[j].stok > listBk[idxMax].stok) {
      idxMax = j;
      }
    }
  Buku04 temBuku04 = listBk[idxMax];
  listBk[idxMax] = listBk[i];
  listBk[i] = temBuku04;
  }
}

void insertionSort(){
  for (int i = 1; i < listBk.length; i++) {
    Buku04 temp = listBk[i];
    int j = i;
    while (j > 0 && listBk[j-1].stok > temp.stok) {
     listBk[j] = listBk[j-1];
     
      j--;
    }
    listBk[j] = temp;
  }
}






}
