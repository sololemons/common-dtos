package com.shared.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CertificateRequestDto {
    private String studentId;
    private String studentFirstName;
    private String studentLastName;
    private String email;
    private Long courseId;
    private String courseName;
    private LocalDate completionDate;
}
