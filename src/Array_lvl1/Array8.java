package Array_lvl1;
import java.util.*; //binary search
public class Array8
{ int[] arr;
  int l,e;
  void input()
  {   Scanner ob=new Scanner(System.in);
      int i=0;
      System.out.println("Enter the length of the array:");
      l=ob.nextInt();
      arr=new int[l];
      System.out.println("Enter the array(sorted):");
      for(i=0;i<l;i++)
      {
          arr[i]=ob.nextInt();
      }
      System.out.println("Enter the element to be searched..");
      e=ob.nextInt();
  }
  void binary_search()
  {
      int f=0,r=l,m=0,c=-1;
      while(f<=r)
      {   m=(f+r)/2;
          if(e>arr[m])
              f=m+1;
          else if(e<arr[m])
              r=m-1;
          else
          {   c=0;
              break;
          }
      }
      if(c!=-1)
          System.out.println("Element found at position:"+(m+1));
      else 
          System.out.println("Element not found.");
      
  }
  public static void main(String[] args) {
        Array8 obj=new Array8();
        obj.input();
        obj.binary_search();
    }
}