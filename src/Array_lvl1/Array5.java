package Array_lvl1;
import java.util.*; //merge two array.
public class Array5
{ int[] arr1,arr2,arr3;
  int l1,l2;
  void input()
  {   Scanner ob=new Scanner(System.in);
      int i=0;
      System.out.println("Enter the length of 1st the array:");
      l1=ob.nextInt();
      System.out.println("Enter the length of 2nd the array:");
      l2=ob.nextInt();
      arr1=new int[l1];
      arr2=new int[l2];
      arr3=new int[l1+l2];
      System.out.println("Enter the array1:");
      for(i=0;i<l1;i++)
      {
          arr1[i]=ob.nextInt();
      }
       System.out.println("Enter the array2:");
      for(i=0;i<l2;i++)
      {
          arr2[i]=ob.nextInt();
      }
  }
  void merge()
  {   int i;
      for(i=0;i<l1;i++)
      {
        arr3[i]=arr1[i];
      }
     for(int j=0;j<l2;j++)
     {
         arr3[i++]=arr2[j];
     }
     Arrays.sort(arr3);
     System.out.println("The New array is:");
      for(i=0;i<l1+l2;i++)
          System.out.print(arr3[i]+"\t");
  }
   public static void main(String[] args) {
        Array5 obj=new Array5();
        obj.input();
        obj.merge();
                
    }
  
}
