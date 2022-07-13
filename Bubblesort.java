import java.util.Scanner;

public class Bubblesort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n = sc.nextInt();
		System.out.println("enter the array");
		int arr[] = new int[100];
		int i,j;
		for(i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(i=0;i<n;i++) {
			System.out.println(arr[i]);
		}

	}

}
