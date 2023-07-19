package com.example.tinqin.zoostore.API.operation.item.getall;

import com.example.tinqin.zoostore.persistence.entity.MultimediaEntity;
import com.example.tinqin.zoostore.persistence.entity.TagEntity;
import lombok.*;

import java.util.Set;
import java.util.UUID;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemResponse {
    private UUID id;
    private String title;

    private String vendorName;

    private Set<String> tagName;

    private Set<String> multimediaUrl;

    private Boolean isArchived;
}
