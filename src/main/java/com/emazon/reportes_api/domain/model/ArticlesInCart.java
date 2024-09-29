package com.emazon.reportes_api.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ArticlesInCart {
    private Integer id;
    private String name;
    private String description;
    private Integer quantity;
    private Double price;
    private Double totalArticle;
    
    
}
