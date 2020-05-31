package Array_lvl1;
import java.util.*; //bubble sort.
public class Array9
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
  void bubble_sort()
  {   int temp=0;
      for(int i=0;i<l-1;i++)
      {
          for(int j=0;j<l-i-1;j++)
          { if(arr[j]>arr[j+1])
            {  temp=arr[j];
               arr[j]=arr[j+1];
               arr[j+1]=temp; 
            }
          }
      }
      System.out.println("Sorted Array is:");
      for(int i=0;i<l;i++)
      {
          System.out.print(arr[i]+"\t");
      }
  }
   public static void main(String[] args) {
        Array9 obj=new Array9();
        obj.input();
        obj.bubble_sort();
    }
}
