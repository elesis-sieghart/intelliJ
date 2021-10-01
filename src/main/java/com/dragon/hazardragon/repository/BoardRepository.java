package com.dragon.hazardragon.repository;

import com.dragon.hazardragon.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
