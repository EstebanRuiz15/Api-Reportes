package com.emazon.reportes_api.infraestructure.driving_http.mappers;

import com.emazon.reportes_api.domain.model.ArticlesInCart;
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
public class IMappertoListArticlesImpl implements IMappertoListArticles {

    @Override
    public ArticlesInCart toArticlesInCart(ArticlesInCart articlesInCart) {
        if ( articlesInCart == null ) {
            return null;
        }

        ArticlesInCart articlesInCart1 = new ArticlesInCart();

        articlesInCart1.setId( articlesInCart.getId() );
        articlesInCart1.setName( articlesInCart.getName() );
        articlesInCart1.setDescription( articlesInCart.getDescription() );
        articlesInCart1.setQuantity( articlesInCart.getQuantity() );
        articlesInCart1.setPrice( articlesInCart.getPrice() );
        articlesInCart1.setTotalArticle( articlesInCart.getTotalArticle() );

        return articlesInCart1;
    }

    @Override
    public List<ArticlesInCart> toListArticles(List<ArticlesInCart> articles) {
        if ( articles == null ) {
            return null;
        }

        List<ArticlesInCart> list = new ArrayList<ArticlesInCart>( articles.size() );
        for ( ArticlesInCart articlesInCart : articles ) {
            list.add( toArticlesInCart( articlesInCart ) );
        }

        return list;
    }
}
