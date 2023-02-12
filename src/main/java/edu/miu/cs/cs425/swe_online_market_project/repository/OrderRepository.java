package edu.miu.cs.cs425.swe_online_market_project.repository;

import edu.miu.cs.cs425.swe_online_market_project.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
    List<Order> getOrderByOwnerUserId(Long userId);
}
