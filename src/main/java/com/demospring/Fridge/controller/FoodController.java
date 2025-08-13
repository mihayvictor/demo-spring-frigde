package com.demospring.Fridge.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demospring.Fridge.model.Food;
import com.demospring.Fridge.service.FoodService;

@RestController
@RequestMapping("/food")
public class FoodController {
	
	private final FoodService foodService;
	
	public FoodController(FoodService foodService) {
		this.foodService = foodService;
	}

	//GET
	@GetMapping
	public List<Food> getAll(){
		return foodService.gatAll();
	}
	
	//POST
	@PostMapping
	public Food create(Food food) {
		return foodService.save(food);
	}
	
	//DELETE
	@RequestMapping
	public void delete(Long id) {
		foodService.delete(id);
	}
	
}
