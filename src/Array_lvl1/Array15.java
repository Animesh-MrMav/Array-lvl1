package Array_lvl1;
import java.util.*; //prime no in array.
public class Array15
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
  int isPrime(int n)
  { int cnt=0;
    for(int i=1;i<=n;i++)
    {
        if(n%i==0)
            cnt++;
    }
    if(cnt==2)
        return 1;
    else 
        return 0;
      
  }
  void check()
  {  System.out.println("The prime numbers are:");
     for(int i=0;i<l;i++)
     {
         int s=isPrime(arr[i]);
         if(s==1)
             System.out.print(arr[i]+"\t");
     }
      
  }
    public static void main(String[] args)
    {  Array15 obj=new Array15();
       obj.input();
       obj.check();
    }
}
