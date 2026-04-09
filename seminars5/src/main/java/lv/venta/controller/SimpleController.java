package lv.venta.controller;

import java.util.Random;
import lv.venta.model.Product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lv.venta.model.ProductType;

@Controller
@RequestMapping("/simple")
public class SimpleController {
	
	@GetMapping("/page") // localhost:8080/simple/page
	public String getShowPage() {
		System.out.println("1st controller.");
		return "show-page"; // Paradīs show-page.html lapu.
	}
	
	@GetMapping("/data") // localhost:8080/simple/data
	public String getDataInPage(Model model) {
		System.out.println("Data controller.");
		Random rand = new Random();
		String data = "@Toms " + rand.nextInt(2010, 2026);
		model.addAttribute("package", data);
		return "data-page";
	}
	
	@GetMapping("/product") // localhost:8080/simple/product
	public String getProductInPage(Model model) {
		System.out.println("Product controller.");
		Product prod = new Product("Ābols", "Tas ir auglis.", 0.54, 400, ProductType.food);
		model.addAttribute("package", prod);
		return "product-page";
	}
}
