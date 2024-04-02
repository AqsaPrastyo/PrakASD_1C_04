package P6.LatihanHotel;

public class HotelService04 {
  private Hotel04[] ruang;
    private int noRuang;

    public HotelService04(int maxSize) {
        ruang = new Hotel04[maxSize];
        noRuang = 0;
    }

    public void tambah(Hotel04 H) {
        if (noRuang < ruang.length) {
            ruang[noRuang] = H;
            noRuang++;
        } else {
            System.out.println("Kamar penuh, tidak dapat menambahkan lagi.");
        }
    }

    public void tampilAll() {
        for (int i = 0; i < noRuang; i++) {
            System.out.println(ruang[i].DisplayHotel());
        }
    }

    public void bubbleSortHarga() {
        for (int i = 0; i < noRuang - 1; i++) {
            for (int j = 0; j < noRuang - i - 1; j++) {
                if (ruang[j].Harga() > ruang[j + 1].Harga()) {
                    Hotel04 temp = ruang[j];
                    ruang[j] = ruang[j + 1];
                    ruang[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSortHarga() {
        for (int i = 0; i < noRuang - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < noRuang; j++) {
                if (ruang[j].Harga() < ruang[minIndex].Harga()) {
                    minIndex = j;
                }
            }
            Hotel04 temp = ruang[minIndex];
            ruang[minIndex] = ruang[i];
            ruang[i] = temp;
        }
    }

    public void bubbleSortBintang() {
        for (int i = 0; i < noRuang - 1; i++) {
            for (int j = 0; j < noRuang - i - 1; j++) {
                if (ruang[j].Bintang() < ruang[j + 1].Bintang()) {
                    Hotel04 temp = ruang[j];
                    ruang[j] = ruang[j + 1];
                    ruang[j + 1] = temp;
                }
            }
        }
    }    
    
    public void selectionSortBintang() {
        for (int i = 0; i < noRuang - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < noRuang; j++) {
                if (ruang[j].Bintang() > ruang[minIndex].Bintang()) {
                    minIndex = j;
                }
            }
            Hotel04 temp = ruang[minIndex];
            ruang[minIndex] = ruang[i];
            ruang[i] = temp;
        }
    }
}
