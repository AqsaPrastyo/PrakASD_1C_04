package P6.LatihanHotel;

public class MainHotel04 {
  public static void main(String[] args) {
    HotelService04 hotelService = new HotelService04(5);

    hotelService.tambah(new Hotel04("Hotel A", "Kota X", 100, (byte) 4));
    hotelService.tambah(new Hotel04("Hotel B", "Kota Y", 200, (byte) 5));
    hotelService.tambah(new Hotel04("Hotel C", "Kota Z", 150, (byte) 3));

    System.out.println("Sebelum diurutkan:");
    hotelService.tampilAll();

    System.out.println("\nSetelah diurutkan berdasarkan harga menggunakan Bubble Sort:");
    hotelService.bubbleSortHarga();
    hotelService.tampilAll();

    System.out.println("\nSetelah diurutkan berdasarkan harga menggunakan Selection Sort:");
    hotelService.selectionSortHarga();
    hotelService.tampilAll();

    System.out.println("\nSetelah diurutkan berdasarkan harga menggunakan Bubble Sort:");
    hotelService.bubbleSortBintang();
    hotelService.tampilAll();

    System.out.println("\nSetelah diurutkan berdasarkan rating menggunakan Selection Sort:");
    hotelService.selectionSortBintang();
    hotelService.tampilAll();
}
}
