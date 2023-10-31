package com.example.projet_cafeteria.services;

import com.example.projet_cafeteria.Dao.TransactionDao;
import com.example.projet_cafeteria.models.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.UUID;

@Service
public class TransactionService {
    private final TransactionDao transactionDao;

    @Autowired
    public TransactionService(TransactionDao transactionDao) {
        this.transactionDao = transactionDao;
    }

    public Transaction getTransactionById(UUID id) {
        return transactionDao.findById(id).orElse(null);
    }

    public Collection<Transaction> getAllTransactions() {
        return transactionDao.findAll();
    }

    public Transaction createTransaction(Transaction transaction) {
        return transactionDao.save(transaction);
    }

    public Transaction updateTransaction(UUID id, Transaction updatedTransaction) {
        Transaction existingTransaction = transactionDao.findById(id).orElse(null);
        if (existingTransaction != null) {
            // Mise à jour des propriétés de l'entité existante avec les nouvelles valeurs
            existingTransaction.setDate_transaction(updatedTransaction.getDate_transaction());
            // Répétez cela pour toutes les propriétés que vous souhaitez mettre à jour

            // Enregistrez les modifications dans la base de données
            return transactionDao.save(existingTransaction);
        } else {
            // Gérer le cas où la transaction n'existe pas
            return null;
        }
    }

    public void updateAllTransactions(Transaction updatedTransaction) {
        // Récupérez toutes les transactions existantes
        Collection<Transaction> allTransactions = transactionDao.findAll();

        // Parcourez chaque transaction et mettez à jour les propriétés
        for (Transaction transaction : allTransactions) {
            transaction.setDate_transaction(updatedTransaction.getDate_transaction());
            // Répétez cela pour toutes les propriétés que vous souhaitez mettre à jour
        }

        // Enregistrez les modifications dans la base de données
        transactionDao.saveAll(allTransactions);
    }

    public Transaction deleteTransaction(UUID id) {
        Transaction transactionToDelete = transactionDao.findById(id).orElse(null);
        if (transactionToDelete != null) {
            transactionDao.delete(transactionToDelete);
        }
        return transactionToDelete;
    }
}
