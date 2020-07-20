package net.works.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.works.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
