package MiniProject;

import java.util.ArrayList;

public class UIHelper {
	private String line = "------------------------------------------------------------------------------------------\n";
	private String doubleLine="==========================================================================================\n";
	private String goodbye="\n             Thanks for playing! See you next time!!!\n\n";

public void welcome() {
	
	String welcome = """
            
            
            
            ---------: .-                       ----: :--   .:----:.   --------. ----:              
                ==     :+                      .++:.. =+=  -++:..:++-  ++-:::::. ..=+-              
                ==     :+:--==:   :=--=-       .++.   =+=  =+=:.       ++:         =+-              
                ==     :+.   :+. -=    -+      .++.   =+=   -=++++=-   ++++++++    =+-              
                ==     :+     +. +=------      .++.   =+=       .:=++  ++-         =+-              
                ==     :+     +. -=    .:      .++.   =+=  =+=....=+=  ++-.....    =+-              
                --     :=     =.  :-----.      .++.   -=-   :-====-:   ========.   =+-              
                                               .++--:                            --=+-              
                                                .....                            .....              
                                                                                                    
                                                                                                    
        .:----:                                              .-.                                    
       ==.    :+-                                            .+:                                    
      ==        .   -=--=:  .=:--=-.---=:   :=--=:   :=--=-  .+----=:   .----=:  =:   ==.  .=       
      +-    :::::  .:   .+: :+.   +=   .+. -=    ==  +-   :. .+-   .+: .+.    =- :+  :=-=  =-       
      ==    ...:+. .----=+: :+    =-   .+. +=------  .-===:  .+:    +- -+     -+  =: +. +..+        
      .=-     .==  +:   :+: :+    =-   .+. -=    ::  :    =- .+:    +- .+:    =-  .+--  :=--        
        :-=-==-.   :=---:=: .=    -:    =.  :----:   :-----  .=.    =:  .-----:    -=    -=         
                                                                                                    

		""";

	typingText(welcome,3);
	
}
public void typingText(String text, int sleepTime) {
	for(int i=0; i<text.length(); i++) {		
		System.out.print(text.charAt(i));
		try {
			Thread.sleep(sleepTime);	//sleep delays the loop by 3 milliseconds to create the look that the string is being typed
		} catch (InterruptedException e) {
			e.printStackTrace();
		}}
}
public void printStats(String username1) {
	StatsForMaths getStats = new StatsForMaths();
	
	ArrayList<Double> allPlayers = getStats.getStats();
	ArrayList<Double> currentPlayer = getStats.getPlayerStats(username1);
	ArrayList<String> comparisons = getStats.compareStats(currentPlayer, allPlayers);

	//This prints the statistics 
	
	typingText(line,7);
	System.out.printf("                                   Your mean is %.2f\n"
			+ "                                  Your median is %.2f\n"
			+ "                            Your standard deviation is %.2f\n",currentPlayer.get(0), currentPlayer.get(1), currentPlayer.get(2));
	typingText(line,7);
	System.out.printf("                                The global mean is %.2f\n"
			+ "                               The global median is %.2f\n"
			+ "                          The global standard deviation is %.2f\n",allPlayers.get(0), allPlayers.get(1), allPlayers.get(2));
	typingText(line,7);
	System.out.printf("                          Your mean is %s the global mean.\n"
			+ "                        Your median is %s the global median.\n"
			+ "            Your standard deviation is %s the global standard deviation.\n\n", comparisons.get(0), comparisons.get(1), comparisons.get(2));
	typingText(doubleLine,10);
    typingText("\n                       Thanks for playing! See you next time!!!\n\n",10);
    typingText(doubleLine,10);
            

	
}
public void printScore(int score) {
	typingText(line,5);
	System.out.println("Your final score is: " + score);
	System.out.print("Your score history:");
	
}
}

	
	

