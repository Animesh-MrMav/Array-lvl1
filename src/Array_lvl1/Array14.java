package Array_lvl1;
import java.util.*; // Second max and second min.
public class Array14
{ public static void main(String[] args)
    {
      int n,i=0,max=0,min,t1,t2;
      Scanner ob=new Scanner (System.in);
      System.out.println("Enter the no of elements in array:");
      n=ob.nextInt();
      int[] arr=new int[n];
      System.out.println("Enter the array:");
      for(i=0;i<n;i++)
          arr[i]=ob.nextInt();   
      min=arr[0];
      t2=min;t1=max;
      for(i=0;i<n;i++)
      { if(arr[i]>t1)
        {  if(arr[i]>max)
             { t1=max;
               max=arr[i];}
          else
            t1=arr[i];
        }
        if(arr[i]<t2)
        {  if(arr[i]<min)
           { t2=min;
            min=arr[i];}
           else
            t2=arr[i];
        } 
       
      }
        System.out.println("The second largest element is :"+t1+" and the second smallest element is: "+t2);
    }
    
}
