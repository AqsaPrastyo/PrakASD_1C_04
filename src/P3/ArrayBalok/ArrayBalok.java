package P3.ArrayBalok;

public class ArrayBalok {
  
public static void main(String[] args) {
  Balok04[] blArray = new Balok04[3];

  blArray[0] = new Balok04(100, 30, 12);
  blArray[1] = new Balok04(120, 40, 15);
  blArray[2] = new Balok04(100, 30, 12);

for (int i = 0; i < 3; i++) {
  System.out.println("Volume balok ke-" + i + ": " + blArray[i].hitungVolume());
}


}

}
