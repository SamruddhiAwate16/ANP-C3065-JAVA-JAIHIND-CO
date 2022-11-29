public class CountObj {
static int count;

CountObj() {
	count++;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountObj obj=new CountObj();
		
		System.out.println(count);
	}

}