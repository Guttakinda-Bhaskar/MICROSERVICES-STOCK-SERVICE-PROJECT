package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Stock;
import com.example.demo.Repository.StockRepo;

@Service
public class StockServiceImpl implements StockService{

	@Autowired
	private StockRepo stockRepo;

	@Override
	public Optional<Stock> findById(Integer id) {
		Optional<Stock> findByName = stockRepo.findById(id);
		return findByName;
	}
	
}
