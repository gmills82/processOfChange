package processOfChange.model.processSteps;

import groovy.transform.EqualsAndHashCode;
import processOfChange.util.Constants.DespairingQuestion;

import java.util.List;

/**
 * @author Grant Mills
 * @since 12/21/16
 */
@EqualsAndHashCode
public class LossOfControl {
	private String objectOfGreatestLoss;
	private String descriptionOfInternalPain;
	private List<String> stringOfDefeats;

	private DespairingQuestion questionForItsMaker;

	public LossOfControl(String objectOfGreatestLoss, String descriptionOfInternalPain, List<String> stringOfDefeats, DespairingQuestion questionForItsMaker) {
		this.objectOfGreatestLoss = objectOfGreatestLoss;
		this.descriptionOfInternalPain = descriptionOfInternalPain;
		this.stringOfDefeats = stringOfDefeats;
		this.questionForItsMaker = questionForItsMaker;
	}

	public String getObjectOfGreatestLoss() {
		return objectOfGreatestLoss;
	}

	public String getDescriptionOfInternalPain() {
		return descriptionOfInternalPain;
	}

	public List<String> getStringOfDefeats() {
		return stringOfDefeats;
	}

	public DespairingQuestion getQuestionForItsMaker() {
		return questionForItsMaker;
	}
}
