package com.spring_store.SpringStore.controllers;

import com.spring_store.SpringStore.models.KeyboardModel;
import com.spring_store.SpringStore.services.KeyboardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/keyboard")
@CrossOrigin(origins = "*")
public class KeyboardController{

    private final KeyboardService service;

    public KeyboardController(KeyboardService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<KeyboardModel>> listarTodos() {
        return ResponseEntity.ok(service.listar());
    }

    @PostMapping
    public ResponseEntity<KeyboardModel> criar(@RequestBody KeyboardModel keyboard) {
        return ResponseEntity.ok(service.cadastrar(keyboard));
    }

    @GetMapping("/{id}")
    public ResponseEntity<KeyboardModel> buscarPorId(@PathVariable Integer id) {
        KeyboardModel keyboard = service.buscarPorId(id);
        return ResponseEntity.ok(keyboard);
    }

    @PutMapping("/{id}")
    public ResponseEntity<KeyboardModel> atualizar(@PathVariable Integer id, @RequestBody KeyboardModel keyboard) {
        KeyboardModel keyboardAtualizado = service.atualizar(id, keyboard);
        return ResponseEntity.ok(keyboardAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }
}