package com.vti.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vti.entity.Department.Type;
import lombok.Getter;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class DepartmentDTO extends RepresentationModel<DepartmentDTO> {
    private Integer id;
    private String name;
    private Integer totalMembers;
    private Type type;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateAt;


    private List<AccountDTO> accounts;

    @Getter
    @Setter
    public static class AccountDTO extends RepresentationModel<AccountDTO> {
        @JsonProperty("accountid")
        private Integer id;
        private String username;
    }
}
