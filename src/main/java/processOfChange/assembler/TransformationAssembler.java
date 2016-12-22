package processOfChange.assembler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import processOfChange.assembler.processSteps.GriefAssembler;
import processOfChange.assembler.processSteps.HeroBuildingAssembler;
import processOfChange.assembler.processSteps.LossOfControlAssembler;
import processOfChange.assembler.processSteps.MindWarfareAssembler;
import processOfChange.assembler.processSteps.OmenAssembler;
import processOfChange.assembler.processSteps.UnworthyAppeasementAssembler;
import processOfChange.model.Transformation;

/**
 * @author Grant Mills
 * @since 12/21/16
 */
@Component
public class TransformationAssembler {
	private OmenAssembler mOmenAssembler;
	private UnworthyAppeasementAssembler mUnworthyAppeasementsAssembler;
	private MindWarfareAssembler mMindWarfareAssembler;
	private LossOfControlAssembler mLossOfControlAssembler;
	private GriefAssembler mGriefAssembler;
	private HeroBuildingAssembler mHeroBuildingAssembler;

	@Autowired
	public TransformationAssembler(OmenAssembler omenAssembler, UnworthyAppeasementAssembler unworthyAppeasementsAssembler, MindWarfareAssembler mindWarfareAssembler, LossOfControlAssembler lossOfControlAssembler, GriefAssembler griefAssembler, HeroBuildingAssembler heroBuildingAssembler) {
		mOmenAssembler = omenAssembler;
		mUnworthyAppeasementsAssembler = unworthyAppeasementsAssembler;
		mMindWarfareAssembler = mindWarfareAssembler;
		mLossOfControlAssembler = lossOfControlAssembler;
		mGriefAssembler = griefAssembler;
		mHeroBuildingAssembler = heroBuildingAssembler;
	}

	public Transformation createTransformation(Boolean isHero) {
		//Assemble each step
		Transformation transformationProcess = new Transformation(
			mOmenAssembler.createOmen(),
			mUnworthyAppeasementsAssembler.createUnworthyAppeasement(),
			mMindWarfareAssembler.createMindWarfare(),
			mLossOfControlAssembler.createLossOfControl(),
			mGriefAssembler.createGrief()
		);

		//If is hero add a HeroBuilding
		if(isHero) {
			transformationProcess.setHeroBuilding(mHeroBuildingAssembler.createHeroBuilding());
		}

		return transformationProcess;
	}
}
