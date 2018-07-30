/**
 * Once created subs/unsubs and prints the puhsed notification
 */
public class Subsubriber {

	private String subName;
	
	private String[] notifications = new String[30];


	public void sub(String s, eventBus eB) {
		//begin
		eB.addsub(this, s);
		//end

	}

	/**
	 * Prints the notifcation from the subsubriber to show the sub received the notification
	 */
	public void printNote(String note) {
		//begin
		int i = 0;
		for(; notifications[i] != null; i++){
			
		}
		notifications[i] = note;
		//end

	}

	public void unsub(String s, eventBus eB) {
		//begin
		eB.unSub(subName, s);
		//end

	}
	public String getname(){
		//begin
		return subName;
		//end
	}
	
	public Subsubriber(String s){
		//begin
		subName = s;
		//end
	}
	

}
