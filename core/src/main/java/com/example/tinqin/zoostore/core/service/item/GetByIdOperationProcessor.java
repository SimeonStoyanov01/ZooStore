package com.example.tinqin.zoostore.core.service.item;

import com.example.tinqin.zoostore.API.operation.item.getby.id.ItemGetByIdOperation;
import com.example.tinqin.zoostore.API.operation.item.getby.id.ItemGetByIdRequest;
import com.example.tinqin.zoostore.API.operation.item.getby.id.ItemGetByIdResponse;
import com.example.tinqin.zoostore.core.exceptions.NoItemWithSuchIdException;
import com.example.tinqin.zoostore.persistence.entity.ItemEntity;
import com.example.tinqin.zoostore.persistence.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class GetByIdOperationProcessor implements ItemGetByIdOperation {
    private final ItemRepository itemRepository;

    //ItemGetByIdResponse itemGetByIdResponse;
    @Override
    public ItemGetByIdResponse process(ItemGetByIdRequest operationRequest) {
     ItemEntity item=this.itemRepository.findItemEntityById(UUID.fromString(operationRequest.getId())).orElseThrow(NoItemWithSuchIdException::new);
        return ItemGetByIdResponse
                .builder()
                .id(item.getId())
                .title(item.getTitle())
                .vendor(item.getVendor().getName())
                .build();
    }
}
