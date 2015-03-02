import java.util.Scanner;
public class Player {
		int x1;
		int x2;
		int x3;
		public void Guess(){
			Scanner player=new Scanner(System.in);
			System.out.print("player 1,enter your guess number ?");
			x1=player.nextInt();
			System.out.print("player 2,enter your guess number ?");
			x2=player.nextInt();
			System.out.print("player 3,enter your guess number ?");
			x3=player.nextInt();
			
		}
}