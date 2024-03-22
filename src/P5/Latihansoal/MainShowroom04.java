package P5.Latihansoal;

public class MainShowroom04 {
  public static void main(String[] args) {
    
    Showroom04.Mobil[] mobil = {
      new Showroom04.Mobil("BMW", "M2 Coupe", 2016, 6816, 728),
      new Showroom04.Mobil("Ford", "Fiesta ST", 2014, 3921, 575),
      new Showroom04.Mobil("Nissan", "370Z", 2009, 4360, 657),
      new Showroom04.Mobil("Subaru", "BRZ", 2014, 4058, 609),
      new Showroom04.Mobil("Subaru", "Impreza WRX STI", 2013, 6255, 703),
      new Showroom04.Mobil("Toyota", "AE86 Trueno", 1986, 3700, 553),
      new Showroom04.Mobil("Toyota", "86/GT86", 2014, 4180, 609),
      new Showroom04.Mobil("Volkswagen", "Golf GTI", 2014, 4180, 631)
  };

  
  int maxTopAcceleration = Showroom04.MaxTopAcceleration(mobil, 0, mobil.length - 1);
  System.out.println("Top Acceleration Tertinggi: " + maxTopAcceleration);

  
  int minTopAcceleration = Showroom04.MinTopAcceleration(mobil, 0, mobil.length - 1);
  System.out.println("Top Acceleration Terendah: " + minTopAcceleration);

  
  double averageTopPower = Showroom04.rataTopPower(mobil);
  System.out.println("Rata-rata Top Power: " + averageTopPower);
  }
}
