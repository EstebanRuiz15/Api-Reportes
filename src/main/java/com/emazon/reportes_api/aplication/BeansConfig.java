package com.emazon.reportes_api.aplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.emazon.reportes_api.domain.interfaces.IPersistenceReportPort;
import com.emazon.reportes_api.domain.services.ReportServiceImpl;

@Configuration
public class BeansConfig {
   
    @Bean
    public ReportServiceImpl gReportServiceImpl(IPersistenceReportPort persistence){
       return new ReportServiceImpl(persistence);
    }
}