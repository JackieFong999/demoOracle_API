package com.ocean.demoOracleAPI.service;

public interface InvoiceService {

    /**
     * Calls spUpdate_Invoice_Credit_Total to update the credit total of an invoice.
     *
     * @param invoiceId    the invoice ID
     * @param creditAmount the credit amount to set
     */
    void updateCreditTotal(Integer invoiceId, Double creditAmount);
}
