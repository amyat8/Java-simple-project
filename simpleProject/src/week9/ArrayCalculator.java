package week9;

public class ArrayCalculator {
	
	private int[] numbers;
	ArrayCalculator(int[] numbers){
		this.numbers = numbers;
	}

	public void divideElements(int index1, int index2) {
		try {
			System.out.println(numbers[index1]/numbers[index2]);
		}
		catch(ArithmeticException e) {
			System.out.println("can't divie by 0.");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("wrong index.");
		}
		finally {
			System.out.println("catch exception or not, finally worked.");
		}
	}

}
