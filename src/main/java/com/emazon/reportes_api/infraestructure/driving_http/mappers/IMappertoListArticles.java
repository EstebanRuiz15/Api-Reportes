package com.emazon.reportes_api.infraestructure.driving_http.mappers;

import org.mapstruct.Mapper;
import java.util.List;
import com.emazon.reportes_api.domain.model.ArticlesInCart;

@Mapper(componentModel = "spring")
public interface IMappertoListArticles {
    ArticlesInCart toArticlesInCart(ArticlesInCart articlesInCart);
    List<ArticlesInCart> toListArticles(List<ArticlesInCart> articles);
}
