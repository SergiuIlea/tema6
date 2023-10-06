package org.fasttrack.repository;

import org.fasttrack.model.Transaction;
import org.fasttrack.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    List<Transaction> findByType(Type type);
    List<Transaction> findByMinAmount(Double minAmount);
    List<Transaction> findByMaxAmount(Double maxAmount);
    List<Transaction> findByTypeAndMin(Type type, Double minAmount);
    List<Transaction> findByTypeAndMax(Type type, Double maxAmount);
    List<Transaction> findByMinAndMax(Double minAmount, Double maxAmount);
    List<Transaction> findByTypeMinAndMax(Type type, Double minAmount, Double maxAmount);
}
