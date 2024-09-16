package com.xpfuture.xday.controller;

import com.xpfuture.xday.entity.Lead;
import com.xpfuture.xday.entity.form.LeadForm;
import com.xpfuture.xday.service.impl.LeadServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/xday")
public class LeadController {

    @Autowired
    private LeadServiceImpl service;

    @GetMapping("/leads")
    public List<Lead> getAll() {
        return service.getAll();
    }

    @PostMapping("/newlead")
    public Lead create(@RequestBody LeadForm form) {
        return service.create(form);
    }

    //TODO implementar métodos: get e delete
}
