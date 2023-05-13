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
public class WbsDTO extends BaseDTO {
    private Long projectId;
    private String wbsTitle;
    private Date scheduleStartDate;
    private Date scheduleEndDate;
    private Date actualStartDate;
    private Date actualEndDate;
    private Integer weightPercent;
    private Integer progressPercent;
}
