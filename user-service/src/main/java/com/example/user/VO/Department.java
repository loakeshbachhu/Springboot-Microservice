package com.example.user.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Value Object
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    public Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
