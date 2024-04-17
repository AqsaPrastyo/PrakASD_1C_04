package P5.Mergesorttest;

public class MergerSortMain04 {
  public static void main(String[] args) {
    
int data[] = {10,40,30,50,70,20,100,90};
System.out.println("sorting dengan merger sort");
MergeSorting04 mSort = new MergeSorting04();
System.out.print("data awal");
mSort.printArray(data);
mSort.megerSort(data);
System.out.print("Setelah diurutkan");
mSort.printArray(data);

  }
}
