package com.vti.form;

import com.vti.entity.Department;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


import java.time.LocalDateTime;

@Setter
@Getter
public class DepartmentFilterForm {
    private String search;
    private Integer minTotalMembers;
    private Integer maxTotalMembers;

    @DateTimeFormat(iso = ISO.DATE_TIME)
    private LocalDateTime minCreatedAt;
    @DateTimeFormat(iso = ISO.DATE_TIME)
    private LocalDateTime maxCreatedAt;

    private Integer minCreatedYear;
    private Department.Type type;
}
