package Array_lvl1;
import java.util.*; //cnt positive.
public class Array11
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
  void count()
  {   int cnt=0;
      for(int i=0;i<l;i++)
      { if(arr[i]>0)
          cnt++;
      }
      System.out.println("The no of positive numbers are:"+cnt);
  }
  public static void main(String[] args) {
        Array11 obj=new Array11(); 
        obj.input();
        obj.count();
    }
  
}