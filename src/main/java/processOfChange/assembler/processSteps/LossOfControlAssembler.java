package processOfChange.assembler.processSteps;

import org.springframework.stereotype.Component;
import processOfChange.data.LossOfControlData;
import processOfChange.model.processSteps.LossOfControl;
import processOfChange.util.Constants.DespairingQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Grant Mills
 * @since 12/21/16
 */
@Component
public class LossOfControlAssembler {

	public LossOfControl createLossOfControl(){
		List<String> defeats = new ArrayList<>();
		Integer numberOfDefeats = ThreadLocalRandom.current().nextInt(2, 4);

		while (numberOfDefeats > 0) {
			defeats.add(LossOfControlData.getRandomStringOfDefeats());
			numberOfDefeats--;
		}

		return new LossOfControl(LossOfControlData.getRandomObjectOfGreatestLoss(), LossOfControlData.getRandomDescriptionOfInternalPain(), defeats, DespairingQuestion.random());
	}
}
