import java.util.Scanner;


public class SelectionSort {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		
		
		int arr[]=new int[10];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		System.out.println("Sorted  array elements are:");

		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int temp;
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
