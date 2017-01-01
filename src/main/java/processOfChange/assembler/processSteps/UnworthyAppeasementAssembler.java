package processOfChange.assembler.processSteps;

import org.springframework.stereotype.Component;
import processOfChange.data.UnworthyAppeasementData;
import processOfChange.model.processSteps.UnworthyAppeasement;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Grant Mills
 * @since 12/21/16
 */
@Component
public class UnworthyAppeasementAssembler {

	public UnworthyAppeasement createUnworthyAppeasement() {
		Integer amountOfSolutions = ThreadLocalRandom.current().nextInt(1, 4);
		Integer amountOfReactions = ThreadLocalRandom.current().nextInt(2, 5);
		List<String> solutions = new ArrayList<>();
		List<String> reactions = new ArrayList<>();

		while(amountOfSolutions > 0) {
			solutions.add(UnworthyAppeasementData.getRandomQuickSolution());
			amountOfSolutions--;
		}

		while(amountOfReactions > 0) {
			reactions.add(UnworthyAppeasementData.getRandomStressReaction());
			amountOfReactions--;
		}

		return new UnworthyAppeasement(solutions, reactions);
	}
}
