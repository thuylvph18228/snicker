package com.poly.snicker.repositories;

import com.poly.snicker.models.Made_In;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MadeInRepository extends JpaRepository<Made_In, Integer> {
}
