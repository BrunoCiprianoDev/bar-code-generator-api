package com.bcipriano.codeGenerator.exception.resourceExceptions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StandartError {

    private static final Long serialVersionID = 1L;

    private Instant timestamp;

    private Integer status;

    private String error;

    private String message;

    private String path;

}
