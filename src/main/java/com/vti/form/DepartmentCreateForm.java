package com.vti.form;

import com.vti.entity.Department;
import com.vti.validation.AccountUsernameNotExists;
import com.vti.validation.DepartmentNameNotExists;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.PositiveOrZero;
import java.util.List;

@Setter
@Getter

public class DepartmentCreateForm {
//    khi người dùng nhập sai thêm nhiều dấu cách...
    @NotBlank(message = "{DepartmentForm.name.NotBlank}")
    @Length(max = 50, message = "{DepartmentForm.name.Length}")
    @DepartmentNameNotExists
    private String name;

    @PositiveOrZero(message = "Department total members must be grater than to equal to 0.")
    @NotNull(message = "Department total members must be NOT NULL")
    private Integer totalMembers;

    @Pattern(regexp = "DEVELOPER|TESTER|SCRUM_MASTER|PROJECT_MANAGER",
            message = "Department type must be DEVELOPER, TESTER, SCRUM_MASTER or PROJECT_MANAGER")
    private String type;

    private List<@Valid Account> accounts;

    @Getter
    @Setter

    public static class Account{
        @NotBlank(message = "Account username must NOT be blank." )
        @Length(max = 50,message = "Account username has max 50 characters.")
        @AccountUsernameNotExists
        private String username;
        private String password;
        private String firstName;
        private String lastName;
        private String role;
    }
}
