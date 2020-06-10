
import java.util.*;


class BubbleSort{


static void bubblesort(int[] arr,int size)
{
     
     for(int i=0;i<size;i++)
     {
         for(int j=0;j<size-1;j++)
         {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

         }
     }

    print(arr,size); 

}

static void print(int[] array,int size)
{
    System.out.println("After Sort:");
   for(int i=0;i<size;i++)
   {
       System.out.print(array[i]);
   }
}

public static void main(String[] args)
{
     Scanner sc=new Scanner(System.in);

     System.out.println("Enter the size of the array:");
     int size=sc.nextInt();
     int[] arr=new int[size];


     System.out.println("Enter the elements of the array:");
      System.out.println("Before Sort:");
     for(int i=0;i<size;i++)
     {
         arr[i]=sc.nextInt();
     }

    bubblesort(arr,size);
    


}
}
