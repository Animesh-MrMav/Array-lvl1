package Array_lvl1;
import java.util.*; //reverse of array.
public class Array4
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
  void reverse()
  {   System.out.println("The array in reverse order is:");
      for(int i=l-1;i>=0;i--)
      {
          System.out.print(arr[i]+"\t");
      }
  }
   public static void main(String[] args) {
        Array4 obj=new Array4();
        obj.input();
        obj.reverse();
    }
}
