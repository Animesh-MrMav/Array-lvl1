package Array_lvl1;
import java.util.*; //extract even numbers 
public class Array17
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
  void xtract()
  {
      int[] e=new int[l];
      int c=0;
      for(int i=0;i<l;i++)
      { if(arr[i]%2==0)
          e[c++]=arr[i];
          
      }
      System.out.println("The new array is..");
      for(int i=0;i<c;i++)
      {
          System.out.print(e[i]+"\t");
      }
  }
    public static void main(String[] args)
    { Array17 obj=new Array17();
      obj.input();
      obj.xtract();
        
    }
}