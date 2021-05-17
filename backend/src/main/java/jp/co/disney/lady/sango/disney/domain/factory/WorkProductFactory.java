package jp.co.disney.lady.sango.disney.domain.factory;

import jp.co.disney.lady.sango.disney.infrastructures.entities.WorkProductEntity;
import jp.co.disney.lady.sango.disney.types.WorkProduct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class WorkProductFactory {

    public List<WorkProduct> createGetWorkProducts(List<WorkProductEntity> workProductEntities) {
        List<WorkProduct> workProducts = new ArrayList<WorkProduct>();
        for (WorkProductEntity workProductEntity : workProductEntities) {
            workProducts.add(new WorkProduct(workProductEntity));
        }
        return  workProducts;
    }

}
