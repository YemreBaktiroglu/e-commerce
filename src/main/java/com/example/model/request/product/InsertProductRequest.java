package com.example.model.request.product;

import com.example.model.dto.ProductDto;
import com.example.model.request.BaseRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public class InsertProductRequest extends BaseRequest {

    @Valid
    @NotNull
    @NotEmpty
    private List<ProductDto> productDtoList;

    public List<ProductDto> getProductDtoList() {
        return productDtoList;
    }

    public void setProductDtoList(List<ProductDto> productDtoList) {
        this.productDtoList = productDtoList;
    }
}
