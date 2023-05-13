package com.smartagilify.projectmanagement.dtos;

import com.smartagilify.core.model.BaseDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProjectMemberDTO extends BaseDTO {
    private Long projectId;
    private Long roleId;
    private Date startDate;
    private Date endDate;
}
