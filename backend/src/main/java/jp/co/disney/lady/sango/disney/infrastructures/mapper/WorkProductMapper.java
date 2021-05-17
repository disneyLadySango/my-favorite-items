package jp.co.disney.lady.sango.disney.infrastructures.mapper;

import jp.co.disney.lady.sango.disney.infrastructures.entities.WorkProductEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WorkProductMapper {
    List<WorkProductEntity> getWorkProducts();

    WorkProductEntity getWorkProduct(@Param("id") int id);

    void createWorkProduct(@Param("name") String name);
}
