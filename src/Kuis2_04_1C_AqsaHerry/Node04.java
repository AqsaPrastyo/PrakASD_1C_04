package Kuis2_04_1C_AqsaHerry;

public class Node04 {
  int data;
  String name;
  Node04 prev, next;
  
  Node04(Node04 prev,int data, String name, Node04 next){
    this.name = name;
    this.next = next;
    this.prev = prev;
    this.data = data;

  }
}
