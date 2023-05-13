package com.smartagilify.projectmanagement.dtos;

import com.smartagilify.core.model.BaseDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WbsProgressPercentDTO extends BaseDTO {
    private Long performanceReportId;
    private Long wbsId;
    private Integer progressPercent;
}
