/**
 * Used to hold the publisher event calls
 */
public class Publisher {

	private String pubName;

	public void publish(String[] s, eventBus eB) {
		//begin
		eB.runEvent(s, this);
		//end

	}
	
	public Publisher(String s){
		//begin
		pubName = s;
		//end
	}
	
	public String getname(){
		//begin
		return pubName;
		//end
	}

}
