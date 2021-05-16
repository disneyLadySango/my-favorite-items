package jp.co.disney.lady.sango.disney.types;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public final class WorkProduct {
    private int id;
    private String name;
}
