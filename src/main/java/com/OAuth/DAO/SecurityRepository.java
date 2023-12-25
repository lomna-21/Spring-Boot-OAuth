package com.OAuth.DAO;

import com.OAuth.Security.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecurityRepository extends JpaRepository<User , Integer> {

    User findByUsername(String username);

}
