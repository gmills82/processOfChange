package processOfChange.assembler.processSteps;

import org.springframework.stereotype.Component;
import processOfChange.model.processSteps.UnworthyAppeasement;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Grant Mills
 * @since 12/21/16
 */
@Component
public class UnworthyAppeasementAssembler {

	public UnworthyAppeasement createUnworthyAppeasement() {
		List<String> quickSolutionsThatFail = new ArrayList<>();
		List<String> stressReactions = new ArrayList<>();
		quickSolutionsThatFail.add("blurg");
		stressReactions.add("fleeb");
		return new UnworthyAppeasement(quickSolutionsThatFail, stressReactions);
	}
}
