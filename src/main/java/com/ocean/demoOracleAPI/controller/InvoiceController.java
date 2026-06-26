package com.ocean.demoOracleAPI.controller;

import com.ocean.demoOracleAPI.service.InvoiceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/invoices")
public class InvoiceController {

	//private final InvoiceService invoiceService;
	@Autowired
	private InvoiceService invoiceService;
    

//    public InvoiceController(InvoiceService invoiceService) {
//        this.invoiceService = invoiceService;
//    }

    /**
     * POST /api/invoices/update-credit
     * <p>
     * Calls spUpdate_Invoice_Credit_Total(invoiceId, creditAmount).
     * <p>
     * Request body example:
     * <pre>
     * {
     *   "invoiceId": 1002,
     *   "creditAmount": 125
     * }
     * </pre>
     */
    @PostMapping("/update-credit")
    public ResponseEntity<Map<String, Object>> updateCreditTotal(@RequestBody Map<String, Object> request) {
        Integer invoiceId = Integer.valueOf(request.get("invoiceId").toString());
        Double creditAmount = Double.valueOf(request.get("creditAmount").toString());

        invoiceService.updateCreditTotal(invoiceId, creditAmount);

        Map<String, Object> response = new LinkedHashMap<>();
        response.put("message", "Credit total updated successfully");
        response.put("invoiceId", invoiceId);
        response.put("creditAmount", creditAmount);
        return ResponseEntity.ok(response);
    }
}
