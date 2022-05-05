
public class CheckResult {

	public static int getNumX(String[] code, String[] guess) {
		
		int x= 0;
		for (int i=0; i<4; i++) {
			if(guess[i].equals(code[i])){
				x++;
			}
		}
		return x;
		
	
	}
	public static int getNumO(String[] code, String[] guess){
		   int os=0;
		   String code1=new String(code[0]);
		   String code2=new String(code[1]);
		   String code3=new String(code[2]);
		   String code4=new String(code[3]);
		   
		   for(int i=0;i<code.length;i++){
			   if(guess[i].equals(code[i])) {
		    	String selectedColor = code[i];
		    		if (selectedColor.equals(code[0])) {
				    	code[0] = "Nice";
				    		}
				    		if (selectedColor.equals(code[1])) {
					    		code[1] = "Nice";		
					    	}
				    		if (selectedColor.equals(code[2])) {
					    		code[2] = "Nice";		
					    	}
				    		if (selectedColor.equals(code[3])) {
					    		code[3] = "Nice";
					    	}
		       }
		       }
		    		
		    	for (int k=0; k<code.length; k++) {
		    		String colorUsed = guess[k];
		    		if (guess[k].equals(code[0])) {
		    			os++;
		    			code[0] = "Nice";	
		    			if (colorUsed.equals(code[1])){
		    				code[1] = "Nice";
		    			}
		    			if (colorUsed.equals(code[2])){
		    				code[2] = "Nice";
		    			}
		    			if (colorUsed.equals(code[3])){
		    				code[3] = "Nice";
		    			}
		    		}
		    		else if (guess[k].equals(code[1])) {
		    			os++;
		    			code[1] = "Nice";  	
		    			if (colorUsed.equals(code[0])){
		    				code[10] = "Nice";
		    			}
		    			if (colorUsed.equals(code[2])){
		    				code[2] = "Nice";
		    			}
		    			if (colorUsed.equals(code[3])){
		    				code[3] = "Nice";
		    			}
		    		}
		    		else if (guess[k].equals(code[2])) {
		    			os++;
		    			code[2] = "Nice";
		    			if (colorUsed.equals(code[1])){
		    				code[1] = "Nice";
		    			}
		    			if (colorUsed.equals(code[0])){
		    				code[0] = "Nice";
		    			}
		    			if (colorUsed.equals(code[3])){
		    				code[3] = "Nice";
		    			}
		    		}
		    		else if (guess[k].equals(code[3])) {
		    			os++;
		    			code[3] = "Nice";
		    			if (colorUsed.equals(code[1])){
		    				code[1] = "Nice";
		    			}
		    			if (colorUsed.equals(code[2])){
		    				code[2] = "Nice";
		    			}
		    			if (colorUsed.equals(code[0])){
		    				code[0] = "Nice";
		    			}
		    		}  		
		    	}	      
		       
		       code[0] = code1;
		       code[1] = code2;
		       code[2] = code3;
		       code[3] = code4;
		       return os;
	}
}
