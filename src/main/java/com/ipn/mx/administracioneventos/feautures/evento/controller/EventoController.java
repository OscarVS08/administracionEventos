package com.ipn.mx.administracioneventos.feautures.evento.controller;

import com.ipn.mx.administracioneventos.core.domain.Evento;
import com.ipn.mx.administracioneventos.feautures.evento.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins={"*"})
@RestController
@RequestMapping("api/v1/aventos")
public class EventoController {
    @Autowired
    private EventoService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Evento> readAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity <?> readById(@PathVariable Long id){
        Evento evento = null;
        Map<String, Object> respuesta = new HashMap<>();
        try{
            evento = service.findById(id);
        }catch (DataAccessException e){
            respuesta.put("mensaje", "Error al realizar consulta en la base de datos");
            respuesta.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String,Object>>(respuesta, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        if(evento == null){
            respuesta.put("mensaje", "No se encontro el registro".concat(id.toString().concat("no existe en la bd")));
            return new ResponseEntity<Map<String,Object>>(respuesta, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Evento>(Evento, HttpSatus.OK);
        return null;
    }
}

