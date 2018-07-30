public class Post {

	private String post;

	private String poster;
	
	public Post(String pos, String poste){
		//begin
		post = pos;
		poster = poste;
		//end
		
	}
	
	public String getpost(){
		//begin
		return poster + "," + post;
		//end
	}
	
	public String getposter(){
		//begin
		return poster;
		//end
	}

}
