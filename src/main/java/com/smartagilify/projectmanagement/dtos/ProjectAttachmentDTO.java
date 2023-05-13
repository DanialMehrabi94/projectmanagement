package com.smartagilify.projectmanagement.dtos;

import com.smartagilify.core.model.BaseDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Blob;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProjectAttachmentDTO extends BaseDTO {
    private Long projectId;
    private Blob attachment;
    private Long attachType;
}
