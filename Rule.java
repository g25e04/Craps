
public class Rule extends Dice{

	public Rule() {
		// TODO Auto-generated constructor stub
	}
	Dice d1 = new Dice(0,0,0);
	private int temp;

	public Rule(int newtemp) {
		settemp(newtemp);
	}
	
	public int gettemp() {
		return temp;
	}
	
	public void settemp(int temp) {
		temp = super.getsum();
		this.temp = temp;
	}
	
	public String toString() {
		if(d1.getsum() == 2 || d1.getsum() == 3 || d1.getsum() == 12) {
			return "You lose.";
		}
		
		else if (d1.getsum() == 7 || d1.getsum() == 11) {
			return "You win.";
		}
		else
			settemp(1);
			return "Ä~ÄòÂY»ë¤l";
	}
	
	}