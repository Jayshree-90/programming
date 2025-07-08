package practice;

public class Array2HighestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,39,39,4};
	    int largest = -1, secondLargest = -1;

	    // finding the largest element
	    for (int i = 0; i < a.length; i++) {
	        if (a[i] > largest)
	            largest = a[i];
	    }

	    // finding the second largest element
	    for (int i = 0; i < a.length; i++) {

	        // Update second largest if the current element is greater
	        // than second largest and not equal to the largest
	        if (a[i] > secondLargest && a[i] != largest) {
	            secondLargest = a[i];
	        }
	    }
		System.out.println(secondLargest);

	}

}
