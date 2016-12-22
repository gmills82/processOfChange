package processOfChange.model.processSteps;

import groovy.transform.EqualsAndHashCode;
import processOfChange.util.Constants.Question;
import processOfChange.util.Constants.StagesOfGrief;

import java.util.List;

/**
 * @author Grant Mills
 * @since 12/21/16
 */

@EqualsAndHashCode
public class Grief {
	private List<StagesOfGrief> prominentStagesOfGrief;
	private Question questionsForInternalDrive;

	public Grief(List<StagesOfGrief> prominentStagesOfGrief, Question questionsForInternalDrive) {
		this.prominentStagesOfGrief = prominentStagesOfGrief;
		this.questionsForInternalDrive = questionsForInternalDrive;
	}

	public List<StagesOfGrief> getProminentStagesOfGrief() {
		return prominentStagesOfGrief;
	}

	public Question getQuestionsForInternalDrive() {
		return questionsForInternalDrive;
	}
}
