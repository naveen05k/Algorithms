import java.util.*;
public class Linearsearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n =sc.nextInt();
		int f=0,i;
		int[] arr = new int[100];
		for(i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the target value");
		int target =sc.nextInt();
		for(i=1;i<n+1;i++) {
			if(target==arr[i]) {
				f=1;
				break;
			}
		}
			if(f==1) {
				System.out.println("The element is found:"+i);
			}
			else
				System.out.println("not found");

	}

}
