package edu.miu.cs.cs425.swe_online_market_project.repository;

import edu.miu.cs.cs425.swe_online_market_project.model.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
    Optional<ShoppingCart> findByBuyerUserId(Long id);
}
