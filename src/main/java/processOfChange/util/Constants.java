package processOfChange.util;

import org.thymeleaf.util.StringUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author Grant Mills
 * @since 12/21/16
 */
public class Constants {
	public enum StoryType {
		TRAGIC, COMEDIC
	}

	public enum Question {
		WHO, WHAT, WHERE;

		@Override
		public String toString() {
			String finalString = super.toString();
			return StringUtils.capitalize(finalString.toLowerCase()) + "?";
		}

		private static final List<Question> VALUES =
			Collections.unmodifiableList(Arrays.asList(values()));
		private static final int SIZE = VALUES.size();
		private static final Random RANDOM = new Random();

		public static Question random()  {
			return VALUES.get(RANDOM.nextInt(SIZE));
		}
	}

	public enum DespairingQuestion {
		WHY, HOW;

		@Override
		public String toString() {
			String finalString = super.toString();
			return StringUtils.capitalize(finalString.toLowerCase()) + "?";
		}

		private static final List<DespairingQuestion> VALUES =
			Collections.unmodifiableList(Arrays.asList(values()));
		private static final int SIZE = VALUES.size();
		private static final Random RANDOM = new Random();

		public static DespairingQuestion random()  {
			return VALUES.get(RANDOM.nextInt(SIZE));
		}
	}

	public enum StagesOfGrief {
		DENIAL, ANGER, BARGAINING, DEPRESSION, ACCEPTANCE;

		@Override
		public String toString() {
			String finalString = super.toString();
			return StringUtils.capitalize(finalString.toLowerCase());
		}

		private static final List<StagesOfGrief> VALUES =
			Collections.unmodifiableList(Arrays.asList(values()));
		private static final int SIZE = VALUES.size();
		private static final Random RANDOM = new Random();

		public static StagesOfGrief random()  {
			return VALUES.get(RANDOM.nextInt(SIZE));
		}
	}
}
