package com.example.demo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class contentservice {
    @Autowired
    private Repository repo;
    public List<service> listAll() {
        return repo.findAll();
    }

    public void save(service product) {
        repo.save(product);
    }

    public service get(long id) {
        return repo.findById(id).get();
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}


