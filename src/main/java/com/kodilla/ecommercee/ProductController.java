package com.kodilla.ecommercee;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/product")
public class ProductController {

    private List<GenericEntity> productList = new ArrayList<>();

    @RequestMapping(method = RequestMethod.GET, value = "getProductList")
    public List<GenericEntity> getProductList() {
        return productList;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getProductById")
    public GenericEntity getProductById(@RequestParam Long productId) {
        GenericEntity product = productList.stream()
                .filter(i -> i.getId().equals(productId)).findAny().get();
        return product;
    }

    @RequestMapping(method = RequestMethod.POST, value = "createProduct")
    public GenericEntity createProduct() {
        return new GenericEntity("New order");
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateProduct")
    public void updateProduct() {
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteProduct")
    public void deleteProduct(@RequestParam Long productId){
    }
}
