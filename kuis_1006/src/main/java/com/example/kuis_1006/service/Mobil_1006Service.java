/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kuis_1006.service;

import com.example.kuis_1006.entity.Mobil_1006;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.kuis_1006.repo.Mobil_1006Repo;
/**
 *
 * @author PC-7-320
 */
@Service("mobilService")
@Transactional
public class Mobil_1006Service {

    @Autowired
    private Mobil_1006Repo repo;

    public Mobil_1006 insert(Mobil_1006 mobil) {
        return repo.save(mobil);
    }
    
    public Mobil_1006 update(Mobil_1006 mobil) {
        return repo.save(mobil);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Mobil_1006 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<Mobil_1006> getAll(){
        return repo.findAllMobil();
    }
    
}
