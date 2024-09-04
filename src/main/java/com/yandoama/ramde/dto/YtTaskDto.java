package com.yandoama.ramde.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class YtTaskDto {
    private Long id;
    private String title;
    private String description;
    private EStatus status;
}
