package processOfChange.model;

import groovy.transform.EqualsAndHashCode;
import processOfChange.model.processSteps.Grief;
import processOfChange.model.processSteps.HeroBuilding;
import processOfChange.model.processSteps.LossOfControl;
import processOfChange.model.processSteps.MindWarfare;
import processOfChange.model.processSteps.Omen;
import processOfChange.model.processSteps.UnworthyAppeasement;

/**
 * @author Grant Mills
 * @since 12/21/16
 */
@EqualsAndHashCode
public class Transformation {
	private Omen omen;
	private UnworthyAppeasement unworthyAppeasement;
	private MindWarfare mindWarfare;
	private LossOfControl lossOfControl;
	private Grief grief;
	private HeroBuilding heroBuilding;

	public Transformation(Omen omen, UnworthyAppeasement unworthyAppeasement, MindWarfare mindWarfare, LossOfControl lossOfControl, Grief grief) {
		this.omen = omen;
		this.unworthyAppeasement = unworthyAppeasement;
		this.mindWarfare = mindWarfare;
		this.lossOfControl = lossOfControl;
		this.grief = grief;
	}

	public Transformation(Omen omen, UnworthyAppeasement unworthyAppeasement, MindWarfare mindWarfare, LossOfControl lossOfControl, Grief grief, HeroBuilding heroBuilding) {
		this.omen = omen;
		this.unworthyAppeasement = unworthyAppeasement;
		this.mindWarfare = mindWarfare;
		this.lossOfControl = lossOfControl;
		this.grief = grief;
		this.heroBuilding = heroBuilding;
	}

	public Omen getOmen() {
		return omen;
	}

	public UnworthyAppeasement getUnworthyAppeasement() {
		return unworthyAppeasement;
	}

	public MindWarfare getMindWarfare() {
		return mindWarfare;
	}

	public LossOfControl getLossOfControl() {
		return lossOfControl;
	}

	public Grief getGrief() {
		return grief;
	}

	public HeroBuilding getHeroBuilding() {
		return heroBuilding;
	}

	public void setHeroBuilding(HeroBuilding heroBuilding) {
		this.heroBuilding = heroBuilding;
	}
}
