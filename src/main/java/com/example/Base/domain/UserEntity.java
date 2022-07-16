package com.example.Base.domain;

import com.example.Base.dto.UserDTO;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String id;
    private String username;
    private String email;
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)//사용자를 로드 할 떄마다 모든역할을 로드하기원하면 EAGER
    private Collection<RoleEntity> roles = new ArrayList<>();

    public UserDTO toDTO() {
        UserDTO userDTO = UserDTO.builder()
                .username(username)
                .password(password)
                .email(email)
                .build();
        return userDTO;
    }
}
