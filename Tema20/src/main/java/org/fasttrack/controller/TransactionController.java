package org.fasttrack.controller;

import org.fasttrack.model.Transaction;
import org.fasttrack.model.Type;
import org.fasttrack.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("transactions")
public class TransactionController {
    private TransactionService service;

    @Autowired
    public TransactionController(TransactionService service) {
        this.service = service;
    }


    @GetMapping
    public List<Transaction> getAllTransactions(@RequestParam(required = false) Type type,
                                                @RequestParam(required = false) Double minAmount,
                                                @RequestParam(required = false) Double maxAmount){
        return service.getAllTransactions(type, minAmount, maxAmount);
    }

    @GetMapping("{id}")
    public Transaction getTransactionsById(@PathVariable int id){
        return service.getTransactionsById(id);
    }

    @PostMapping
    public Transaction postTransaction(@RequestBody Transaction transaction){
        return service.postTransaction(transaction);
    }

    @PutMapping
    public Transaction putTransaction(@RequestBody Transaction transaction){
        return service.putTransaction(transaction);
    }

    @PatchMapping("{id}")
    public Transaction patchTransaction(@PathVariable Transaction transaction){
        return service.patchTransaction(transaction);
    }

    @DeleteMapping("{id}")
    public String deleteTransaction(@PathVariable int id){
        return service.deleteTransaction(id);
    }

    @GetMapping("reports/type")
    public Map<Type, List<Transaction>> getReportsByType(){
        return service.getReportsByType();
    }

    @GetMapping("reports/product")
    public Map<String, List<Transaction>> getReportsByProduct(){
        return service.getReportsByProduct();
    }
}
