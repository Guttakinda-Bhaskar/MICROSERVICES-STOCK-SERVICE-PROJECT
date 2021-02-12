package com.example.demo.Runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.Model.Stock;
import com.example.demo.Repository.StockRepo;

@Component
public class MyStockServiceRunners implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

	/*@Autowired
	private StockRepo repo;
	
	@Override
	public void run(String... args) throws Exception {

		Iterable<Stock> saveAll = repo.saveAll(List.of(
				new Stock(101, "ONPASSIVE", 20.00),
				new Stock(102, "TCS", 2000.00),
				new Stock(103, "INFOSYS", 1820.00),
				new Stock(104, "HCL", 1220.00),
				new Stock(105, "WIPRO", 1990.00),
				new Stock(106, "RELIANCE", 2250.00),
				new Stock(107, "TECHMAHINDRA", 1720.00),
				new Stock(108, "BHEL", 1020.00),
				new Stock(109, "SBIN", 320.00)
				));
		saveAll.forEach(System.out::println);*/

}
