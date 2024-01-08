package com.example.libraymakeenproject.dto;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class RoleDto {
    private Long Id;
    private String RoleName;
    //*************************************  setter & getter  *****************************************//


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getRoleName() {
        return RoleName;
    }

    public void setRoleName(String roleName) {
        RoleName = roleName;
    }
    //*************************************  to string  *****************************************//

    @Override
    public String toString() {
        return "RoleDto{" +
                "Id=" + Id +
                ", RoleName='" + RoleName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleDto roleDto = (RoleDto) o;
        return Objects.equals(Id, roleDto.Id) && Objects.equals(RoleName, roleDto.RoleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, RoleName);
    }
}
