class TestBugG2{
  public static void main(String[] a){
    System.out.println(new Test().f());
  }
}

class Test{
  public int f(){
    int x, y;
    x = 0;
    y = true;
    while (y) {
      x = x + 1;
      y = false;
    }
    return x;
  }
}