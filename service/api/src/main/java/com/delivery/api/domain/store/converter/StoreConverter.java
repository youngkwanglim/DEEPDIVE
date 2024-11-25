package com.delivery.api.domain.store.converter;

import com.delivery.api.common.annotation.Converter;
import com.delivery.api.common.error.ErrorCode;
import com.delivery.api.common.exception.ApiException;
import com.delivery.api.domain.store.controller.model.StoreRegisterRequest;
import com.delivery.api.domain.store.controller.model.StoreResponse;
import com.delivery.db.store.StoreEntity;
import java.util.Optional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Converter
public class StoreConverter {

    // request -> entity
    public StoreEntity toEntity(StoreRegisterRequest request) {
        return Optional.ofNullable(request)
                .map(it -> {
                    return StoreEntity.builder()
                            .name(request.getName())
                            .address(request.getAddress())
                            .category(request.getStoreCategory())
                            .minimumAmount(request.getMinimumAmount())
                            .minimumDeliveryAmount(request.getMinimumDeliveryAmount())
                            .thumbnailUrl(request.getThumbnailUrl())
                            .phoneNumber(request.getPhoneNumber())
                            .build();
                })
                .orElseThrow(() -> new ApiException(ErrorCode.NULL_POINT));
    }

    // entity -> response
    public StoreResponse toResponse(StoreEntity entity) {
        return Optional.ofNullable(entity)
                .map(it -> {
                    return StoreResponse.builder()
                            .id(entity.getId())
                            .name(entity.getName())
                            .address(entity.getAddress())
                            .status(entity.getStatus())
                            .category(entity.getCategory())
                            .minimumAmount(entity.getMinimumAmount())
                            .minimumDeliveryAmount(entity.getMinimumDeliveryAmount())
                            .thumbnailUrl(entity.getThumbnailUrl())
                            .star(entity.getStar())
                            .phoneNumber(entity.getPhoneNumber())
                            .build();
                })
                .orElseThrow(() -> new ApiException(ErrorCode.NULL_POINT));
    }
}
