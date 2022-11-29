package question3;

public class ArraySortDemo {
	public void sortArray(float[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					float temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {

			System.out.println("The sorted array is:" + array[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] array = { (float) 30.30, (float) 40.40, (float) 60.60 };
		ArraySortDemo obj = new ArraySortDemo();
		obj.sortArray(array);
	}

}
