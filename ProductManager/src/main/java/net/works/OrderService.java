package net.works;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderService {

	@Autowired
	private OrderRepository orderRepo;
	
	public List<Order> listAll(){
		return orderRepo.findAll();
	}
	public void save(Order order) {
		orderRepo.save(order);
	}
}
