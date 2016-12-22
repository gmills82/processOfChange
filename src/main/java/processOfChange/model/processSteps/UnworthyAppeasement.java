package processOfChange.model.processSteps;

import groovy.transform.EqualsAndHashCode;

import java.util.List;

/**
 * @author Grant Mills
 * @since 12/21/16
 */
@EqualsAndHashCode
public class UnworthyAppeasement {
	private List<String> quickSolutionsThatFail;
	private List<String> stressReactions;

	public UnworthyAppeasement(List<String> quickSolutionsThatFail, List<String> stressReactions) {
		this.quickSolutionsThatFail = quickSolutionsThatFail;
		this.stressReactions = stressReactions;
	}

	public List<String> getQuickSolutionsThatFail() {
		return quickSolutionsThatFail;
	}

	public List<String> getStressReactions() {
		return stressReactions;
	}
}
