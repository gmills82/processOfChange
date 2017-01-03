package processOfChange.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Grant Mills
 * @since 1/2/17
 */
public class LossOfControlData {

	public static List<String> objectOfGreatestLossDataList = new ArrayList<>();
	public static List<String> descriptionOfInternalPainList = new ArrayList<>();
	public static List<String> stringOfDefeatsDataList = new ArrayList<>();

	private static String[] objectOfGreatestLossData = {
		"grandfather's memento",
		"loss of memories of a loved one",
		"lost home",
		"best friend",
		"lover",
		"spouse",
		"sacred relic",
		"family heirloom",
		"arm",
		"eye",
		"ability to cast magic",
		"fighting ability",
		"trust"
	};

	private static String[] descriptionOfInternalPainData = {
		"gutted",
		"flayed",
		"pierced",
		"stabbing",
		"dull, aching",
		"acute",
		"chronic",
		"crushing",
		"bone breaking",
		"foundation crumbling",
		"implosion",
		"explosion"
	};

	private static String[] stringOfDefeatsData = {
		"lost best friend in battle",
		"transformed loved one into object",
		"defeated in front of home village",
		"forced to become vampire",
		"foreced to become werewolf",
		"killed parents",
		"injured mother",
		"injured father",
		"injured loved one",
		"spouse was killed",
		"great financial loss",
		"great loss of prestige among the tribe",
		"roll on minor injury table",
		"roll on major injury table"
	};

	static {
		objectOfGreatestLossDataList.addAll(Arrays.asList(objectOfGreatestLossData));
		descriptionOfInternalPainList.addAll(Arrays.asList(descriptionOfInternalPainData));
		stringOfDefeatsDataList.addAll(Arrays.asList(stringOfDefeatsData));
	}

	public static String getRandomObjectOfGreatestLoss() {
		return objectOfGreatestLossDataList.get(ThreadLocalRandom.current().nextInt(0, objectOfGreatestLossDataList.size() - 1));
	}

	public static String getRandomDescriptionOfInternalPain() {
		return descriptionOfInternalPainList.get(ThreadLocalRandom.current().nextInt(0, descriptionOfInternalPainList.size() - 1));
	}

	public static String getRandomStringOfDefeats() {
		return stringOfDefeatsDataList.get(ThreadLocalRandom.current().nextInt(0, stringOfDefeatsDataList.size() - 1));
	}
}
