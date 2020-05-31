package Array_lvl1;
import java.util.*; //selection sort.
public class Array10
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
  void selection_sort()
  {
      int t,p;
      for(int i=0;i<l;i++)
      {
          t=arr[i];
          p=i;
          for(int j=i;j<l;j++)
          {
              if(arr[j]<t)
              {
                  t=arr[j];
                  p=j;
              }
          }
          t=arr[i];
          arr[i]=arr[p];
          arr[p]=t;
      }
      System.out.println("Sorted array is :");
      for(int i=0;i<l;i++)
          System.out.print(arr[i]+"\t");
  }
   public static void main(String[] args) {
        Array10 obj=new Array10(); 
        obj.input();
        obj.selection_sort();
    }
  
}