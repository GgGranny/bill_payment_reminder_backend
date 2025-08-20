package com.react_project.bill_payment_reminder.repository;


import com.react_project.bill_payment_reminder.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer > {

}
