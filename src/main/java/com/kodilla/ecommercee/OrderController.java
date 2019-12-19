package com.kodilla.ecommercee;


import java.util.ArrayList;
import java.util.List;
import org.springframework.util.StringUtils;

public class OrderController {

    private List<GenericEntity> orders = new ArrayList<>();

    public List<GenericEntity> getAllOrders() {
        return orders;
    }

    public void addOrder(GenericEntity order) {
        orders.add(order);
    }

    public String showOrder(Long id) {
        String result = orders.stream()
                .filter(o -> o.getId().equals(id))
                .toString();
        if(!StringUtils.isEmpty(result)) {
            return result;
        }
        return "Error: Order not found.";
    }

    public GenericEntity updateOrder(Long id) {
        return new GenericEntity("Updated order");
    }

    public void deleteOrder(Long id) {

    }
}
