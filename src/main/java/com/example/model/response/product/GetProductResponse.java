package com.example.model.response.product;

import com.example.model.dto.ProductDto;
import com.example.model.response.BaseResponse;

import java.util.List;

public class GetProductResponse extends BaseResponse {

    List<ProductDto> productDtoList;

    public List<ProductDto> getProductDtoList() {
        return productDtoList;
    }

    public void setProductDtoList(List<ProductDto> productDtoList) {
        this.productDtoList = productDtoList;
    }
}
