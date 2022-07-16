package com.example.Base.dto;

import com.example.Base.domain.RoleEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoleDTO {
    private Long id;
    private String name;

    public RoleEntity toEntity(){
        RoleEntity roleEntity = RoleEntity.builder()
                .name(name)
                .build();
        return roleEntity;
    }
}
