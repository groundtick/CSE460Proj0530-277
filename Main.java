import java.util.*;

public class Main{
	
	public static void main(String[] args){
		eventBus eB = new eventBus();
		inputBuf iB = new inputBuf();
		subanner suban = new subanner(System.in);
		int i = 0;
		while(suban.hasNextLine()){
			iB.readOp(suban, eB);
			i++;
			
		}
		eB.printstrin();
		
	}

}