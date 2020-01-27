package br.com.gestaoprojetos.service;

import br.com.gestaoprojetos.entity.Projeto;
import br.com.gestaoprojetos.repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository projetoRepository;

    public List<Projeto> getAllProjetcs(){
        return projetoRepository.findAll();
    }


}
