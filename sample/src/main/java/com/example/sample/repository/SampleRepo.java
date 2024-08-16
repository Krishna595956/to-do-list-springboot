package com.example.sample.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sample.model.Tasks;

public interface SampleRepo extends JpaRepository<Tasks,Integer>{


}
