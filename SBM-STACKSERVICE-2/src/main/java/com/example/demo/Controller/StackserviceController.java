package com.example.demo.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Exception.ComapanyInfoNotFoundException;
import com.example.demo.Model.Stock;
import com.example.demo.Service.StockService;
import com.example.demo.feignClient.StackServiceFeignClient;

@Controller
@RequestMapping("/")
public class StackserviceController {

	@Autowired
	private StockService stockService;

	@Autowired
	private StackServiceFeignClient priceCal;

	@GetMapping(value = "/stockpriceCalculations/{id}/{quantity}")
	public Optional<Stock> getStockPrice(@PathVariable("id") Integer id, @PathVariable("quantity") double quantity) {
		Optional<Stock> findByName = stockService.findById(id);
		System.err.println("StackserviceController.getStockPrice()" + findByName);

		ResponseEntity<Stock> stockPrice = priceCal.getStockPrice(id);
		Stock body = stockPrice.getBody();
		double tot = quantity * body.getPrice();
		System.err.println("StackserviceController.getStockPrice(priceVal)" + tot);
		Stock stock = new Stock();
		stock.setTotal(tot);
		if (findByName.isEmpty()) {
			throw new ComapanyInfoNotFoundException(
					"Company Information is Not available in the Stock : NIFTY,BSE in that Databases");
		}
		return findByName;
		
	}
}
