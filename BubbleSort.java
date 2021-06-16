package JavaCodes;

import java.util.Scanner;

public class BubbleSort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array-");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter the elements");

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Un Sorted array is-");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
        }

        int temp=0;
        for(int i=0;i<n;i++)
        {
            for(int j=1; j<n-i; j++)
            {
                if(arr[j-1] > arr[j])
                {
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        System.out.println("Sorted array is-");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
