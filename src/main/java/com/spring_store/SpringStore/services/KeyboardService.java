package com.spring_store.springstore.services;

import com.spring_store.springstore.models.KeyboardModel;
import com.saov.playlist.repositories.KeyboardRepository;
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
        return KeyboardRepository.findAll(); 
    }

    public KeyboardModel buscarPorId(String id){
        return KeyboardRepository.findById(id).orElse(null);
    }

    public KeyboardModel atualizar(String id, KeyboardModel keyboardModel){
        KeyboardModel keyboardExistente = keyboardRepository.findById(id).orElse(null);
        keyboardExistente.setId(keyboardModel.getId());
        keyboardExistente.setNome(keyboardModel.getNome());
        keyboardExistente.setArtista((keyboardModel.getArtista()));
        keyboardExistente.setAlbum(keyboardModel.getAlbum());
        keyboardExistente.setAno(keyboardModel.getAno());
        return keyboardRepository.save(keyboardExistente);
    }

    public boolean excluir(String id){
        if(!keyboardRepository.existsById(id))
            return false;
        keyboardRepository.deleteById(id);
        return true;
    }
}