package P8;

public class PostFix04 {
  
  int n;
  int top;
  char[] stak;

  public PostFix04(int total){
    n = total;
    top = -1;
    stak = new char[n];
    push ('(');
  }

  public void push(char c){
    top++;
    stak[top] = c;
  }

  public char pop(){ 
    char item = stak[top];
    top--;
    return item;
  }

  public boolean isOperand(char c){
    if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') ||
          (c >= '0' && c <= '9') || c == ' ' || c == '.'){
      return true;
    } else {
      return false;
    }
  }

  public boolean isOperator(char c){ 
    if (c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+')  {
      return true;
    } else {
      return false;
    }
  }

  public int derajat(char c){ 
    switch (c) {
      case '^':
        return 3;

      case '%':
        return 2;

      case '/':
        return 2;

      case '*':
        return 2;  

      case '-':
        return 1;

      case '+':
        return 1;

      default:
        return 0;
    }
  }


  public String konversi (String Q){

    String P = "";
    char c;
    for (int i = 0; i < n; i++) {
      c = Q.charAt(i);
      if (isOperand(c)) {
        P = P + c; 
      }
      if (c == '(') {
        push(c);
      }
      if (c == ')') {
        while (stak[top] != '(') {
          P = P + pop();
        } 
        pop();
      }
      if (isOperator(c)) { 
        while (derajat(stak[top]) >= derajat(c)) {
          P = P + pop();
        }
        push(c);
      }
    }
    return P;
  }
}
