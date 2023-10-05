package org.fasttrack.service;

import org.fasttrack.model.Transaction;
import org.fasttrack.model.Type;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SplittableRandom;
import java.util.stream.Collectors;

@Service
public class TransactionService {
    private List<Transaction> transactions;

    TransactionService(){
        this.transactions = generateTheTransactionList();
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

    public List<Transaction> getAllTransactions(String product, Type type, Double minAmount, Double maxAmount) {
        return transactions.stream()
                .filter(transaction -> product == null || transaction.getProduct().equals(product))
                .filter(transaction -> type == null || transaction.getType().equals(type))
                .filter(transaction -> minAmount == null || transaction.getAmount() >= minAmount)
                .filter(transaction -> maxAmount == null || transaction.getAmount() <= maxAmount)
                .collect(Collectors.toList());
    }

    public Transaction getTransactionsById(int id){
        return transactions.stream()
                .filter(transaction -> transaction.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException());
    }


    public Transaction postTransaction(Transaction transaction) {
        transactions.add(transaction);
        return transaction;
    }

    public Transaction putTransaction(Transaction transaction) {
        for(Transaction currTransaction: transactions){
            if(currTransaction.getId() == transaction.getId()){
                transactions.remove(currTransaction);
                break;
            }
        }
        transactions.add(transaction);
        return transaction;
    }

    public List<Transaction> deleteTransaction(int id) {
        for (Transaction currTransaction: transactions){
            if(currTransaction.getId() == id){
                transactions.remove(currTransaction);
                break;
            }
        }
        return transactions;
    }

    public Map<Type, List<Transaction>> getReportsByType(){
        return transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getType));
    }

    public Map<String, List<Transaction>> getReportsByProduct(){
        return transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getProduct));
    }
}
