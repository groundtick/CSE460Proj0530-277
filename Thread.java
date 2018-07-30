public class Thread {

	private Post[] postList = new Post[30];
	
	private int postCount;
	
	private String threadName;

	public void addPost(Post p) {
		//begin
		int i = 0;
		for(; postList[i] != null; i++){
			
		}
		postList[i] = p;
		
		postCount += 1;
		
		//end

	}
	
	public Thread(String s){
		//begin
		threadName = s;
		postCount = 0;
		//end
	}
	
	public String getname(){
		//begin
		return threadName;
		//end
	}
	
	
	public int getcount(){
		//being
		return postCount;
		//end
	}

}
