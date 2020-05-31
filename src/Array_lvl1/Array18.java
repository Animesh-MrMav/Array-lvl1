package Array_lvl1;
import java.util.*; //frequency of each element in the array.
public class Array18
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
  void freq_unique()
  { int[] arr2 =new int[l];
  int[] fq =new int[l];
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
    for(int i=0;i<c;i++)
    {   int fi=0;
        for(int j=0;j<l;j++)
        {  if(arr[j]==arr2[i])
            fi++;
            
        }
        fq[i]=fi;
    }
      System.out.println("Element\t\tFrequency");
      for(int i=0;i<c;i++)
          System.out.println(arr2[i]+"\t\t"+fq[i]);
    
  }
  public static void main(String[] args)
    { Array18 obj=new Array18();
      obj.input();
      obj.freq_unique();
        
    }
}
