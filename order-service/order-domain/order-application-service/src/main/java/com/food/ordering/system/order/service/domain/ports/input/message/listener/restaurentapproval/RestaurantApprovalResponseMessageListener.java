package com.food.ordering.system.order.service.domain.ports.input.message.listener.restaurentapproval;

import com.food.ordering.system.order.service.domain.dto.message.RestaurantApprovalResponse;

public interface RestaurantApprovalResponseMessageListener {
    void orderApproved(RestaurantApprovalResponse response);
    void orderRejected(RestaurantApprovalResponse response);
}
