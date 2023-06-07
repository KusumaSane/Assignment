/*  Alex works at a clothing store. There is a large pile of socks that must be paired by color for sale. 
Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
1 <= n <= 100
1 <= ar[i] <= 100 & 0 <= i < n   */
import java.util.*;
class Main
{
    public static int sockMerchant(int n, int arr[])
    {
         int freq[]=new int[101];
        for(int i=0;i<n;i++)
        {
            freq[arr[i]]++;
        }
        int ans=0;
        for(int i=0;i<=100;i++)
            ans=ans+freq[i]/2;
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of socks");
        int n=sc.nextInt();
        System.out.println("enter  socks colours in numbers");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int ans=sockMerchant(n,arr);
        System.out.println("number of pairs is "+ans);

    }
}