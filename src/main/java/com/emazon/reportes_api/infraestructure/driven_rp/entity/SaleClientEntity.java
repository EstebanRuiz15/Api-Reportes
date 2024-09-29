package com.emazon.reportes_api.infraestructure.driven_rp.entity;

import com.emazon.reportes_api.domain.model.ArticlesInCart;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "sales")
public class SaleClientEntity {
    @Id
    private String id;
    private Integer idClient;
    private String clientEmail;
    private LocalDateTime saleDateTime;
    private List<ArticlesInCart> items;
    private String totalPaid;
    
}
