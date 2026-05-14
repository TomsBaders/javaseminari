package lv.venta.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lv.venta.model.Product;
import lv.venta.model.ProductType;
import lv.venta.service.IProductFilterService;

@Controller
@RequestMapping("/product/filter")
public class ProductFilterController {
	
	@Autowired
	private IProductFilterService prodFilterService;
	
	@GetMapping("price/{threshold}")//localhost:8080/product/filter/price/...
	public String getFilterProductByPrice(@PathVariable(name = "threshold") float threshold, Model model) {
		try
		{
			ArrayList<Product> productsFromDB = prodFilterService.filterByPriceLessThan(threshold);
			model.addAttribute("package", productsFromDB);
			model.addAttribute("myHeader", "Produkti, kuru cena ir zem " + threshold + " eur");
			return "show-all-products-page";
		}
		catch (Exception e) {
			model.addAttribute("package", e.getMessage());
			return "error-page";
		}
	}
	
	@GetMapping("type/{threshold}") //localhost:8080/product/filter/type/...
	public String getFilterProductByType(@PathVariable(name = "threshold") String threshold, Model model) {
		try {
			ProductType type = ProductType.valueOf(threshold.toLowerCase());

			ArrayList<Product> productsFromDB = prodFilterService.filterByType(type);
			model.addAttribute("package", productsFromDB);
			model.addAttribute("myHeader", "Produkti, kuru tips ir " + threshold);
			return "show-all-products-page";
		} catch (Exception e) {
			model.addAttribute("package", e.getMessage());
			return "error-page";
		}
	}

	@GetMapping("keyword/{threshold}") //localhost:8080/product/filter/keyword/...
	public String getFilterProductByKeyword(@PathVariable(name = "threshold") String threshold, Model model) {
		try {
			ArrayList<Product> productsFromDB =  prodFilterService.filterByKeyword(threshold.trim());
			model.addAttribute("package", productsFromDB);
			model.addAttribute("myHeader", "Produkti, kuru atslēgas vārds ir " + threshold);
			return "show-all-products-page";
		} catch (Exception e) {
			model.addAttribute("package", e.getMessage());
			return "error-page";
		}
	}
	
	@GetMapping("average") //localhost:8080/product/filter/average
	public String getCalculateAverage(Model model) {
		try {
			float avgPrice = prodFilterService.calculateAvgPrice();
			model.addAttribute("package", "Vidējā cena ir "+Math.round(avgPrice * 100) / 100f);
			return "show-data-page";
		} catch (Exception e) {
			model.addAttribute("package", e.getMessage());
			return "error-page";
		}
	}
}
