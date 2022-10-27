
public class MyFirstJavaProgram {
 public  void setIntegerArray(int[] array) {
	for(int i=0; i<array.length;i++) {
		System.out.println("The data stored in array:" +array[i]);
	}
	}
 public void setInt(int a) {
 }
 public static void main(String[] args) {
		int arr[]=new int [2];
		arr[0]=1;
		arr[1]=2;
		int x=20;
		
		MyFirstJavaProgram  obj1 = new MyFirstJavaProgram();
		obj1.setInt(x);
		obj1.setIntegerArray(arr);
		}
	}
