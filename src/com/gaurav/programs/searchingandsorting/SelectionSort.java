package com.gaurav.programs.searchingandsorting;

class SelectionSort {
	void sort(int arr[]) {
		int n = arr.length;

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element in unsorted array
			int indexOfMinValInArray = i; // consider first index to be minimum for the first time
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[indexOfMinValInArray])
					indexOfMinValInArray = j;

			// Swap the found minimum element with the first element
			int temp = arr[indexOfMinValInArray];
			arr[indexOfMinValInArray] = arr[i];
			arr[i] = temp;
		}
	}

	// Prints the array
	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver code to test above
	public static void main(String args[]) {
		SelectionSort ob = new SelectionSort();
		int arr[] = { 64, 25, 12, 22, 11 };
		ob.sort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}
}