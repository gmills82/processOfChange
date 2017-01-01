package processOfChange.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Grant Mills
 * @since 12/31/16
 */
public class UnworthyAppeasementData {
	public static List<String> quickSolutionsThatFail = new ArrayList<>();
	public static List<String> stressReactions = new ArrayList<>();

	private static String[] quickData = {
		"all of the easy solutions",
		"rub dirt on it",
		"pray to the heavens for answers",
		"distracts himself with drink and easy women"
	};

	private static String[] stressData = {
		"drinks all of the wine",
		"breaks out in hives",
		"eats when not hungry",
		"picks fights"
	};

	static {
		quickSolutionsThatFail.addAll(Arrays.asList(quickData));
		stressReactions.addAll(Arrays.asList(stressData));
	}

	public static String getRandomQuickSolution() {
		return quickSolutionsThatFail.get(ThreadLocalRandom.current().nextInt(0, quickSolutionsThatFail.size() - 1));
	}

	public static String getRandomStressReaction() {
		return stressReactions.get(ThreadLocalRandom.current().nextInt(0, stressReactions.size() - 1));
	}
}
