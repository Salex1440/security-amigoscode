package com.example.securityamigoscode.security;

import com.google.common.collect.Sets;
import lombok.Getter;

import java.util.Set;

import static com.example.securityamigoscode.security.ApplicationUserPermission.*;

@Getter
public enum ApplicationUserRole {
    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(
            COURSE_READ,
            COURSE_WRITE,
            STUDENT_READ,
            STUDENT_WRITE
    )),
    ADMINTRAINEE(Sets.newHashSet(
            COURSE_READ,
            STUDENT_READ
    ));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }

}
