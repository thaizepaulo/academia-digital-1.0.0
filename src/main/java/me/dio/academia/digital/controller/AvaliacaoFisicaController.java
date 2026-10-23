package me.dio.academia.digital.controller;

import jakarta.validation.Valid;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.service.impl.AvaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    public AvaliacaoFisicaServiceImpl service;

    @PostMapping
    public AvaliacaoFisica create(@Valid @RequestBody AvaliacaoFisicaForm form) {
        return service.create(form);
    }
}
