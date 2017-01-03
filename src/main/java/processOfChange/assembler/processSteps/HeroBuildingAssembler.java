package processOfChange.assembler.processSteps;

import org.springframework.data.domain.Range;
import org.springframework.stereotype.Component;
import processOfChange.data.HeroBuildingData;
import processOfChange.model.Belief;
import processOfChange.model.Belief.BeliefType;
import processOfChange.model.processSteps.HeroBuilding;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Grant Mills
 * @since 12/21/16
 */
@Component
public class HeroBuildingAssembler {

	private static final int NUMBER_OF_CORE_BELIEFS = 3;

	public HeroBuilding createHeroBuilding() {
		List<Belief> beliefs = createBeliefStructure();

		return new HeroBuilding(beliefs, HeroBuildingData.getRandomPurpose(), HeroBuildingData.getRandomChangeInCharacter(), HeroBuildingData.getRandomChangeInWorld());
	}

	private Boolean isBeliefStructureBalanced(List<Belief> beliefs) {
		Boolean isBalanced = false;
		Range<Integer> allowedBalanceRange = new Range<Integer>(-1,2);
		Integer count = 0;

		for(Belief belief : beliefs) {
			if(belief.getType() == BeliefType.POWER) {
				count++;
			}
			if(belief.getType() == BeliefType.VULNERABILITY) {
				count--;
			}
		}

		//Is balance in acceptable range?
		if(allowedBalanceRange.contains(count)) {
			isBalanced = true;
		}

		return isBalanced;
	}

	private List<Belief> createBeliefStructure() {
		List<Belief> beliefs = new ArrayList<>();
		Integer numberOfBeliefs = NUMBER_OF_CORE_BELIEFS;
		while(numberOfBeliefs > 0) {
			beliefs.add(HeroBuildingData.getRandomBelief());
			numberOfBeliefs--;
		}

		if(!isBeliefStructureBalanced(beliefs)) {
			beliefs = createBeliefStructure();
		}

		return beliefs;
	}
}
