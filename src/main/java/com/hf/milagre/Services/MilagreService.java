package com.hf.milagre.Services;

import com.hf.milagre.Models.MilagreModel;
import com.hf.milagre.Repositories.MilagreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/milagres")
public class MilagreService {

    @Autowired
    MilagreRepository milagreRepository;

    // GET
    @GetMapping
    public List<MilagreModel> milagreModelList() {
        return milagreRepository.findAll();
    }

    // POST
    @PostMapping
    public MilagreModel criar(@RequestBody MilagreModel milagreModel) {
        return  milagreRepository.save(milagreModel);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        milagreRepository.deleteById(id);
    }

    // PUT
    @PutMapping("/{id}")
    public MilagreModel atualizar(@PathVariable Long id, @RequestBody MilagreModel milagreModel) {
        MilagreModel newMilagre = milagreRepository.findById(id).get();
        newMilagre.setNome(milagreModel.getNome());

        return milagreRepository.save(newMilagre);
    }

}
