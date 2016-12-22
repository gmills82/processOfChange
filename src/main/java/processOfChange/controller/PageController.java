package processOfChange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import processOfChange.service.TransformationService;

/**
 * @author Grant Mills
 * @since 12/21/16
 */
@Controller
public class PageController {

	private TransformationService mTransformationService;

	@Autowired
	public PageController(TransformationService transformationService) {
		mTransformationService = transformationService;
	}

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("processOfChange", mTransformationService.get());
		return "index";
	}

}
