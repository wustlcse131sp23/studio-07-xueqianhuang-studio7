package studio7;

public class Die {
	private int number;
	
	public Die() {
		number = 1;
	}
	/***
	 * 
	 * @param initNumber is specified to have n number of sides
	 */
	public Die(int initNumber) {
		this.number = initNumber;
	}
	/***
	 * 
	 * @return the random number 
	 */
	public int dieNumber() {
		int number = (int) (Math.random() * this.number + 1);
		return number;
	}

	public static void main(String[] args) {
		Die a = new Die(10);
		System.out.println(a.dieNumber());
	}

}
