class TestBugG3{
  public static void main(String[] a){
    System.out.println(new Test().f());
  }
}

class Test{
  public int f(){
    boolean x, y;
    int a;
    a = 0;
    if (y){
      a = 1;
    }else{
      
    }
    return a;
  }
}