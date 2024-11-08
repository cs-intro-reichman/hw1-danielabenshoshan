// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		int lim = Integer.parseInt(args[0]);
		int a = (int) (Math.random()*lim);
		int b = (int) (Math.random()*lim);
		int c = (int) (Math.random()*lim);
		int minNum = Math.min((Math.min(a,b)), c); //useful, one line instead of more code lines
		int maxNum = Math.max((Math.max(a, b)), c);
		int middleNum = ((a+b+c) - (maxNum+minNum));

		System.out.println(a+" "+b+" "+c);
		System.out.println(minNum+" "+middleNum+" "+maxNum);
		
		
	}
}
