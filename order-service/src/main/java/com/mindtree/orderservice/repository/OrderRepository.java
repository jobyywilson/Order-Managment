package com.mindtree.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.orderservice.model.Order;

/**
 * @author Joby Wilson Mathews
 *
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
