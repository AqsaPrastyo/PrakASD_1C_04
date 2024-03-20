package Kuis1_04_1C_AqsaHerry;

public class Book04 {

   private String kodeBuku;
   private String judulBuku;
   private String pengarang;
   private int tahunTerbit;
   private int stok;


public  Book04 (String kodeBuku, String judulBuku, String pengarang, int tahunTerbit, int stok ){

this.kodeBuku = kodeBuku;
this.judulBuku = judulBuku;
this.pengarang = pengarang;
this.tahunTerbit = tahunTerbit;
this.stok = stok;
}

public void kodeBuku (String kodeBuku){
  this.kodeBuku = kodeBuku;
 }

public void judulBuku (String judulBuku){
  this.judulBuku = judulBuku;
 }

public void pengarang (String pengarang){
  this.pengarang = pengarang;
 }

public void tahunTerbit (int tahunTerbit){
  this.tahunTerbit = tahunTerbit;
 }

 public void stok (int stok){
  this.stok = stok;
 }


 public String rekodeBuku (){
  return kodeBuku;
 }
 
 public String rejudulBuku (){
  return judulBuku;
 }

 public String repengarang (){
  return pengarang;
 }

 public int retahunTerbit (){
  return tahunTerbit;
 }

 public int restok (){
  return stok;
 }


 public void displayData() {
  System.out.println("Kode buku    : " + kodeBuku);
  System.out.println("Judul buku   : " + judulBuku);
  System.out.println("Pengarang    : " + pengarang);
  System.out.println("Stok         : " + stok);
  System.out.println("Tahun terbit : " + tahunTerbit);
  
}





















}
