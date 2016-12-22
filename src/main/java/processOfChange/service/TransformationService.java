package processOfChange.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import processOfChange.assembler.TransformationAssembler;
import processOfChange.model.Transformation;

/**
 * @author Grant Mills
 * @since 12/21/16
 */
@Service
public class TransformationService {

	private TransformationAssembler mProcessAssembler;

	@Autowired
	public TransformationService(TransformationAssembler processAssembler) {
		mProcessAssembler = processAssembler;
	}

	public Transformation get() {
		return mProcessAssembler.createTransformation();
	}
}
