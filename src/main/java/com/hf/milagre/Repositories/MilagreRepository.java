package com.hf.milagre.Repositories;

import com.hf.milagre.Models.MilagreModel;
import org.springframework.data.jpa.repository.JpaRepository;

// tem que ser interface pq vai trabalhar com banco de dados
public interface MilagreRepository extends JpaRepository<MilagreModel, Long> {
}
