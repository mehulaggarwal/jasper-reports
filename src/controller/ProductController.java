package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import report.*;

@Controller
public class ProductController {
	
	@RequestMapping(value="/product.html",method=RequestMethod.GET)
   public ModelAndView index(ModelMap modelMap){
		ProductReport pr=new ProductReport();
		modelMap.put("listProducts", pr.findAll());
		ModelAndView model=new ModelAndView("index");
	   return model;
   }
}
