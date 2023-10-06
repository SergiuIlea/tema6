package org.fasttrack.service;

import org.fasttrack.model.Transaction;
import org.fasttrack.model.Type;
import org.fasttrack.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class TransactionService {
    private TransactionRepository repository;

    @Autowired
    TransactionService(TransactionRepository repository){

        this.repository = repository;
    }

    public List<Transaction> generateTheTransactionList(){
        Transaction t1 = new Transaction(1, "telefon", Type.BUY, 1);
        Transaction t2 = new Transaction(2, "laptop", Type.BUY, 2);
        Transaction t3 = new Transaction(3, "3D printer", Type.SELL, 1);
        Transaction t4 = new Transaction(4, "TV", Type.BUY, 5);
        Transaction t5 = new Transaction(5, "tableta", Type.SELL, 3);
        List<Transaction> allTransactions = new ArrayList<>();
        allTransactions.add(t1);
        allTransactions.add(t2);
        allTransactions.add(t3);
        allTransactions.add(t4);
        allTransactions.add(t5);
        return allTransactions;
    }

    public List<Transaction> getAllTransactions(Type type, Double minAmount, Double maxAmount) {
        if(type!=null){
            if(minAmount!=null){
                if(maxAmount!=null){
                    return repository.findByTypeAndAmountBetween(type, minAmount, maxAmount);
                }else {
                    return repository.findByTypeAndAmountGreaterThanEqual(type, minAmount);
                }
            }else if(maxAmount!=null){
                return repository.findByTypeAndAmountLessThanEqual(type, maxAmount);
            }else return repository.findByType(type);
        }else if(minAmount!=null){
            if(maxAmount!=null){
                return repository.findByAmountBetween(minAmount, maxAmount);
            }else return repository.findByAmountGreaterThanEqual(minAmount);
        }else if(maxAmount!=null){
            return repository.findByAmountLessThanEqual(maxAmount);
        }else return repository.findAll();
    }

    public Transaction getTransactionsById(int id){
        Optional<Transaction> isFound = repository.findById(id);
        if(isFound.isPresent()){
            return isFound.get();
        }else {
            throw new RuntimeException();
        }
    }


    public Transaction postTransaction(Transaction transaction) {
        Transaction newTransaction = repository.save(transaction);
        return newTransaction;
    }

    public Transaction putTransaction(Transaction transaction) {
        Transaction finalForm;
        Optional<Transaction> isFound = repository.findById(transaction.getId());
        if(isFound.isPresent()){
            Transaction transactionDB = isFound.get();
            if(transaction.getProduct()!=null){
                transactionDB.setProduct(transaction.getProduct());
            }
            if(transaction.getType()!=null){
                transactionDB.setProduct(transaction.getProduct());
            }
            if(transaction.getAmount()!=0){
                transactionDB.setAmount(transaction.getAmount());
            }
            finalForm = repository.save(transactionDB);
        }else {
            finalForm = repository.save(transaction);
        }
        return finalForm;
    }

    public Transaction patchTransaction(Transaction transaction){
        Transaction finalForm = null;
        finalForm.setProduct(transaction.getProduct());
        finalForm.setType(transaction.getType());
        finalForm.setAmount(transaction.getAmount());
        return finalForm;
    }

    public String deleteTransaction(int id) {
        repository.deleteById(id);
        return String.format("Tranzactia cu id %d a fost stearsa ", id);
    }

    public Map<Type, List<Transaction>> getReportsByType(){
        return repository
                .findAll()
                .stream()
                .collect(Collectors.groupingBy(Transaction::getType));
    }

    public Map<String, List<Transaction>> getReportsByProduct(){
        return repository
                .findAll()
                .stream()
                .collect(Collectors.groupingBy(Transaction::getProduct));
    }
}
