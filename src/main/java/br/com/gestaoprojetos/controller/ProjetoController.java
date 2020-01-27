package br.com.gestaoprojetos.controller;

import br.com.gestaoprojetos.entity.Projeto;
import br.com.gestaoprojetos.service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/projetos")
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    @GetMapping(value = "/busca-projetos", produces = "application/json")
    public List<Projeto> buscaProjetos(){
        return projetoService.getAllProjetcs();
    }

}
