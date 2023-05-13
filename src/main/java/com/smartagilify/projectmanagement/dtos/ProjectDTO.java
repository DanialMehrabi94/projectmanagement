package com.smartagilify.projectmanagement.dtos;

import com.smartagilify.core.model.BaseDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDTO extends BaseDTO {
    private String title;
    private Date startDate;
    private Date endDate;
    private BigDecimal budget;
    private Long projectScale;
    private Long projectProgress;
}
