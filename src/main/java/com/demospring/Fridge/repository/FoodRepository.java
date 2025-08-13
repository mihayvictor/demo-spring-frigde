package com.demospring.Fridge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demospring.Fridge.model.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {

}
