package com.emazon.reportes_api.domain.interfaces;

import com.emazon.reportes_api.domain.model.SaleClient;

public interface IPersistenceReportPort {
    void save(SaleClient sale);
    Integer getClientId();
    String getClientEmail();
}
