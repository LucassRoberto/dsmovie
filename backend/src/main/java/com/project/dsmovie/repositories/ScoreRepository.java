package com.project.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.dsmovie.entities.Score;
import com.project.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository <Score, ScorePK> {

}
