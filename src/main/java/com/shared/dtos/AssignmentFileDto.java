package com.shared.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssignmentFileDto {

    private Long fileId;
    private String fileName;
    private String fileType;
    private String fileUrl;
}
