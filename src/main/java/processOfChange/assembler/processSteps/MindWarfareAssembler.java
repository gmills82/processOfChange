package processOfChange.assembler.processSteps;

import org.springframework.stereotype.Component;
import processOfChange.data.MindWarfareData;
import processOfChange.model.processSteps.MindWarfare;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Grant Mills
 * @since 12/21/16
 */
@Component
public class MindWarfareAssembler {

	public MindWarfare createMindWarfare() {
		Integer amountOfCharacterAlterations = ThreadLocalRandom.current().nextInt(1, 3);
		List<String> characterAlterations = new ArrayList<>();

		while(amountOfCharacterAlterations > 0) {
			characterAlterations.add(MindWarfareData.getRandomCharacterAlt());
			amountOfCharacterAlterations--;
		}

		return new MindWarfare(MindWarfareData.getRandomSM(), characterAlterations);
	}

}
