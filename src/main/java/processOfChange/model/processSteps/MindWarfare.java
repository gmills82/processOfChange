package processOfChange.model.processSteps;

import java.util.List;

/**
 * @author Grant Mills
 * @since 12/21/16
 */
public class MindWarfare {
	private String overwhelmingSubconsciousManifestation;
	private List<String> characterAlterations;

	public MindWarfare(String overwhelmingSubconsciousManifestation, List<String> characterAlterations) {
		this.overwhelmingSubconsciousManifestation = overwhelmingSubconsciousManifestation;
		this.characterAlterations = characterAlterations;
	}

	public String getOverwhelmingSubconsciousManifestation() {
		return overwhelmingSubconsciousManifestation;
	}

	public List<String> getCharacterAlterations() {
		return characterAlterations;
	}
}
