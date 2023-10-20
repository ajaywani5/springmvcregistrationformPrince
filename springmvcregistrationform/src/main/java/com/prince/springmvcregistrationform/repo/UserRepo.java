package com.prince.springmvcregistrationform.repo;

import com.prince.springmvcregistrationform.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,String> {
}
