package UTS_04_1C_AqsaHerry;

 

public class Transaksi04 {
  String kodeTransaksi;
  double saldo;
  double inOutSaldo;
  double finalSaldo;
  String tanggalTransaksi;
  String type;
  Bank04 bankAcc;
  String noRekening;
  

Transaksi04(String kodeTransaksi,String noRekening, double saldo, double inOutSaldo, double finalSaldo, String tanggalTransaksi, String type){
this.tanggalTransaksi =tanggalTransaksi;
this.noRekening = noRekening;
this.type = type;
this.kodeTransaksi = kodeTransaksi;
this.saldo = saldo;
this.inOutSaldo = inOutSaldo;
this.finalSaldo = finalSaldo;
this.bankAcc = bankAcc;
}

public void tampilDataTransaksi(){
  System.out.printf("%n %n %n %n %n %n %n" , "Kode Transaksi" , "No Rekening", "Saldo", "Debit/Kredit", " final Saldo", "Tanggal Transaksi", "Type");
  System.out.printf("%n %n %n %n %n %n %n" , kodeTransaksi, noRekening, saldo, inOutSaldo, finalSaldo, tanggalTransaksi, type);
}

}
