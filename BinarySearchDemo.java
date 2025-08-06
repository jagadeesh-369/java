/*import java.util.Scanner;
public class BinarySearchDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter "+n+"Sorted elements.");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to search:");
		int key=sc.nextInt();
		int result=binarySearch(arr,key);
		if(result==-1){
			System.out.println("Elements not found");
		}
		else{
			System.out.println("element found at index"+ result);
		}
		static int binarySearch(int[] arr, int key){
			int l=0,h=arr.length-1;
			while (low<=high){
				int mid=(l+h)/2;
				if(arr[mid]==key){
					return mid;
				}
				else if(arr[mid]<key){
					l=mid+1;
				}
				else{
					h=mid-1;
				}
				
			}
			return -1;
		}
}*/
import java.util.Scanner;

public class BinarySearchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input number of elements
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        // Input sorted array elements
        System.out.println("Enter " + n + " sorted elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Input the element to search
        System.out.println("Enter the element to search:");
        int key = sc.nextInt();
        
        // Perform binary search
        int result = binarySearch(arr, key);
        
        // Output result
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result);
        }
    }

    // Binary search function
    static int binarySearch(int[] arr, int key) {
        int l = 0;
        int h = arr.length - 1;
        
        // Perform the binary search
        while (l <= h) {
            int mid = (l + h) / 2;
            
            if (arr[mid] == key) {
                return mid;  // Key found, return its index
            } else if (arr[mid] < key) {
                l = mid + 1;  // Ignore the left half
            } else {
                h = mid - 1;  // Ignore the right half
            }
        }
        
        return -1;  // Key not found
    }
}

