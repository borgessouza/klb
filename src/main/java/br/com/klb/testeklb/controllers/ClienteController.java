package br.com.klb.testeklb.controllers;

import br.com.klb.testeklb.DTO.ClienteDTO;
import br.com.klb.testeklb.Utils.TipoRisco;
import br.com.klb.testeklb.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ClienteController {

    @Autowired
    private ClienteService clienteService;


    @GetMapping({"/", ""})
    public String index() {
        return "cadastroCliente";
    }

    @GetMapping(value = "/riscos" , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody ResponseEntity<List<TipoRisco>> carregaRisco() {
        return new ResponseEntity<List<TipoRisco>>(Arrays.stream(TipoRisco.values())
                .collect(Collectors.toList()), HttpStatus.OK);
    }

    @PostMapping(value = "/cadastrar", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
                produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody ResponseEntity<ClienteDTO> cadastroRisco(@RequestBody ClienteDTO cliente) {
        clienteService.cadastraCliente(cliente);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
