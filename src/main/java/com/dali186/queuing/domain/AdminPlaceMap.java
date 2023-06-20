package com.dali186.queuing.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AdminPlaceMap {
    private Long id;
    private Long adminId;
    private Long placeId;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
