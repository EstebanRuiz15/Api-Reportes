package com.emazon.reportes_api.domain.interfaces;

import java.util.List;

import com.emazon.reportes_api.domain.model.ArticlesInCart;

public interface IReportService {
    void saveReportSale(List<ArticlesInCart> articlesSale);
}
