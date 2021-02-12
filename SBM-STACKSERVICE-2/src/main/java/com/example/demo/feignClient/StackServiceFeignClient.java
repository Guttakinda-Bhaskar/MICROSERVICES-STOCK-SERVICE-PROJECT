package com.example.demo.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Model.Stock;

@FeignClient(name="STOCKMICROSERVICES-APPLICATION-1")
public interface StackServiceFeignClient {
	@SuppressWarnings("rawtypes")
	@GetMapping(value = "/stockprice/{id}")
	public ResponseEntity<Stock> getStockPrice(@PathVariable("id") Integer id);
}
