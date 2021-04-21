package start;

	class GFG {
		 
	    // Recursive Function to replace all
	    // occurrences of pi in a given
	    // with 3.14
	    public String replacePi(String str)
	    {
	        // base condition
	        // if the string is empty
	        // or of length one
	        if (str.length() <= 1) {
	            return str;
	        }
	 
	        // if the first character is 'p'
	        // and the first character of the part
	        // passed to recursion is 'i' then replace
	        //"pi" with "3.14"
	        if (str.charAt(0) == 'p' && str.length() >= 2
	            && str.charAt(1) == 'i') {
	            return "3.14" + replacePi(str.substring(2, str.length()));
	        }
	 
	        // if the first character is not 'p'
	        // then just put that character in
	        // front of the answer which came
	        // from recursion
	        return str.charAt(0) + replacePi(str.substring(1, str.length()));
	    }
	 
	    // Driver Code
	    public static void main(String args[])
	    {
	        GFG g = new GFG();
	        String str = "pippppiiiipi";
	        System.out.println(g.replacePi(str));
	    }
	}
