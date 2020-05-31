package Array_lvl1;
import java.util.*; //avg of numbers of array.
public class Array2
{ int[] arr;
  int l;
  void input()
  {   Scanner ob=new Scanner(System.in);
      int i=0;
      System.out.println("Enter the length of the array:");
      l=ob.nextInt();
      arr=new int[l];
      System.out.println("Enter the array:");
      for(i=0;i<l;i++)
      {
          arr[i]=ob.nextInt();
      }
   }
  void average()
  {
     int s=0,avg;
     for(int i=0;i<l;i++)
     {
         s=s+arr[i];
     }
     avg=s/l;
      System.out.println("the average of the entries of the array is:"+avg);
  }
  public static void main(String[] args) {
        Array2 obj=new Array2();
        obj.input();
        obj.average();
    }
  
}