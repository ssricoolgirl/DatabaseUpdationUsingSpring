package com.sree.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerData extends JpaRepository<Customer, Long> {
}
