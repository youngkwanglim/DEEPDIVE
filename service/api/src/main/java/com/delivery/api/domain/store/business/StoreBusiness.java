package com.delivery.api.domain.store.business;

import com.delivery.api.common.annotation.Business;
import com.delivery.api.domain.store.controller.model.StoreRegisterRequest;
import com.delivery.api.domain.store.controller.model.StoreResponse;
import com.delivery.api.domain.store.converter.StoreConverter;
import com.delivery.api.domain.store.service.StoreService;
import com.delivery.db.store.enums.StoreCategory;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Business
public class StoreBusiness {

    private final StoreService storeService;

    private final StoreConverter storeConverter;

    // store 등록
    public StoreResponse register(StoreRegisterRequest request) {
        // request -> entity -> save -> response
        var entity = storeConverter.toEntity(request);
        var newEntity = storeService.register(entity);
        var response = storeConverter.toResponse(newEntity);
        return response;
    }

    // 카테고리별 store 정보 가져오기
    public List<StoreResponse> searchCategory(StoreCategory storecategory) {
        // entity list -> response list
        var storeList = storeService.searchByCategory(storecategory);

        return storeList.stream()
                .map(storeConverter::toResponse)
                .collect(Collectors.toList());
    }
}
