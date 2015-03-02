
public class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	public void StartGame(){
		p1=new Player();
		p2=new Player();
		p3=new Player();
		int GuessP1=0;
		int GuessP2=0;
		int GuessP3=0;
		
		
		
		boolean P1isRight=false;
		boolean P2isRight=false;
		boolean P3isRight=false;
		
		int targetNumber=(int) (Math.random()*3);
		System.out.println("I'm thinking of a number 0 and 9...");
		while(true)
		{
			System.out.println("Number to guess is "+ targetNumber);
			p1.Guess();
			p2.Guess();
			p3.Guess();
			GuessP1=p1.x1;
			System.out.println("player one guessed" + GuessP1);
			GuessP2=p2.x2;
			System.out.println("player one guessed" + GuessP2);
			GuessP3=p3.x3;
			System.out.println("player one guessed" + GuessP3);
			if(GuessP1==targetNumber){
				P1isRight=true;
			}
			if(GuessP2==targetNumber){
				P2isRight=true;
			}
			if(GuessP3==targetNumber){
				P3isRight=true;
			}
			if(P1isRight ||P2isRight ||P3isRight){
				System.out.println("we have a winner!");
				System.out.println("player one got it right?" +P1isRight);
				System.out.println("player two got it right?" +P2isRight);
				System.out.println("player three got it right?" +P3isRight);
				System.out.println("Game is over.");
				break;
			}else{
				System.out.println("players will have to try again.");
				
			}
	
		}
		
	}
}

