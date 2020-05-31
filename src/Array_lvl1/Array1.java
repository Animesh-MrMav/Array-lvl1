package Array_lvl1;
import java.util.*; //sum of numbers of array.
public class Array1
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
  void sum()
  {  int s=0;
     for(int i=0;i<l;i++)
     {
         s=s+arr[i];
     }
      System.out.println("The sum of elements of array is:"+s);
  }
    public static void main(String[] args) {
        Array1 obj=new Array1();
        obj.input();
        obj.sum();
    }
}
