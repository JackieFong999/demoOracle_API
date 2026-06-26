package com.ocean.demoOracleAPI.service.impl;

import com.ocean.demoOracleAPI.service.InvoiceService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class InvoiceServiceImpl implements InvoiceService {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void updateCreditTotal(Integer invoiceId, Double creditAmount) {
        StoredProcedureQuery query = entityManager
                .createStoredProcedureQuery("spUpdate_Invoice_Credit_Total")
                .registerStoredProcedureParameter(1, Integer.class, ParameterMode.IN)
                .registerStoredProcedureParameter(2, Double.class, ParameterMode.IN)
                .setParameter(1, invoiceId)
                .setParameter(2, creditAmount);

        query.execute();
    }
}
