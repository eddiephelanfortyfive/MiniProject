package MiniProject;

import java.util.ArrayList;

public class UIHelper {

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
for(int i=0; i<welcome.length(); i++) {		
System.out.print(welcome.charAt(i));
try {
	Thread.sleep(3);	//sleep delays the loop by 3 milliseconds to create the look that the string is being typed
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
	System.out.printf(""
			+ "---------------------------------\n"
			+ "Your mean is %.2f\n" 
			+ "Your median is %.2f\n" 
			+ "Your standard deviation is %.2f\n"
			+ "---------------------------------\n"
			+ "\n"
			+ "---------------------------------------\n" 
            + "The global mean is %.2f\n" 
            + "The global median is %.2f\n" 
            + "The global standard deviation is %.2f\n"
            + "---------------------------------------\n"
            + "\n"
            + "----------------------------------------------------------------------\n" 
            + "Your mean is %s the global mean.\n" 
            + "Your median is %s the global median.\n" 
            + "Your standard deviation is %s the global standard deviation.\n"
            + "----------------------------------------------------------------------\n"
            + "\n"
            + "========================================\n" 
            + "Thanks for playing! See you next time!!!\n"
            + "========================================\n",
            currentPlayer.get(0), currentPlayer.get(1), currentPlayer.get(2),
            allPlayers.get(0), allPlayers.get(1), allPlayers.get(2),
            comparisons.get(0), comparisons.get(1), comparisons.get(2));

	
}
public void printScore(int score) {
	System.out.println("Your final score is: " + score);
	System.out.print("Your score history:");
	
}
}

	
	

