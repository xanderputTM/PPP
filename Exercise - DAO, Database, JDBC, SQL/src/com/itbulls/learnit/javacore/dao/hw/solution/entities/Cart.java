package com.itbulls.learnit.javacore.dao.hw.solution.entities;

import java.util.List;

public interface Cart {

	boolean isEmpty();

	void addProduct(Product productById);

	List<Product> getProducts();

	void clear();

}

