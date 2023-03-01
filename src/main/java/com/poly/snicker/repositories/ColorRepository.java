package com.poly.snicker.repositories;

import com.poly.snicker.models.Colors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepository extends JpaRepository<Colors, Integer> {
}
