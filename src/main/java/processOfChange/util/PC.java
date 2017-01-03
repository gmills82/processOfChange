package processOfChange.util;

import org.thymeleaf.util.StringUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author Grant Mills
 * @since 1/3/17
 */
public class PC {
	public enum PClass {
		BARBARIAN,
		BARD,
		CLERIC,
		DRUID,
		FIGHTER,
		MONK,
		PALADIN,
		RANGER,
		ROGUE,
		SORCEROR,
		WARLOCK,
		WIZARD;

		@Override
		public String toString() {
			String finalString = super.toString();
			return StringUtils.capitalize(finalString.toLowerCase());
		}

		private static final List<PClass> VALUES =
			Collections.unmodifiableList(Arrays.asList(values()));
		private static final int SIZE = VALUES.size();
		private static final Random RANDOM = new Random();

		public static PClass random()  {
			return VALUES.get(RANDOM.nextInt(SIZE));
		}
	}

	public enum PRace {
		DRAGONBORN,
		DWARF,
		ELF,
		GNOME,
		HALF_ELF,
		HALF_ORC,
		HALFLING,
		HUMAN,
		TIEFLING,
		GENASI,
		GOLIATH,
		AASIMAR,
		DEEP_GNOME,
		FIRBOLG,
		KENKU,
		LIZARDFOLK,
		TABAXI,
		TRITON;

		@Override
		public String toString() {
			String finalString = super.toString();
			finalString = finalString.replace("HALF_", "HALF-");
			finalString = finalString.replace("_", " ");
			return StringUtils.capitalize(finalString.toLowerCase());
		}

		private static final List<PRace> VALUES =
			Collections.unmodifiableList(Arrays.asList(values()));
		private static final int SIZE = VALUES.size();
		private static final Random RANDOM = new Random();

		public static PRace random()  {
			return VALUES.get(RANDOM.nextInt(SIZE));
		}
	}


}
