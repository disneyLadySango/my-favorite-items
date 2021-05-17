package jp.co.disney.lady.sango.disney.types.mutation;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public final class RegistWorkProductResponse {
    private String name;
    private boolean isRegist;
    private String errorMessage;
}
