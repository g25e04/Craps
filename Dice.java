
import java.security.SecureRandom;
public class Dice {

	SecureRandom secureRandom = new SecureRandom();

	public Dice() {
		// TODO Auto-generated constructor stub
	}
	private int dice1;
	private int dice2;
	private int sum;
	
	public Dice(int newdice1, int newdice2, int newsum) {
		setdice1(newdice1);
		setdice2(newdice2);
		setsum(newsum);
	}
	
	public int getdice1() {
		return dice1;
	}
	
	public void setdice1(int dice1) {
		dice1 = (int)(secureRandom.nextInt(6) +1);
		this.dice1 = dice1;
	}

	public int getdice2() {
		return dice2;
	}
	
	public void setdice2(int dice2) {
		dice2 = (int)(secureRandom.nextInt(6) +1);
		this.dice2 = dice2;
	}
	
	public int getsum() {
		return sum;
	}
	
	public void setsum(int sum) {
		sum = getdice1() + getdice2();
		this.sum = sum;
	}
	
	public String toString() {
		return "您的數字為"+ getdice1() + "和" + getdice2() + 
				"您的總和為" + getsum();
	}
}
