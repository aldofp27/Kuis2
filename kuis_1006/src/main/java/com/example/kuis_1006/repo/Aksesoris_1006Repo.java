/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kuis_1006.repo;

import com.example.kuis_1006.entity.Aksesoris_1006;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author PC-7-320
 */
public interface Aksesoris_1006Repo extends CrudRepository<Aksesoris_1006, Long> {

    @Query("select a from Aksesoris a")
    public List<Aksesoris_1006> findAllAksesoris();
    
}
