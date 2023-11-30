package MiniProject;

import java.util.ArrayList;

public class UIHelper {
	private String line = "---------------------------------------------------------------------------------------------------------\n";
	private String doubleLine = "=========================================================================================================\n";
	private String goodbye = "\n                                  Thanks for playing! See you next time!!!\n\n";
	private static final String ALL_PLAYERS_STATISTICS = "all";
	//different speeds the text is typed to the screen
	private static final int TEXT_SLEEP_FAST = 3;
	private static final int TEXT_SLEEP_MEDIUM_FAST = 5;
	private static final int TEXT_SLEEP_MEDIUM_SLOW = 7;
	private static final int TEXT_SLEEP_SLOW = 10;
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

		typingText(welcome, TEXT_SLEEP_FAST);

	}

	public void typingText(String text, int sleepTime) {
		for (int i = 0; i < text.length(); i++) {
			System.out.print(text.charAt(i));
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void printStats(String username1, int score) {
		//print all the stats
		TextHandler scoreWriter = new TextHandler();
		scoreWriter.WriteScore(username1, score);
		StatsForMaths getStats = new StatsForMaths();

		ArrayList<Double> currentPlayer = getStats.getPlayerStats(username1);
		ArrayList<Double> allPlayers = getStats.getPlayerStats(ALL_PLAYERS_STATISTICS);
		ArrayList<String> comparisons = getStats.compareStats(currentPlayer, allPlayers);

		typingText(line, TEXT_SLEEP_MEDIUM_SLOW);
		System.out.printf(
				"                                          Your mean is %.2f\n"
						+ "                                         Your median is %.2f\n"
						+ "                                   Your standard deviation is %.2f\n",
				currentPlayer.get(0), currentPlayer.get(1), currentPlayer.get(2));
		typingText(line, TEXT_SLEEP_MEDIUM_SLOW);
		System.out.printf(
				"                                       The global mean is %.2f\n"
						+ "                                      The global median is %.2f\n"
						+ "                                 The global standard deviation is %.2f\n",
				allPlayers.get(0), allPlayers.get(1), allPlayers.get(2));
		typingText(line, TEXT_SLEEP_MEDIUM_SLOW);
		System.out.printf(
				"                                 Your mean is %s the global mean.\n"
						+ "                               Your median is %s the global median.\n"
						+ "                   Your standard deviation is %s the global standard deviation.\n\n",
				comparisons.get(0), comparisons.get(1), comparisons.get(2));
		typingText(doubleLine, TEXT_SLEEP_SLOW);
		typingText(goodbye, TEXT_SLEEP_SLOW);
		typingText(doubleLine, TEXT_SLEEP_SLOW);

	}

	public void printScore(int score) {
		typingText(line, TEXT_SLEEP_MEDIUM_FAST);
		System.out.println("Your final score is: " + score);

	}
	//methods to call the values outside UIHelperZ
	public int GetTEXT_SLEEP_FAST() {
		return TEXT_SLEEP_FAST;
		
	}
	public int GetTEXT_SLEEP_MEDIUM_FAST() {
		return TEXT_SLEEP_MEDIUM_FAST;
		
	}
	public int GetTEXT_SLEEP_MEDIUM_SLOW() {
		return TEXT_SLEEP_MEDIUM_SLOW;
		
	}
	public int GetTEXT_SLEEP_SLOW() {
		return TEXT_SLEEP_SLOW;
		
	}
	
}
