package com.shared.dtos;

import lombok.Data;

@Data
public class CertificateConditionsDto {

    private String courseId;
    private String isCertificateGenerationActive;
    private String averagePassMark;
}
