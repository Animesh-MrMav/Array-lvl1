package Array_lvl1;
import java.util.*; //element and position.
public class Array6
{ int[] arr;
  int l,e;
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
      System.out.println("Enter the element to be searched:");
      e=ob.nextInt();
  }
  void search()
  {
      int flag=-1;int i;
      for(i=0;i<l;i++)
      {
          if(arr[i]==e)
          { 
            flag=1;
            break;
          }
       }
      if(flag==-1)
          System.out.println("Element not found..");
      else
          System.out.println("Element found at position:"+(i+1));
      }
  
 public static void main(String[] args) {
        Array6 obj=new Array6();
        obj.input();
        obj.search();
                
    }
  
}