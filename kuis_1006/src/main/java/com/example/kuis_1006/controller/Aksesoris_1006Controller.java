/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kuis_1006.controller;
import com.example.kuis_1006.entity.Aksesoris_1006;
import com.example.kuis_1006.service.Aksesoris_1006Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PC-7-320
 */
@RestController
@RequestMapping("/aksesoris")
public class Aksesoris_1006Controller {
    
    @Autowired
    private Aksesoris_1006Service aksesorisService;

    @RequestMapping(method = RequestMethod.POST)
    public Aksesoris_1006 insert(@RequestBody Aksesoris_1006 aksesoris) {
        return aksesorisService.insert(aksesoris);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Aksesoris_1006 update(@RequestBody Aksesoris_1006 aksesoris) {
        return aksesorisService.update(aksesoris);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return aksesorisService.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Aksesoris_1006 getById(@PathVariable("id") Long id){
        return aksesorisService.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Aksesoris_1006> getAll(){
        return aksesorisService.getAll();
    }
}
