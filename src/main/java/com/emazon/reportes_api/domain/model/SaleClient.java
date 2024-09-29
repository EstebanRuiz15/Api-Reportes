package com.emazon.reportes_api.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SaleClient {
    
    private String id;
    private Integer idClient;
    private String clientEmail;
    private LocalDateTime saleDateTime;
    private List<ArticlesInCart> items;
    private String totalPaid;
    
}
