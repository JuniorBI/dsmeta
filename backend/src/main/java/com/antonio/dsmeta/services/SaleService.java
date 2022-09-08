package com.antonio.dsmeta.services;

import com.antonio.dsmeta.entities.Sale;
import com.antonio.dsmeta.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;
    public List<Sale> findSales() {
        return repository.findAll();
    }
}
