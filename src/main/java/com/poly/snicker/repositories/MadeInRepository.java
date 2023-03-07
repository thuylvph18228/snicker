package com.poly.snicker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MadeInRepository extends JpaRepository<MadeIn, Integer> {
}
