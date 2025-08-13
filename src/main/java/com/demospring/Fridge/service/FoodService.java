package com.demospring.Fridge.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demospring.Fridge.model.Food;
import com.demospring.Fridge.repository.FoodRepository;

@Service
public class FoodService  {
	
	private final FoodRepository foodRepository;
	
	public FoodService (FoodRepository foodRepository) {
		this.foodRepository = foodRepository;
	}

	//LISTAR
	public List<Food> gatAll(){
		return foodRepository.findAll();
	}
	
	//CRIAR
	public Food save(Food food) {
		return foodRepository.save(food);
	}
	
	//DELETAR
	public void delete(Long id) {
		foodRepository.deleteById(id);
	}
	
	
}
