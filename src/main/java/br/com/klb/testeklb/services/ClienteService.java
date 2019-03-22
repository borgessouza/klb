package br.com.klb.testeklb.services;


import br.com.klb.testeklb.DTO.ClienteDTO;
import br.com.klb.testeklb.Entity.Cliente;
import br.com.klb.testeklb.Exception.ResourceNotAllowException;
import br.com.klb.testeklb.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public void cadastraCliente(ClienteDTO cliente) {
        try {
            clienteRepository.save(new Cliente(cliente.getNome(),
                    cliente.getCredito(),
                    cliente.getRisco().getValor(),
                    cliente.getRisco()));
        } catch (Exception ex) {
            throw new ResourceNotAllowException("Erro ao Registrar Cliente");
        }
    }

}
