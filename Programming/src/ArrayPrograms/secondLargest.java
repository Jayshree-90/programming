package ArrayPrograms;

public class secondLargest {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 5, 25, 15};

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }

        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("Second Largest Number: " + secondLargest);
        }
    }


	}


