package com.learn.Ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.learn.Ecommerce.entity.Category;

//@RepositoryRestResource will helps to change the end point
@RepositoryRestResource(path = "category") 
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
