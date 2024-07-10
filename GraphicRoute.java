package dungeon.crawler;

public class GraphicRoute {
	
	public static void drawRoute() {
		String a = """
	   \\   \\              /   /
	    \\   \\            /   / 
	     \\   \\          /   /  
	      \\   \\        /   /   
	       \\   \\      /   /    
	        \\   \\    /   /     
	         \\   \\  /   /      
	          \\   \\/   /       
	           \\      /         
	            |     |          
	            |     |          
	            |     |          
	            |     |          
					""" ;
		System.out.println(a);
	}
	
	public static void takeRight() {
		String a = """
	 \\   \\              / * /
	  \\   \\            / * / 
	   \\   \\          / * /  
	    \\   \\        / * /   
	     \\   \\      / * /    
	      \\   \\    / * /     
	       \\   \\  / * /      
	        \\   \\/ * /       
	         \\    * /         
	          |  *  |          
	          |  *  |          
	          |  *  |          
	          |  *  |          
				""" ;
		System.out.println(a);
	}

	
	public static void takeLeft() {
		String a = """
		
	     \\ * \\              /   /
	      \\ * \\            /   / 
	       \\ * \\          /   /  
	        \\ * \\        /   /   
	         \\ * \\      /   /    
	          \\ * \\    /   /     
	           \\ * \\  /   /      
	            \\ * \\/   /       
	             \\ *    /         
	              |  *  |          
	              |   * |          
	              |   * |          
	              |   * |      
	              
				"""    ;
		
	    System.out.println(a);
	}

}
