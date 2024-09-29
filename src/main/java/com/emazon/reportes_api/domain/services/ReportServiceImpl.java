package com.emazon.reportes_api.domain.services;

import com.emazon.reportes_api.domain.interfaces.IPersistenceReportPort;
import com.emazon.reportes_api.domain.interfaces.IReportService;
import com.emazon.reportes_api.domain.model.ArticlesInCart;
import com.emazon.reportes_api.domain.model.SaleClient;
import com.emazon.reportes_api.domain.util.ConstantsDomain;

import java.time.LocalDateTime;
import java.util.List;

public class ReportServiceImpl implements IReportService {
    private final IPersistenceReportPort persistence;

    public ReportServiceImpl(IPersistenceReportPort persistence){
        this.persistence=persistence;
    }
    @Override
    public void saveReportSale(List<ArticlesInCart> articlesSale){
        SaleClient sale= new SaleClient();
        Integer idClient=persistence.getClientId();
        String UserNameClient=persistence.getClientEmail();
        Double totalPaid=articlesSale.stream()
                         .mapToDouble(article -> article.getPrice()*article.getQuantity())
                         .sum();
        sale.setTotalPaid(String.format(ConstantsDomain.FORMAT, totalPaid));
        sale.setSaleDateTime(LocalDateTime.now());
        sale.setItems(articlesSale);
        sale.setClientEmail(UserNameClient);
        sale.setIdClient(idClient);
        
        persistence.save(sale);
    }

}
