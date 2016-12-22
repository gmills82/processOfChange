package processOfChange.model.processSteps;

import groovy.transform.EqualsAndHashCode;
import processOfChange.model.Belief;

import java.util.List;

/**
 * @author Grant Mills
 * @since 12/21/16
 */
@EqualsAndHashCode
public class HeroBuilding {
	private List<Belief> beliefs;
	private String purpose;
	private String changeInCharacter;
	private String changeInWorld;

	public HeroBuilding(List<Belief> beliefs, String purpose, String changeInCharacter, String changeInWorld) {
		this.beliefs = beliefs;
		this.purpose = purpose;
		this.changeInCharacter = changeInCharacter;
		this.changeInWorld = changeInWorld;
	}

	public List<Belief> getBeliefs() {
		return beliefs;
	}

	public String getPurpose() {
		return purpose;
	}

	public String getChangeInCharacter() {
		return changeInCharacter;
	}

	public String getChangeInWorld() {
		return changeInWorld;
	}
}
