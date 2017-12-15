/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kuis_1006.service;

import com.example.kuis_1006.entity.Aksesoris_1006;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.kuis_1006.repo.Aksesoris_1006Repo;
/**
 *
 * @author PC-7-320
 */
@Service("aksesorisService")
@Transactional
public class Aksesoris_1006Service {

    @Autowired
    private Aksesoris_1006Repo repo;

    public Aksesoris_1006 insert(Aksesoris_1006 aksesoris) {
        return repo.save(aksesoris);
    }
    
    public Aksesoris_1006 update(Aksesoris_1006 aksesoris) {
        return repo.save(aksesoris);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Aksesoris_1006 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<Aksesoris_1006> getAll(){
        return repo.findAllAksesoris();
    }
    
}
