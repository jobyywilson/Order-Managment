package com.mindtree.orderitemservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.orderitemservice.model.OrderItem;

/**
 * @author Joby Wilson Mathews
 *
 */
@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	List<OrderItem> findByOrderId(Long id);

}
