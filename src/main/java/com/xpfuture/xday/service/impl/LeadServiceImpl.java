package com.xpfuture.xday.service.impl;

import com.xpfuture.xday.repository.LeadRepository;
import com.xpfuture.xday.entity.Lead;
import com.xpfuture.xday.entity.form.LeadForm;
import com.xpfuture.xday.service.ILeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeadServiceImpl implements ILeadService {

    @Autowired
    private LeadRepository repository;

    @Override
    public Lead create(LeadForm form) {
        Lead lead = new Lead();
        lead.setNome(form.getNome());
        lead.setTelefone(form.getTelefone());
        lead.setEmail(form.getEmail());

        return repository.save(lead);
    }

    @Override
    public Lead get(Long id) {
        return null;
    }

    @Override
    public List<Lead> getAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Long id) {}
}
