package com.OneToMany.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.OneToMany.Model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
	    
	 Page<Product> findAll(Pageable pageble);
}
