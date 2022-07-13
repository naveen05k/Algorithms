import java.util.Scanner;

public class Selectionsort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int n = sc.nextInt();
		int arr[] = new int [100];
		int i,j;
		System.out.println("Enter the array elements");
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("After sorting");
		for(i=0;i<n;i++) {
			System.out.println(arr[i]);
		}

	}

}
