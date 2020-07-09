package net.works;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class AppController {

	@Autowired
    private ProductService service;
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
	    List<Product> listProducts = service.listAll();
	    model.addAttribute("listProducts", listProducts);
	     
	    return "index";
	}
	
	@RequestMapping("/manage")
	public String manageHomePage(Model model) {
	    List<Product> listProducts = service.listAll();
	    model.addAttribute("listProducts", listProducts);
	     
	    return "manage_inventory";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
	    ModelAndView mav = new ModelAndView("edit_product");
	    Product product = service.get(id);
	    mav.addObject("product", product);
	     
	    return mav;
	}
	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name = "id") int id) {
	    service.delete(id);
	    return "redirect:/";       
	}
	@RequestMapping("/new")
	public String showNewProductPage(Model model) {
	    Product product = new Product();
	    model.addAttribute("product", product);
	     
	    return "new_product";
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product product) {
	    service.save(product);
	     
	    return "redirect:/";
	}
	/*
	 * @RequestMapping("/add/{id}") public String showCartPage(@PathVariable(name =
	 * "id") int id, Model model) { Order order = new Order(); Order product =
	 * product.getProductList().getClass(); model.addAttribute("product", product);
	 * service.get(id); order = ;
	 * 
	 * return "add_to_cart"; }
	 */
}
