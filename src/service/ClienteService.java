package service;

import dao.ClienteDao;
import dao.IClientDAO;

public class ClienteService {

    private IClientDAO clienteDao;

    public ClienteService (IClientDAO clienteDao){
        this.clienteDao = clienteDao;
    }


    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }

    public String buscar() {
        clienteDao.buscar();
        return "Encontrado";
    }

    public String excluir(){
        clienteDao.excluir();
        return "Excluido";
    }

    public String atualizar(){
        clienteDao.atualizar();
        return "Atualizado";
    }

}
