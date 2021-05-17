package jp.co.disney.lady.sango.disney.infrastructures;

import jp.co.disney.lady.sango.disney.domain.factory.WorkProductFactory;
import jp.co.disney.lady.sango.disney.domain.repositories.WorkProductRepository;
import jp.co.disney.lady.sango.disney.infrastructures.entities.WorkProductEntity;
import jp.co.disney.lady.sango.disney.infrastructures.mapper.WorkProductMapper;
import jp.co.disney.lady.sango.disney.types.WorkProduct;
import jp.co.disney.lady.sango.disney.types.mutation.RegistWorkProductResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
@Slf4j
public class WorkProductRepositoryImpl implements WorkProductRepository {

    private final WorkProductMapper workProductMapper;
    private final WorkProductFactory workProductFactory;

    @Override
    public final List<WorkProduct> getWorkProducts() {
        List<WorkProductEntity> results = workProductMapper.getWorkProducts();
        return workProductFactory.createGetWorkProducts(results);
    }

    @Override
    public final WorkProduct getWorkProduct(final int id) {
        WorkProductEntity result = workProductMapper.getWorkProduct(id);
        return new WorkProduct(result);
    }

    @Override
    public final RegistWorkProductResponse createWorkProduct(final String name) {
        workProductMapper.createWorkProduct(name);
        return null;
    }
}
