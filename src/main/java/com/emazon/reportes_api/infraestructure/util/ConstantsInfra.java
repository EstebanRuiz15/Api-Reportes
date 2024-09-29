package com.emazon.reportes_api.infraestructure.util;

public final class ConstantsInfra {
    private ConstantsInfra(){
        throw new IllegalStateException("Utility class");
    }
    public static final String AUTHORIZATION="Authorization";
    public static final String BEARER="Bearer ";
    public static final String ACCES_DENIED_MESSAGE="{\\\"error\\\": \\\"Access Denied: ";
    public static final String KEY="294A404E635266556A586E327235753878214125442A472D4B6150645367566B";
    public static final String URL_SWAGGER1="/swagger-ui.html";
    public static final String URL_SWAGGER2="/swagger-ui/**";
    public static final String URL_SWAGGER3="/v3/api-docs/**";
    public static final String BUY_SUCESS="buy sucessfull";
}
