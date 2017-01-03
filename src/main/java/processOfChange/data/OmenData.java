package processOfChange.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Grant Mills
 * @since 12/31/16
 */
public class OmenData {
	public static List<String> epDataList = new ArrayList<>();
	public static List<String> stDataList = new ArrayList<>();

	private static String[] epData = {
		"A nearby militia has grown in strength and is moving towards the borders of my home",
		"My relative has come down with a strange illness",
		"My wife is away on business and I have been tending to the children for 3 months",
		"My friend just died",
		"I am about to become eligible for the draft",
		"A dragon has been spotted in my county",
		"Kobolds are making tunnels beneath my village",
		"The fishermen are unable to bring in food for town",
		"Hunters claim there is no game to be found in the woods",
		"An opposing army is marching towards us",
		"I have fallen ill with a disease",
		"I have been asked to make an impossible choice",
		"My god asks the impossible of me",
		"I am the smartest man in my village and am governed by the dumbest",
		"I have been asked to leave my home",
		"I have failed out of school",
		"I have been cursed by the local medicine man/woman",
		"I have a very itchy rash",
		"My mother in law is living with me and is becoming more and more senile",
		"A lie has been spread about me throughout town",
		"I've sprained or broken an appendage",
		"I'm overworked and unable to meet all the needs of the people I care about"
	};

	private static String[] stData = {
		"I've never believed I was worthy of others care and affection",
		"I was abused as a child",
		"I was raised to believe I am unintelligent",
		"I was raised to believe I am unattractive",
		"I was raised to believe I am loud and annoying",
		"I don't believe in any gods",
		"I don't believe in my parent's god",
		"I believe in a god other than my parent's god",
		"I believe I am more important than everyone around me",
		"I believe I am more intelligent than everyone around me",
		"I would sacrifice others to save myself",
		"I am getting old and have to accept that one day I will cease to be",
		"My life is an elaborate charade",
		"I have begun to remember a repressed memory from childhood",
		"I am not my father's biological son",
		"The people in town have no meaning to me",
		"I don't experience emotions and manipulate people with fake empathy",
		"One day I will disappear and leave this all behind"
	};

	static {
		epDataList.addAll(Arrays.asList(epData));
		stDataList.addAll(Arrays.asList(stData));
	}

	public static String getRandomEp() {
		return epDataList.get(ThreadLocalRandom.current().nextInt(0, epDataList.size() - 1));
	}

	public static String getRandomSt() {
		return stDataList.get(ThreadLocalRandom.current().nextInt(0, stDataList.size() - 1));
	}
}
