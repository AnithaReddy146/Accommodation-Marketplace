package com.dcl.accommodate;

import com.dcl.accommodate.model.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface repository extends JpaRepository<User, UUID>{
}
