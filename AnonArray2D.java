public class AnonArray2D {
    public static void main(String[] args) {
          AnonArray2D.sum(new int[][]{{10,20,30},{40,50}});
    }
    static void sum(int [][]no){
         int total=0;
         for(int ii[]:no){
                for(int j:ii){
                     total=total+j;
                }
                System.out.println("sum in "+total);
         }
    }
}
