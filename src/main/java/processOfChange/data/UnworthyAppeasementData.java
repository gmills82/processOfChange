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
		"I ignore all internal dialogue",
		"Man/Woman up",
		"I pray to the heavens for answers",
		"I distract myself with drink and easy women",
		"I justify why its not a big deal",
		"I invest myself wholeheartedly into my hobbies or work",
		"I seek out wealth and success",
		"I perform charitable acts for others around town",
		"I give of myself to other regardless of my needs",
		"I bend over backwards to please others"
	};

	private static String[] stressData = {
		"I break out in hives whenever ... is mentioned",
		"I eat when not hungry",
		"I pick fights",
		"Facial ticks",
		"Profuse sweating in cold weather",
		"Swearing and abusive language",
		"Crankiness",
		"I am insulting to the people I care about",
		"I kill small animals",
		"I seek comfort in prostitutes",
		"I talk over others too often",
		"I seek attention to comfort my pain",
		"I've begun to drink heavily",
		"I've stopped drinking",
		"I hold my hands a little too close to the fire when no one is watching",
		"I'm secretly aroused by death",
		"I pluck out hairs on my body to acknowledge the pain inside",
		"I have extra gas",
		"I cry over things that shouldn't be upsetting",
		"I laugh as caustic and harsh jokes",
		"One of my appendages has gone numb"
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
