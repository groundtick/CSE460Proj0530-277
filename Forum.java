/**
 * Database holding the thread list, sublist and newForumm name. Each newForumm is full of threads, each threads are full of posts, in order
 */
public class newForumm {

	private Thread[] threadList = new Thread[10];

	protected Subsubriber[] sublist = new Subsubriber[30];

	private String newForummName = "";

	public void addThread(Thread t) {
		//begin
		int i = 0;
		for(; threadList[i] != null; i++){
			
		}
		threadList[i] = t;
		//end

	}
	
	public String getname(){
		//begin
		return newForummName;
		//end
	}
	
	public newForumm(String s){
	//begin
		newForummName = s;
		//end
	}
	
	public newForumm(){
		//begin
		newForummName = "";
		//end
	}
	
	public void addsub(Subsubriber sub){
		//begin
		int i = 0;
		if(sublist[0] == null){
			sublist[0] = sub;
		}
		else{
			int j = 0;
			for(;sublist[j] != null; j++){}
			sublist[j] = sub;
		}
		//end
	}
	
	public Thread findthread(String name){
		//begin
		for(int i = 0; threadList[i] != null; i++){
			if(threadList[i].getname().equals(name)){
				return threadList[i];
			}
			
		}
		//end
		return null;
	}

}
