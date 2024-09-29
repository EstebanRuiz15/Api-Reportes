package com.emazon.reportes_api.infraestructure.driven_rp.mappers;

import com.emazon.reportes_api.domain.model.ArticlesInCart;
import com.emazon.reportes_api.domain.model.SaleClient;
import com.emazon.reportes_api.infraestructure.driven_rp.entity.SaleClientEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-28T16:52:59-0500",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.10.2.jar, environment: Java 17.0.12 (Eclipse Adoptium)"
)
@Component
public class IReportSaleMapperImpl implements IReportSaleMapper {

    @Override
    public SaleClientEntity toClientEntity(SaleClient sale) {
        if ( sale == null ) {
            return null;
        }

        SaleClientEntity saleClientEntity = new SaleClientEntity();

        saleClientEntity.setId( sale.getId() );
        saleClientEntity.setIdClient( sale.getIdClient() );
        saleClientEntity.setClientEmail( sale.getClientEmail() );
        saleClientEntity.setSaleDateTime( sale.getSaleDateTime() );
        List<ArticlesInCart> list = sale.getItems();
        if ( list != null ) {
            saleClientEntity.setItems( new ArrayList<ArticlesInCart>( list ) );
        }
        saleClientEntity.setTotalPaid( sale.getTotalPaid() );

        return saleClientEntity;
    }
}
