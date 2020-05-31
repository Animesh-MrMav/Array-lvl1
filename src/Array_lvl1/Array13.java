package Array_lvl1;
import java.util.*;
public class Array13
{   public static void main(String[] args) 
    {
      int n,i,max=0,min;
      Scanner ob=new Scanner (System.in);
      System.out.println("Enter the no of elements in array:");
      n=ob.nextInt();
      int[] arr=new int[n];
      System.out.println("Enter the array:");
      for(i=0;i<n;i++)
          arr[i]=ob.nextInt();
      min=arr[0];
      for(i=0;i<n;i++)
      {
          if(arr[i]<min)
              min=arr[i];
          if(arr[i]>max)
              max=arr[i];
      }
      System.out.println("The max element is:"+max+" and is min element is:"+min);
    }
}
