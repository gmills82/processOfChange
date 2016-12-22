package processOfChange.assembler.processSteps;

import processOfChange.model.Belief;
import processOfChange.model.Belief.BeliefType;
import processOfChange.model.processSteps.HeroBuilding;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Grant Mills
 * @since 12/21/16
 */
public class HeroBuildingAssembler {

	public HeroBuilding createHeroBuilding() {
		List<Belief> beliefs = createBeliefStructure();

		return new HeroBuilding(beliefs, "porpoise", "walks with a limp", "helps children when they fall to the ground");
	}

	private Boolean isBeliefStructureBalanced(List<Belief> beliefs) {
		return true;
	}

	private List<Belief> createBeliefStructure() {
		List<Belief> beliefs = new ArrayList<>();
		int numberOfBeliefs = new Random().nextInt(5);
		while(numberOfBeliefs > 0) {
			beliefs.add(new Belief("i believe in miracles", BeliefType.VULNERABILITY));
			numberOfBeliefs--;
		}

		if(!isBeliefStructureBalanced(beliefs)) {
			beliefs = createBeliefStructure();
		}

		return beliefs;
	}
}
