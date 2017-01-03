package processOfChange.data;

import processOfChange.model.Belief;
import processOfChange.model.Belief.BeliefType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Grant Mills
 * @since 1/2/17
 */
public class HeroBuildingData {
	public static List<Belief> beliefDataList = new ArrayList<>();
	public static List<String> purposeDataList = new ArrayList<>();
	public static List<String> changeInCharacterDataList = new ArrayList<>();
	public static List<String> changeInWorldDataList = new ArrayList<>();

	private static Belief[] beliefData = {
		new Belief("I believe I can right all wrongs", BeliefType.POWER),
		new Belief("I believe life is fragile and easily destroyed", BeliefType.VULNERABILITY),
		new Belief("I believe love exposes you to loss", BeliefType.VULNERABILITY),
		new Belief("I believe love emboldens us to do what is right", BeliefType.POWER),
		new Belief("I believe the gods have failed us and it is up to the lesser races to build the future", BeliefType.POWER),
		new Belief("I believe we must try to protect those weaker than ourselves", BeliefType.VULNERABILITY),
		new Belief("I believe we can always protect those weaker than ourselves", BeliefType.POWER),
		new Belief("I believe magic is a powerful gift", BeliefType.POWER),
		new Belief("I believe magic is a terrible weapon that must be controlled", BeliefType.VULNERABILITY),
		new Belief("I believe X magical artifact could be used by me for good", BeliefType.POWER),
		new Belief("I believe X magical artifact is too powerful and must be destroyed", BeliefType.VULNERABILITY),
	};

	private static String[] purposeData = {
		"revenge",
		"justice",
		"forgiveness",
		"righting my wrongs",
		"attoning for sins",
		"town building",
		"nation building",
		"protection",
		"creating family",
		"promoting natural harmony",
		"rooting out evil",
		"debating away apathy",
		"holy mission",
		"enlightenment"
	};

	private static String[] changeInCharacterData = {
		"I never yell",
		"I refuse to fight unless it is the last course of action",
		"I am quick to a righteous fight",
		"I am quick to fight",
		"My long term views allow me to plan long term success",
		"I have devoted myself to my god",
		"I often seek solace in the wilds",
		"Meditation allows me a clearer mind"
	};

	private static String[] changeInWorldData = {
		"I run a small school where I teach my students my ways",
		"I seek adventure as a means of removing evil in the world",
		"I was made mayor of my town and it is...",
		"I use my renown as a local battle hero to improve the lives of the people in my town",
		"I was given political power and I use it for...",
		"I am an oracle who offers wisdom to other",
		"I am a conduit for the will of my god and their will manifests around me as...",
		"Helps children when they fall to the ground"
	};

	static {
		beliefDataList.addAll(Arrays.asList(beliefData));
		purposeDataList.addAll(Arrays.asList(purposeData));
		changeInCharacterDataList.addAll(Arrays.asList(changeInCharacterData));
		changeInWorldDataList.addAll(Arrays.asList(changeInWorldData));
	}

	public static Belief getRandomBelief() {
		return beliefDataList.get(ThreadLocalRandom.current().nextInt(0, beliefDataList.size() - 1));
	}

	public static String getRandomPurpose() {
		return purposeDataList.get(ThreadLocalRandom.current().nextInt(0, purposeDataList.size() - 1));
	}

	public static String getRandomChangeInCharacter() {
		return changeInCharacterDataList.get(ThreadLocalRandom.current().nextInt(0, changeInCharacterDataList.size() - 1));
	}

	public static String getRandomChangeInWorld() {
		return changeInWorldDataList.get(ThreadLocalRandom.current().nextInt(0, changeInWorldDataList.size() - 1));
	}
}

