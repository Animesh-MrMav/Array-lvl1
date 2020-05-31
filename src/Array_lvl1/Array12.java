package Array_lvl1;
import java.util.*; //avg of even nos.
public class Array12
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
  void avg_even()
  {
      int cnt=0;
      float avg,sum=0;
      for(int i=0;i<l;i++)
      {
          if(arr[i]%2==0)
          {
              cnt++;
              sum=sum+arr[i];
          }
      }
      avg=sum/cnt;
      System.out.println("Avg of all even numbers in array is:"+avg);
  }
  public static void main(String[] args) {
        Array12 obj=new Array12(); 
        obj.input();
        obj.avg_even();
    }
}