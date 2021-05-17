package jp.co.disney.lady.sango.disney.resolvers;

import graphql.kickstart.tools.GraphQLQueryResolver;
import jp.co.disney.lady.sango.disney.infrastructures.WorkProductRepositoryImpl;
import jp.co.disney.lady.sango.disney.types.WorkProduct;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
@Slf4j
public class WorkProductQueryResolver implements GraphQLQueryResolver {
    private final WorkProductRepositoryImpl workProductRepositoryImpl;

    public List<WorkProduct> getWorkProducts() {
        return workProductRepositoryImpl.getWorkProducts();
    }

    public WorkProduct getWorkProduct(final int id) {
        return workProductRepositoryImpl.getWorkProduct(id);
    }
}
