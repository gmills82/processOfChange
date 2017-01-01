package processOfChange.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Grant Mills
 * @since 12/31/16
 */
public class MindWarfareData {
	public static List<String> overwhelmingSMDataList = new ArrayList<>();
	public static List<String> characterAlterationsDataList = new ArrayList<>();

	private static String[] characterAlterationsData = {
		"limps",
		"minor injury",
		"-2 to primary stat from mental block",
		"amnesia",
		"reverse their alignment (evil / good)",
		"reverse their alignment (chaotic / lawful)",
		"devoted to vengeance",
		"devoted to the law, super pious",
		"proficient in deserts / wastelands"
	};

	private static String[] overwhelmingSMData = {
		"hallucinations",
		"overwhelmed by visions from their god",
		"stroke",
		"blinded (mental)",
		"blinded (physical)"
	};

	static {
		overwhelmingSMDataList.addAll(Arrays.asList(overwhelmingSMData));
		characterAlterationsDataList.addAll(Arrays.asList(characterAlterationsData));
	}

	public static String getRandomSM() {
		return overwhelmingSMDataList.get(ThreadLocalRandom.current().nextInt(0, overwhelmingSMDataList.size() - 1));
	}

	public static String getRandomCharacterAlt() {
		return characterAlterationsDataList.get(ThreadLocalRandom.current().nextInt(0, characterAlterationsDataList.size() - 1));
	}
}
