package P7;

public class PencarianBuku04 {
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

  
  public int findKodeBukuSeqSearch(String cari ){
    int posisi = -1;
    for (int j = 0; j < listBk.length; j++) {
      if (listBk[j].kodeBuku.equals(cari)) {
        posisi = j;
        break;
      }
    }
    return posisi;
  }

  
  public int findKodeBukuBinarySearch(String cari, int left, int right) {
    if (right >= left) {
      int mid = left + (right - left) / 2;
      int compareResult = cari.compareTo(listBk[mid].kodeBuku);
      if (compareResult == 0)
        return mid;
      if (compareResult < 0)
        return findKodeBukuBinarySearch(cari, left, mid - 1);
      return findKodeBukuBinarySearch(cari, mid + 1, right);
    }
    return -1;
  }

 
  public void bubbleSort() {
    for (int i = 0; i < listBk.length - 1; i++) {
      for (int j = 0; j < listBk.length - i - 1; j++) {
        if (listBk[j].judulBuku.compareTo(listBk[j + 1].judulBuku) > 0) {
          Buku04 temp = listBk[j];
          listBk[j] = listBk[j + 1];
          listBk[j + 1] = temp;
        }
      }
    }
  }

  
  public int findJudulBukuSeqSearch(String cari) {
    int count = 0;
    int posisi = -1;
    for (int j = 0; j < listBk.length; j++) {
      if (listBk[j].judulBuku.equals(cari)) {
        posisi = j;
        count++;
      }
    }
    if (count > 1) {
      System.out.println("Peringatan: Ada lebih dari 1 buku dengan judul '" + cari + "' ditemukan.");
    }
    return posisi;
  }

 
  public int findJudulBukuBinarySearch(String cari) {
    bubbleSort(); 
    int left = 0;
    int right = listBk.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (listBk[mid].judulBuku.equals(cari)) {
        int count = 1;
        int leftPos = mid - 1;
        int rightPos = mid + 1;
        while (leftPos >= 0 && listBk[leftPos].judulBuku.equals(cari)) {
          count++;
          leftPos--;
        }
        while (rightPos < listBk.length && listBk[rightPos].judulBuku.equals(cari)) {
          count++;
          rightPos++;
        }
        if (count > 1) {
          System.out.println("Peringatan: Ada lebih dari 1 buku dengan judul '" + cari + "' ditemukan.");
        }
        return mid;
      } else if (listBk[mid].judulBuku.compareTo(cari) < 0) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return -1;
  }
}
