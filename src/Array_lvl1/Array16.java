package Array_lvl1;
import java.util.*; //non repeating array or unique elements only...
public class Array16
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
  void nonrepeat()
  { int[] arr2 =new int[l];
    int c=0;
    for(int i=0;i<l;i++)
    {  int f=1;
        for(int j=0;j<c;j++)
      { if(arr[i]==arr2[j])
          f=0;
      }
       if(f==1)
       {   arr2[c]=arr[i];
           c++;
           
       }  
    }
    System.out.println("Non Repeating array is:");
    for(int i=0;i<c;i++)
    {
        System.out.print(arr2[i]+"\t");
    }
  }
    public static void main(String[] args)
    { Array16 obj=new Array16();
      obj.input();
      obj.nonrepeat();
        
    }
  
}