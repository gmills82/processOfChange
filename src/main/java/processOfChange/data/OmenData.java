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
	public static List<String> smDataList = new ArrayList<>();
	public static List<String> stDataList = new ArrayList<>();

	private static String[] epData = {
		"test",
		"check"
	};

	private static String[] smData = {
		"blurg",
		"bleep"
	};

	private static String[] stData = {
		"cheek",
		"chest"
	};

	static {
		epDataList.addAll(Arrays.asList(epData));
		smDataList.addAll(Arrays.asList(smData));
		stDataList.addAll(Arrays.asList(stData));
	}

	public static String getRandomEp() {
		return epDataList.get(ThreadLocalRandom.current().nextInt(0, epDataList.size() - 1));
	}

	public static String getRandomSm() {
		return smDataList.get(ThreadLocalRandom.current().nextInt(0, smDataList.size() - 1));
	}

	public static String getRandomSt() {
		return stDataList.get(ThreadLocalRandom.current().nextInt(0, stDataList.size() - 1));
	}
}
