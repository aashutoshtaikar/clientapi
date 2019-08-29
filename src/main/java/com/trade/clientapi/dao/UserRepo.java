package com.trade.clientapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trade.clientapi.entity.User;

public interface UserRepo extends JpaRepository<User, String> {
}
