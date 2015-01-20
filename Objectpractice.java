
public class Objectpractice {
	
	int minutes=0;
	
	public Objectpractice(){
		
	}
	
 	public void Addminutes(int added){
		minutes=minutes+added;
		
		
	}
	
	public void Useminutes(int used){


		minutes=minutes-used;
	}
	
	public int minutesleft(){
		return minutes;
	}
}
