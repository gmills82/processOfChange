package processOfChange.assembler.processSteps;

import org.springframework.stereotype.Component;
import processOfChange.model.processSteps.MindWarfare;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Grant Mills
 * @since 12/21/16
 */
@Component
public class MindWarfareAssembler {

	public MindWarfare createMindWarfare() {
		List<String> characterAlterations = new ArrayList<>();
		characterAlterations.add("chitz");
		characterAlterations.add("flitz");

		return new MindWarfare("blitz", characterAlterations);
	}

}
