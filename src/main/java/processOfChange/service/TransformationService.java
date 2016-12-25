package processOfChange.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import processOfChange.assembler.TransformationAssembler;
import processOfChange.assembler.processSteps.OmenAssembler;
import processOfChange.model.Transformation;
import processOfChange.model.processSteps.Omen;

/**
 * @author Grant Mills
 * @since 12/21/16
 */
@Service
public class TransformationService {

	private TransformationAssembler mProcessAssembler;
	private OmenAssembler mOmenAssembler;

	@Autowired
	public TransformationService(TransformationAssembler processAssembler, OmenAssembler omenAssembler) {
		mProcessAssembler = processAssembler;
		mOmenAssembler = omenAssembler;
	}

	public Transformation getHero() {
		return mProcessAssembler.createTransformation(true);
	}

	public Transformation getVillain() {
		return mProcessAssembler.createTransformation(false);
	}

	public Omen getOmen() {
		return mOmenAssembler.createOmen();
	}
}
