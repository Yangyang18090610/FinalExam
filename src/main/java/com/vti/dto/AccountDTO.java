package com.vti.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AccountDTO {
    private Integer id;
    private String role;
    private String username;
    private String fullName;
    private String departmentName;

}
