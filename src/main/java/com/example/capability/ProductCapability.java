package com.example.capability;

import com.example.model.response.product.GetProductResponse;
import com.example.service.fullfilment.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path = "api/product")
public class ProductCapability {

    private final ProductService productService;

    public ProductCapability(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(path = "get")
    public ResponseEntity<GetProductResponse> getProduct() {
        return ResponseEntity.ok(new GetProductResponse());
    }
}
