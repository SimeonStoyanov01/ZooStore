package com.example.tinqin.zoostore.API.operation.tag.create;

import com.example.tinqin.zoostore.API.base.OperationRequest;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
public class TagCreateRequest implements OperationRequest {

    private String title;
}
