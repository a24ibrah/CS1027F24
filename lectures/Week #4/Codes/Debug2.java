
public class Debug2 {

	private static boolean different (int[] a, int n) {
	/* In: Array a storing n integer values
	 * Out: True if all values in a are different; 
	 *      false otherwise
	 */
		boolean flag = true;
		for (int i = 0; i < n; ++i)
			for (int j = 1; j < n; ++j)
					if ((i != j) && (a[i] == a[j])) flag = false;
					else flag = true;
		return flag;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,3};
		if (different(arr,3)) 
			System.out.println("All values are different");
		else System.out.println("There are duplicated values");
	}

}
