import java.util.Random;
public class Lab103 {
	public static double E = 2.718;
	public static double PI = 3.1415;
	private static Random randomNumberGenerator;
	
	private Lab103(){
	}
	public static int getRandomnumber() {
		int randomnumber=randomNumberGenerator.nextInt();
		return randomnumber;
	}
	public static int max(int number1, int number2) {
		return Math.max(number1, number2);
	}
	public static long max(long number1, long number2) {
		return Math.max(number1, number2);
	}
	public static double sin(double number1) {
		return Math.sin(number1);
	}
	public static double cos(double number1) {
		return Math.cos(number1);
	}
	public static double log(double number1) {
		return Math.log(number1);
	}
	public static double floor(double number1) {
		return Math.floor(number1);
	}
	public static double ceil(double number1) {
		return Math.ceil(number1);
	}
	public static double pow(double number1, double number2) {
		return Math.pow(number1,  number2);
	}
	public static void main(String []args) {
		System.out.println(Lab103.max(10,20));
		System.out.println(Lab103.max(1230,4650));
		System.out.println(Lab103.sin(13));
		System.out.println(Lab103.cos(56));
		System.out.println(Lab103.log(23));
		System.out.println(Lab103.floor(45));
		System.out.println(Lab103.ceil(63));
		System.out.println(Lab103.pow(34,98));
		System.out.println(Lab103.PI);
		System.out.println(Lab103.E);
	}
	
}
