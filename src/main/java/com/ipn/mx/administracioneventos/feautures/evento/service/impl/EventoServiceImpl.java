package com.ipn.mx.administracioneventos.feautures.evento.service.impl;

import com.ipn.mx.administracioneventos.core.domain.Evento;
import com.ipn.mx.administracioneventos.feautures.evento.repository.EventoRepository;
import com.ipn.mx.administracioneventos.feautures.evento.service.EventoService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.util.List;

@Service
public class EventoServiceImpl implements EventoService {
    @Override
    @Transactional
    public List<Evento> findAll() {
        return List.of();
    }

    @Override
    @Transactional
    public Evento findById(Long id) {
        return null;
    }

    @Override
    @Transactional
    public Evento save(Evento evento) {
        return null;
    }

    @Override
    @Transactional
    public void delete(Long id) {

    }

    @Override
    @Transactional
    public ByteArrayInputStream reportePDF(List<Evento> listaEventos) {
        return null;
    }

    @Autowired
    private EventoRepository eventoRepository;
}
