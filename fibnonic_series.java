
class Main {
    public static void main(String[] args) {
       
       ///fibonic series series
       
       
       int n = 10;
       int f =0;
      int s = 1;
      for(int i =0; i<n;i++)
      {
          System.out.println(f);
          //sum
          int t = f+s;
         //upate values 
          f = s;
          s = t;     
          
      }   
       
    }
}
