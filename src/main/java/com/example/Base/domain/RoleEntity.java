package com.example.Base.domain;

import com.example.Base.dto.RoleDTO;
import com.example.Base.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data //Getter, Setter, toString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "role")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public RoleDTO toDTO() {
        RoleDTO roleDTO = RoleDTO.builder()
                .name(name)
                .build();
        return roleDTO;
    }
}
