/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kuis_1006.controller;
import com.example.kuis_1006.entity.Mobil_1006;
import com.example.kuis_1006.service.Mobil_1006Service;
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
@RequestMapping("/mobil")
public class Mobil_1006Controller {
    

    
    @Autowired
    private Mobil_1006Service mobilService;

    @RequestMapping(method = RequestMethod.POST)
    public Mobil_1006 insert(@RequestBody Mobil_1006 mobil) {
        return mobilService.insert(mobil);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Mobil_1006 update(@RequestBody Mobil_1006 mobil) {
        return mobilService.update(mobil);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return mobilService.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Mobil_1006 getById(@PathVariable("id") Long id){
        return mobilService.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Mobil_1006> getAll(){
        return mobilService.getAll();
    }
}
