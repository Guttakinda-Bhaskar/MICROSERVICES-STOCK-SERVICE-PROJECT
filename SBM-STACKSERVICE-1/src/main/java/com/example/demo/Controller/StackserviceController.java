package com.example.demo.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Exception.ComapanyInfoNotFoundException;
import com.example.demo.Model.Stock;
import com.example.demo.Service.StockService;

@Controller
@RequestMapping("/")
public class StackserviceController {

	@Autowired
	private StockService stockService;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@GetMapping(value = "/stockprice/{id}")
	public ResponseEntity getStockPrice(@PathVariable("id") Integer id) {
		Optional<Stock> findByName = stockService.findById(id);
		System.err.println("StackserviceController.getStockPrice()" + findByName);
		if (findByName.isEmpty()) {
			throw new ComapanyInfoNotFoundException(
					"Company Information is Not available in the Stock : NIFTY,BSE in that Databases");
		}
		return new ResponseEntity(findByName, HttpStatus.OK);
	}
}
