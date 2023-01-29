package regular_experation.packages;

public class Regex {
	public static void main(String[] args) {
//		Regex API
//		 -> matches()
		
		String regex = "Manohar";
		String input = "Ravi";
		
//		System.out.println(input.matches(regex));
		
		String sp = "Hey,buddy,how,are,you?";
		String [] array = sp.split(",");
		for(String ar : array) {
//			System.out.println(ar);
		}
		
		String nameRegex = "([A-Za-z ]+)";
		String emailRegex = "([A-Za-z0-9-_]+)[@](gmail|yahoo|linkdin|facebook|twitter)[.](com|in)";
		
		String name = "Manohar";
		String email = "manohar@facebook.in";
//		System.out.println(name.matches(nameRegex));
//		System.out.println(email.matches(emailRegex));
		
		/*
		 * 		Meta Characters....... 
		 * 
		 * 		[] -> [xyz]
		 * 		
		 * 		. -> b.t matches = bat , b$t, bRt
		 * 
		 * 		[^] -> [^xyz] matches 'a', '6' all matches except xyz
		 * 	
		 * 		| or -> bat|cat matches bat or cat
		 * 
		 * 		() ->  Ma(nn|tt)er matches Manner or Matter.
		 * 
		 * 	
		 * 		\n -> ([a-z])\1 - pending
		 * 
		 * 		// Quantifiers
		 * 
		 * 		? -> Ba?it -> Bait, Bit -> zero / one time
		 * 
		 * 		* -> 10*1 -> 11, 1000001 -> zero / more times.
		 * 
		 * 		+ -> 10+1 -> 101, 100000001 -> one time / more than one time.
		 * 	
		 * 		{m} -> 10{4}1 => 100001 -> Matches the preceding vlaue exactly m times.
		 * 		
		 * 		{m,} -> 10{3,} => 10001, 10000000001 -> Mathces the preceding element m or more times.
		 * 
		 * 		{m,n} -> 10{2,5} -> 1001, 10001, 100001, 1000001 -> Matches the preceding element minimum m and maximum n times.
		 * 
		 * 
		 */
		
		String regexTest = "ba{2,5}t";
		System.out.println("baat".matches(regexTest));
		
		
		
		
		
		
		
		
	}
}
