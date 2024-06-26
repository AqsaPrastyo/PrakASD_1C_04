package P8;

public class Gudang04 {
    Barang04[] tumpukan;
    int size;
    int top;

    public Gudang04(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang04[size];
        top = -1;
    }

    public boolean cekKosong() {
        return top == -1;
    }

    public boolean cekPenuh() {
        return top == size - 1;
    }

    public void tambahBarang(Barang04 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan di gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di gudang sudah penuh");
        }
    }

    public Barang04 ambilBarang() {
        if (!cekKosong()) {
            Barang04 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari gudang");
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan kosong");
            return null;
        }
    }

    public Barang04 liatBarangTeratas() {
        if (!cekKosong()) {
            Barang04 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di gudang: ");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (Kategori %s) \n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }

    public String konversiDesimalKeBiner(int kode) {
        StakKonversi04 stak = new StakKonversi04();
        while (kode != 0) {
            int sisa = kode % 2;
            stak.push(sisa);
            kode = kode / 2;
        }
        StringBuilder biner = new StringBuilder();
        while (!stak.isEmpty()) {
            biner.append(stak.pop());
        }
        return biner.toString();
    }


    public Barang04 lihatBarangTerbawah() {
        if (!cekKosong()) {
            Barang04 barangTerbawah = tumpukan[0];
            System.out.println("Barang terbawah " + barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }
    
    
    public boolean cariBarang(String nama) {
        for (int i = top; i >= 0; i--) {
            if (tumpukan[i].nama.equalsIgnoreCase(nama)) {
                System.out.println("Barang dengan nama " + nama + " ditemukan: Kode " + tumpukan[i].kode);
                return true;
            }
        }
        System.out.println("Barang dengan nama " + nama + " tidak ditemukan.");
        return false;
    }
    
}
