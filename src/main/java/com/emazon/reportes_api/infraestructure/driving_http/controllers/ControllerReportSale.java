package com.emazon.reportes_api.infraestructure.driving_http.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emazon.reportes_api.domain.interfaces.IReportService;
import com.emazon.reportes_api.domain.model.ArticlesInCart;
import com.emazon.reportes_api.infraestructure.util.ConstantsInfra;

import lombok.AllArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/report")
@Service
@AllArgsConstructor
public class ControllerReportSale {
    private final IReportService reportService;

    @PostMapping(value = "/",consumes = "application/json")
    @PreAuthorize("hasRole('CLIENT')")
    public ResponseEntity<?> saveReportSale(@RequestBody List<ArticlesInCart> sale){
        reportService.saveReportSale(sale);
        return ResponseEntity.ok(ConstantsInfra.BUY_SUCESS);

    }
    
}
