package jp.co.disney.lady.sango.disney.domain.repositories;

import jp.co.disney.lady.sango.disney.types.WorkProduct;
import jp.co.disney.lady.sango.disney.types.mutation.RegistWorkProductResponse;

import java.util.List;

public interface WorkProductRepository {
    List<WorkProduct> getWorkProducts();
    WorkProduct getWorkProduct(final int id);
    RegistWorkProductResponse createWorkProduct(final String name);
}
