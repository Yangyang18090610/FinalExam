package com.vti.form;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AccountFilterForm {
    private String search;
    private Integer minId;
    private Integer maxId;
}
