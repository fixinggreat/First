
public class ObjectIntro {

	int Tmoney=81;
	
	public ObjectIntro(){
		
	}
	
	public void addmoney(int amount){
		Tmoney=Tmoney+amount;
	}
	public void usemoney(int amount){
		Tmoney=Tmoney-amount;
	}
	public int left(){
		return Tmoney;
		
	}
}

