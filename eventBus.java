/**
 * Handles All the events of the pub-sub's including pushing notifications to subs
 */
public class eventBus {
	
	public newForumm[] newForummList = new newForumm[5];
	
	private String strin;

	public void addsub(Subsubriber s, String st) {
		//begin
		if(findnewForumm(st) == null){return;}
		for(int i = 0; newForummList[i] != null; i++){
			if(newForummList[i].getname().equals(st)){
				for(int j = 0; newForummList[i].sublist[j] != null; j++){
					if(newForummList[i].sublist[j].getname().equals(s.getname())){return;}
				}
				newForummList[i].addsub(s);
			}
		}
		
		
		//end
	}
	

	public void addnewForumm(newForumm fo) {
		//begin
		if(findnewForumm(fo.getname()) != null){return;}
		int i = 0;
		if(newForummList[0] == null){
		newForummList[0] = fo;
		}
		else{
		while(newForummList[i] != null){i++;}
		newForummList[i] = fo;
		}
		
		//end

	}
	
	public newForumm findnewForumm(String s){
		//begin
		for(int i = 0; newForummList[i] != null; i++){
			if(s.equals(newForummList[i].getname())){
				return newForummList[i];
			}
			
		}
		//end
		return null;
		
	}

	public void unSub(String s, String st) {
		
		//begin
		newForumm newForum = findnewForumm(st);
		for(int i = 0; newForum.sublist[i]!= null; i++){
			
			if(s.equals(newForum.sublist[i].getname())){
				
				for(int j = i; newForum.sublist[j] != null; j++){
					newForum.sublist[j] = newForum.sublist[j + 1];
					
				}
				break;
			}
			
		}
	}
		//end

	

	/**
	 * Handles a post event, including adding the post to the database as well as calling notify
	 */
	public void runEvent(String[] e, Publisher p) {
		
		//begin
		Post po = new Post(e[4], p.getname());
		newForumm newForum = findnewForumm(e[2]);
		if(newForum == null){return;}
		Thread th = newForum.findthread(e[3]);
		
		
		
		if(th == null){
			Thread newth = new Thread(e[3]);
			newth.addPost(po);
			newForum.addThread(newth);
		}
		else{
			th.addPost(po);
		}
		
		notify(newForum, p, e[3]);
		
		
		//end

	}

	/**
	 * Notifies all subs associated with that newForumm
	 */
	public void notify(newForumm f, Publisher p, String str) {
		
		//begin
		Thread th = f.findthread(str);
		for(int i = 0; f.sublist[i] != null; i++){
			if(strin == null){
				strin = "Sent to " 
									+ f.sublist[i].getname() 
									+ ": A new post was added by " 
									+ p.getname() + " in " 
									+ f.getname() + ": "
									+ str + ". Posts in thread: "
									+ th.getcount() + ".";
				
		}
		else{
			strin = strin + ";Sent to " 
									+ f.sublist[i].getname() 
									+ ": A new post was added by " 
									+ p.getname() + " in " 
									+ f.getname() + ": "
									+ str + ". Posts in thread: "
									+ th.getcount() + ".";
			
			}
			f.sublist[i].printNote(strin);
			}
			//end
		}
		
		public void printstrin(){
			//begin
			System.out.print(strin);
			//end
		}
		
		
		

	}


