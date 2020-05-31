package Array_lvl1;
import java.util.*; //search n freq
public class Array7
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
      System.out.println("Enter the element to be searched..");
      e=ob.nextInt();
  }
  void search_freq()
  {
      int flag=-1,i,cnt=0;
      for(i=0;i<l;i++)
      {
          if(arr[i]==e)
          { 
            flag=1;
            break;
          }
       }
     if(flag!=-1)
      {  for(i=0;i<l;i++)
          {  if(arr[i]==e)
             cnt++;
           }
          System.out.println("Element found in array. Its frequency is "+cnt);
      }
     else
          System.out.println("Element not found.");
  }
  public static void main(String[] args) {
        Array7 obj=new Array7();
        obj.input();
        obj.search_freq();
    }
}