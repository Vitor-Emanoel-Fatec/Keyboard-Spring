package com.spring_store.SpringStore.services;

import com.spring_store.SpringStore.models.KeyboardModel;
import com.spring_store.SpringStore.repositories.KeyboardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeyboardService{

    private final KeyboardRepository keyboardRepository;

    public KeyboardService(KeyboardRepository keyboardRepository) {
        this.keyboardRepository = keyboardRepository;
    }

    public KeyboardModel cadastrar(KeyboardModel keyboardModel){
        return keyboardRepository.save(keyboardModel);
    }

    public List<KeyboardModel> listar(){
        return keyboardRepository.findAll();
    }

    public KeyboardModel buscarPorId(Integer id){
        return keyboardRepository.findById(id).orElse(null);
    }

    public KeyboardModel atualizar(Integer id, KeyboardModel keyboardModel){
        KeyboardModel keyboardExistente = keyboardRepository.findById(id).orElse(null);
        keyboardExistente.setId(keyboardModel.getId());
        keyboardExistente.setMarca(keyboardModel.getMarca());
        keyboardExistente.setModelo(keyboardModel.getModelo());
        keyboardExistente.setCor(keyboardModel.getCor());
        keyboardExistente.setSwitch_color(keyboardModel.getSwitch_color());
        return keyboardRepository.save(keyboardExistente);
    }

    public boolean excluir(Integer id){
        if(!keyboardRepository.existsById(id))
            return false;
        keyboardRepository.deleteById(id);
        return true;
    }
}