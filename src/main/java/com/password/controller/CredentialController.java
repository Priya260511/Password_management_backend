package com.password.controller;

import com.password.model.Credential;
import com.password.repository.CredentialRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/credentials")
@CrossOrigin("*")
public class CredentialController {

    private final CredentialRepository repo;

    public CredentialController(CredentialRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Credential save(@RequestBody Credential c) {
        return repo.save(c);
    }

    @GetMapping
    public List<Credential> getAll() {
        return repo.findAll();
    }

    @PutMapping("/{id}")
    public Credential update(@PathVariable Long id, @RequestBody Credential updated) {
        Credential c = repo.findById(id).orElseThrow();
        c.setUrl(updated.getUrl());
        c.setUsername(updated.getUsername());
        c.setPassword(updated.getPassword());
        return repo.save(c);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
