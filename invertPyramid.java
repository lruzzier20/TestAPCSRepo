public class invertPyramid{
  public static void main(String[] args){
    printLoop(10);
  }

  public static void printLoop(int n){
    int temp = n;
    for(int i=1;i<=n;i++){
      for(int j=temp;j>0;j--){
        System.out.print(i);
      }
      temp = temp-1;
      System.out.println();
    }
  }
}
