package com.emazon.reportes_api.infraestructure.driven_rp.adapter;

import com.emazon.reportes_api.domain.interfaces.IPersistenceReportPort;
import com.emazon.reportes_api.domain.model.SaleClient;
import com.emazon.reportes_api.domain.util.ConstantsDomain;
import com.emazon.reportes_api.infraestructure.driven_rp.mappers.IReportSaleMapper;
import com.emazon.reportes_api.infraestructure.driven_rp.persistence.IRepositoryMongo;
import com.emazon.reportes_api.infraestructure.security_config.jwt_configuration.JwtService;

import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import java.util.Objects;

@Service
@AllArgsConstructor
public class PersistenceReportImpl implements IPersistenceReportPort  {
    private final IRepositoryMongo repository;
    private final JwtService jwtService;
    private final IReportSaleMapper mapper;
    @Override
    public void save(SaleClient saleClient){
        repository.save(mapper.toClientEntity(saleClient));
    }

     @Override
    public Integer getClientId() {

        HttpServletRequest request = ((ServletRequestAttributes) Objects
                .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String jwt = request.getHeader(ConstantsDomain.AUTHORIZATION);
        jwt = jwt.substring(ConstantsDomain.SEVEN);
        return jwtService.extractUserId(jwt);
    }

    @Override
    public String getClientEmail(){
        HttpServletRequest request = ((ServletRequestAttributes) Objects
                .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        String jwt = request.getHeader(ConstantsDomain.AUTHORIZATION);
        jwt = jwt.substring(ConstantsDomain.SEVEN);
        return jwtService.extractUsername(jwt);
    }


}
