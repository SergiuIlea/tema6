package org.fasttrack.repository;

import org.fasttrack.model.Transaction;
import org.fasttrack.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    List<Transaction> findByType(Type type);
    List<Transaction> findByAmountGreaterThanEqual(Double minAmount);
    List<Transaction> findByAmountLessThanEqual(Double maxAmount);
    List<Transaction> findByTypeAndAmountGreaterThanEqual(Type type, Double minAmount);
    List<Transaction> findByTypeAndAmountLessThanEqual(Type type, Double maxAmount);
    List<Transaction> findByAmountBetween(Double minAmount, Double maxAmount);
    List<Transaction> findByTypeAndAmountBetween(Type type, Double minAmount, Double maxAmount);
}
