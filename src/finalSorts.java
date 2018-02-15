
public class finalSorts {

	public static void main(String[] args) {
		
		String[] test1 = {"bapple", "goober", "zoop", "moo", "boi" };
		String[] test2 = {"mahogony", "cherry", "oh", "bonono", "posta"};
		int[] test3 = {4, 1, 5, 7, 12, 19, 0, 1};
		
		
		
		
	}
	
	
	public static String[] merge(String[] list, String[] list2) {
		int i = 0;
		int j = i+1;
		
		while (i < list.length && j < list2.length) {
			if (list[i].compareTo(list2[j]) < 0) {
				j++;
			}
			if (list[i].compareTo(list2[j]) > 0) {
				//
			}
				
		}
	}
	
	
	
	/* Write a method that recursively separates the list into two halves and calls mergeSort on both
	halves. When we reach two halves that have length 1, then merge the arrays together. Return the 
	fully sorted array. */
	
	//use copyOfRange(list[] yikes, int from, int to)
	public static String[] mergeSort(String[] list) {
		if(list.length <= 1)
			return list;
		
		//split array in half into left and right
		return(merge (mergeSort(left), mergeSort(right)));
		
	}
	
	public static int partition(int[] list1, int front, int back) {
		int pivot = list1[front];
		while (front < back) {	
			while (list1[front] < pivot) {
				front++;
			}
			while (list1[back] > pivot) {
				back--;
			}
			if (front < back)
				swap (list1, front, back);
			
			front++;
			back--;
		}
		return front;
		
	}
	
	/* QuickSort recursively partition the array until we have found an array where front and back are
	equivalent. The recursion is similar to mergeSort because it divides and conquers the array. Use
	the partition method in this algorithm. Return the new position of the pivot. returns position of pivot */
	public static void quickSort(int[] list1, int front, int back) {
		if (back > front) {
			int pivPos = partition(list1, front, back);
			quickSort(list1, front, pivPos); //left
			quickSort(list1, pivPos, back);	//right
		}
	}
	
	
	
	public static void swap (int arr[], int x, int y)
	   {
	      int swap = arr[x];
	      arr[x] = arr[y];
	      arr[y] = swap;
	   }
	
	
}
