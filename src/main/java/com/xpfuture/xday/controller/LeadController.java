package com.xpfuture.xday.controller;

import com.xpfuture.xday.entity.Lead;
import com.xpfuture.xday.entity.form.LeadForm;
import com.xpfuture.xday.service.impl.LeadServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class LeadController {

    @Autowired
    private LeadServiceImpl service;

    @GetMapping
    public List<Lead> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Lead create(@RequestBody LeadForm form) {
        return service.create(form);
    }
}
