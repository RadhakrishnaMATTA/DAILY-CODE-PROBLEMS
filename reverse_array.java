
class Main {
    public static void main(String[] args) {
               // 0   1 2  3 4   5
    int arr[] = {139,12,34,5,566,7};
    
    int mid = (arr.length-1)/2;  //3
    System.out.println(mid);  
   
    for(int i = mid; i>=0; i--)
     {

      System.out.println(arr[i]);


      }

     for(int i=arr.length-1; i>mid; i--) 
      {

     System.out.println(arr[i]);

      }
      
           
         
    }
}
