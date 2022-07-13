import java.util.*;
public class Binearysearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[100];
		System.out.println("enter the array size");
		int n = sc.nextInt(),i;
		System.out.println("Enter array");
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int first =0;
		int last = n-1;
		int mid=(first+last)/2;
		System.out.println("Enter the search elements");
		int search = sc.nextInt();
		while(first<=last) {
		if(arr[mid]<search) 
			first = mid+1;
		else if (arr[mid]==search) {
			System.out.println("The element is found in "+mid+ " position");
			break;
			
		}
		else 
			last = mid-1;
			mid=(first+last)/2;
		}
		if(first>last) {
			System.out.println("not found");
		}
	

	}

}
