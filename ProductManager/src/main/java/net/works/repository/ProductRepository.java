package net.works.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.works.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
