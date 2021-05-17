package jp.co.disney.lady.sango.disney.types;

import jp.co.disney.lady.sango.disney.infrastructures.entities.WorkProductEntity;

import lombok.Data;

@Data
public final class WorkProduct {
    private int id;
    private String name;

    public WorkProduct(WorkProductEntity entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }
}
