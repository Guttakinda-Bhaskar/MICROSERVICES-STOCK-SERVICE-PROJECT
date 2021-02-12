package com.example.demo.Service;

import java.util.Optional;

import com.example.demo.Model.Stock;

public interface StockService {
	
	public Optional<Stock> findById(Integer id);
}
