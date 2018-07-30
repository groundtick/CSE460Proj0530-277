/**
 * Handles reading and adding subs and pubs to a global sub/pub list as well as executing the operation read
 */
 import java.util.*;
 
public class inputBuf {


	public String readOp(subanner suban, eventBus eB) {
		//begin
		 String subanned = suban.nextLine();
		 
		 String delim = "[,]";
		 
		 String[] Tokens = subanned.split(delim);
		 for(int i = 0; i < Tokens.length; i++){
			 Tokens[i] = Tokens[i].toLowerCase();
			 
		 }
		 
		 if(Tokens[0].equals("new newForumm")){
			 newForumm f = new newForumm(Tokens[1]);
			 eB.addnewForumm(f);
		 }
		 else if(Tokens[0].equals("subsubribe")){
			 Subsubriber sub = new Subsubriber(Tokens[1]);
			 sub.sub(Tokens[2], eB);
			 
		 }
		 else if(Tokens[0].equals("unsubsubribe")){
			 eB.unSub(Tokens[1], Tokens[2]);
			 
		 }
		 else if(Tokens[0].equals("new post")){
			 Publisher pub = new Publisher(Tokens[1]);
			 pub.publish(Tokens, eB);
			 
		 }
		//end
		return subanned;
	}



}
