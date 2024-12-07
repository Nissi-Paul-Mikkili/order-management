package com.klef.jfsd.exam.repositories;

import com.klef.jfsd.exam.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
