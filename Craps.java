
public class Craps {

	public Craps() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;

		Dice d1 = new Dice(0,0,0);
		System.out.println(d1.toString());
		Rule r1 = new Rule(0);
		System.out.println(r1.toString());
			temp = d1.getsum();
			while(true) {
			Dice d2 = new Dice(0,0,0);
			System.out.println(d2.toString());
			if(d2.getsum() == 7) {
				System.out.println("You lose.");
				break;
			}
			else if(temp == d2.getsum()) {
				System.out.println("和上次為相同數值");
				System.out.println("You win.");
				break;
			}
			else {
				System.out.println("繼續擲骰子");
				temp = d2.getsum();
			}
			}
		}
	}
