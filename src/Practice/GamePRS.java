package Practice;

import org.w3c.dom.css.Counter;

//SP=S
//PR=P
//RS=R
public class GamePRS {

	static int  counter=0;
	public static char tough(char p1,char p2) {
		if((p1=='S' && p2=='P') || (p1=='P' && p2=='S')){
			return 'S';
		}else if((p1=='P' && p2=='R') || (p1=='R' && p2=='P')) {
			return 'P';
		}else if((p1=='R' && p2=='S') || (p1=='S' && p2=='R')) {
			return 'R';
		}else if(p1==p2) {
			return 'O';
		}
		return 'O';
	}
	
	public static char suggestPlayer(char p1) {
		if(p1=='P') {
			return 'S';
		}else if(p1=='R'){
			return 'P';
		}else {
			return 'R';
		}
	}

	public static char[] newPlayerArray(int size,int pos,String players) {
		if(players.length()>=pos) {
			char[] playChar=new char[size];
			char[] temp=players.toCharArray();
			int ip=0;
			for(int i=0;i<pos;i++) {
				playChar[ip]=temp[i];
				ip++;
			}
			playChar[ip]='#';
			ip++;
			for(int i=pos;i<temp.length;i++) {
				playChar[ip]=temp[i];
				ip++;
			}
			return playChar;	
		}else {
			return players.toCharArray();
		}
		
	}
	
	public static void game(int size,int pos,String players) {
		char[] playChar=newPlayerArray(size, pos, players);
		String result;
		for (char c : playChar) {
			System.out.print(c);
		}
		System.out.println();
		
		char best;
		if(pos==playChar.length-1 && pos%2==0) {
			if(playChar[pos]=='#') {
				best=suggestPlayer(playChar[pos-1]); 
			}else {
				best=playChar[pos];
			}
			
		}else {
			if(playChar.length>1) {
				
				if(pos%2==0) {
					best=suggestPlayer(playChar[pos+1]); 
				}else {
					best=suggestPlayer(playChar[pos-1]); 
				}
			}else {
				best=playChar[0];
			}
		}
		
		System.out.println("Suggested Best Player is : "+best);
		playChar[pos]=best;
		for (char c : playChar) {
			System.out.print(c);
		}
		System.out.println();
		
		if(playChar.length>2) {
			result=playgame(playChar);
			System.out.println("Played Game is : "+result);
			
			while(result.length()!=2 && result.length()>2) {
				char[] newPlayer=result.toCharArray(); 
				pos=pos/2;
				if(pos==(newPlayer.length-1) && pos%2==0) {
					best=newPlayer[pos];
				}else {
					if(newPlayer.length>1) {
						
						if(pos%2==0) {
							char c=suggestPlayer(newPlayer[pos+1]);
							if(newPlayer[pos]!=c) {
								counter++;
								best=suggestPlayer(newPlayer[pos+1]);
								newPlayer[pos]=best;
								System.out.println("Suggested Updated Best Player is : "+best);
							}else {
								best=newPlayer[pos];
								System.out.println("Suggested As it is  Player is : "+best);
							}
							
							
						}else {
							char c=suggestPlayer(newPlayer[pos-1]);
							if(newPlayer[pos]!=c) {
								counter++;
								best=suggestPlayer(newPlayer[pos-1]);
								newPlayer[pos]=best;
								System.out.println("Suggested Updated Best Player is : "+best);
							}else {
								best=newPlayer[pos];
								System.out.println("Suggested As it is  Player is : "+best);
							}
							
						}
					}else {
						best=newPlayer[0];
					}
				}
				
				result=playgame(newPlayer);
				System.out.println("Played Game is : "+result);
			}
			
			if(result.length()==2) {
				char[] lastPlayers=result.toCharArray();
				pos=pos/2;
				if(pos%2==0) {
					char c=suggestPlayer(lastPlayers[pos+1]);
					if(lastPlayers[pos]!=c) {
						counter++;
						best=suggestPlayer(lastPlayers[pos+1]);
						lastPlayers[pos]=best;
						System.out.println("Suggested Updated Best Player is : "+best);
					}else {
						best=lastPlayers[pos];
					}
					
					
				}else {
					char c=suggestPlayer(lastPlayers[pos-1]);
					if(lastPlayers[pos]!=c) {
				
						counter++;
						best=suggestPlayer(lastPlayers[pos-1]);
						lastPlayers[pos]=best;
						System.out.println("Suggested Updated Best Player is : "+best);
					}else {
						best=lastPlayers[pos];
					}
					
				}
				lastPlayers[pos]=best;
				
				result=playgame(lastPlayers);
				System.out.println("Winner is :"+result);
				System.out.println("Counter is :"+counter);
				return;
			}
			
		}else {
			
			if(pos%2==0) {
				
				char c=suggestPlayer(playChar[pos+1]);
				if(playChar[pos]!=c) {
					counter++;
					best=suggestPlayer(playChar[pos+1]);
					System.out.println("Suggested Updated Best Player is : "+best);
				}else {
					best=playChar[pos];
				}
				
				
			}else {
				char c=suggestPlayer(playChar[pos-1]);
				if(playChar[pos]!=c) {
					counter++;
					best=suggestPlayer(playChar[pos-1]);
					System.out.println("Suggested Updated Best Player is : "+best);
				}else {
					best=playChar[pos];
				}
				
			}
			playChar[pos]=best;
			
			result=playgame(playChar);
			System.out.println("Winner is :"+result);
			System.out.println("Counter is :"+counter);
			return;
		}
		System.out.println("Counter is :"+counter);
	}
	
	
	public static String playgame(char[] play) {
		String res="";
		if(play.length%2==0) {
			for(int i=0;i<play.length;i=i+2) {
				char c=tough(play[i], play[i+1]);
				if(c=='O') {
					
				}
				else {
					res=res+tough(play[i], play[i+1]);	
				}
			}
		}else {
			for(int i=0;i<play.length-1;i=i+2) {
				char c=tough(play[i], play[i+1]);
				if(c=='O') {
					
				}
				else {
					res=res+tough(play[i], play[i+1]);
				}
			}
			res=res+play[play.length-1];
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		String players="RP";
		game(players.length()+1,2,players);
	}

}
