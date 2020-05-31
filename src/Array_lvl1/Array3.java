package Array_lvl1;
import java.util.*; //month number--days
public class Array3
{ int[] arr={0,31,28,31,30,31,30,31,31,30,31,30,31};
  void input_disp()
  {   Scanner ob=new Scanner(System.in);
      int i=0;
      System.out.println("Enter the month number:");
      i=ob.nextInt();
      System.out.println("The Number of days in month number "+i+" is :"+arr[i]);
      
   }
   public static void main(String[] args) {
        Array3 obj=new Array3();
        obj.input_disp();
        
    }
  
  
}
