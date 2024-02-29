package P2.DragonGame;

public class Dragon04 {
  int x, y, width, height;

public Dragon04 (int x, int y, int width, int height){
  this.x = x;
  this.y = y; 
  this.height = height;
  this.width = width;

}

void moveLeft(){
  x--;
  if (x <0 ) {
    detectCollision(x,y);
  }
}
void moveRight (){
  x++;
  if (x > width) {
    detectCollision(x, y);
  }
}
void moveUp(){
  y++;
  if (y > width) {
    detectCollision(x, y);
  }
}
void moveDown (){
  y--;
  if (y < 0) {
    detectCollision(x, y);
  }
}

void prinPossition(){
  System.out.printf("x : %d\ny : %d\n", x, y );
}

void detectCollision(int x, int y){
  System.out.println("Game Over");
  System.out.printf("x : %d\ny : %d\n", x, y);

}










}
