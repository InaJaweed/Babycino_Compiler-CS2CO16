class TestBugG1{
  public static void main(String[] a){
    System.out.println(new Test().f());
  }
}

class Test {
  public int f(){
    int ;
    int result, count;
    result = 0;
    count = 1;
    while (count < 11) {
      result = result + count;
      count = count + 1;
    }
    return result;
  }
}