public class Demo{
  public static void main(String[] args){
    String a = "3";
    if(args.length==0){printLoop(5);}else{printLoop(Integer.parseInt(args[0]));}
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
