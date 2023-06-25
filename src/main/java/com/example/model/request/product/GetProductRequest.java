package com.example.model.request.product;

import com.example.model.request.BaseRequest;

import java.util.List;

public class GetProductRequest extends BaseRequest {

    private String name;

    private List<Long> categoryId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Long> getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(List<Long> categoryId) {
        this.categoryId = categoryId;
    }
}
