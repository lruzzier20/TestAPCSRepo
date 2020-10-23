public class Demo{
  public static void main(String[] args){
    String a = "3";
    if(args.length==0){printLoop(5);}else{printLoop(Integer.parseInt(args[0]));}
    int[] b = new int[]{1,2,3,4,5,6};
    System.out.println(arrToString(b));
    int[][] c = new int[][]{
      new int[]{1,2,3,4,5},
      new int[]{6,7,8},
      new int[]{4,1,0,12,33,13,53}};
    System.out.println(arrDeepToString(create2DArray(3,3,6)));
    System.out.println(arrDeepToString(create2DArrayRandomized(3,3,6)));
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

  public static String arrToString(int[] arr){
    String sentence = "{";
    for(int i=0;i<arr.length;i++){
      sentence = sentence + (arr[i]);
      if(i!=arr.length-1){sentence = sentence + ", ";}
    }
    sentence = sentence + "}";
    return sentence;
  }

  public static String arrDeepToString(int[][] arr){
    String sentence = "{";
    for(int i=0;i<arr.length;i++){
      sentence+="{";
      for(int j=0;j<arr[i].length;j++){
        sentence+=arr[i][j] + "";
        if(j!=arr[i].length-1){sentence+= ", ";}
      }
      if(i==arr.length-1){sentence+="}";}else{sentence+="}, ";}
    }
    sentence+= "}";
    return sentence;
  }

  public static int[][] create2DArray(int rows, int cols, int maxValue){
    int[][] a = new int[rows][cols];
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a[i].length;j++){
        a[i][j] = (int) (Math.random() * (maxValue + 1));
      }
    }
    return a;
  }

  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
    int[][] a = new int[rows][];
    for(int i=0;i<a.length;i++){
      a[i] = new int[(int) (Math.random() * (cols + 1))];
      for(int j=0;j<a[i].length;j++){
        a[i][j] = (int) (Math.random() * (maxValue + 1));
      }
    }
    return a;
  }

}
