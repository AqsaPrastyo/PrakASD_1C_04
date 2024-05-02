package UTS_04_1C_AqsaHerry;

public class StakTransaksi04 {
  Transaksi04 Trs[];
  int size;
  int top;

  public StakTransaksi04() {
    this.size = 32;
    
    top = -1;
}

  public boolean isEmpty04() {
    return top == -1;
}

public boolean isFull04() {
    return top == size - 1;
}

public void push04(int data) {
  if (isFull04()) {
      System.out.println("Stak penuh!");
  } else {
      top++;
  }
}

public void Searching(){}

public void FindMax(){}

public void Sorting(){
  for (int i = 0; i < Trs.length - 1; i++) {
    for (int j = 0; j < Trs.length - i - 1; j++) {
      if (Trs[j].kodeTransaksi.compareTo(Trs[j + 1].kodeTransaksi) > 0) {
        Transaksi04 temp = Trs[j];
        Trs[j] = Trs[j + 1];
        Trs[j + 1] = temp;
      }
    }
  }
}


}
