package net.cakesolutions.openspring3.mvc1;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.AbstractView;

@Controller
public class HelloWorldController {

	@RequestMapping(value = "/helloworld", method = RequestMethod.GET)
	public ModelAndView helloworld() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("greeting", "Hello, World");
		View view = new AbstractView() {

			@Override
			protected void renderMergedOutputModel(Map<String, Object> model,
					HttpServletRequest request, HttpServletResponse response)
					throws Exception {
				for (Map.Entry<String, Object> e : model.entrySet()) {
					response.getWriter().print(e.getKey());
					response.getWriter().print("=>");
					response.getWriter().println(e.getValue());
				}
			}
		};
		return new ModelAndView(view, model);
	}

}
