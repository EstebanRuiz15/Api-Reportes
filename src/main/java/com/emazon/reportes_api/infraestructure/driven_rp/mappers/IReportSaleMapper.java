package com.emazon.reportes_api.infraestructure.driven_rp.mappers;

import org.mapstruct.Mapper;

import com.emazon.reportes_api.domain.model.SaleClient;
import com.emazon.reportes_api.infraestructure.driven_rp.entity.SaleClientEntity;

@Mapper(componentModel = "spring")
public interface IReportSaleMapper {
    SaleClientEntity toClientEntity(SaleClient sale);
}
