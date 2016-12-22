package processOfChange.assembler.processSteps;

import org.springframework.stereotype.Component;
import processOfChange.model.processSteps.Grief;
import processOfChange.util.Constants.Question;
import processOfChange.util.Constants.StagesOfGrief;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Grant Mills
 * @since 12/21/16
 */
@Component
public class GriefAssembler {

	public Grief createGrief() {
		List<StagesOfGrief> prominentGrief = new ArrayList<>();

		int numberOfStages = new Random().nextInt(StagesOfGrief.values().length);
		while(numberOfStages > 0) {
			prominentGrief.add(StagesOfGrief.random());
			numberOfStages--;
		}

		return new Grief(prominentGrief, Question.random());
	}
}
