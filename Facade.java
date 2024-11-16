package one.digitalinnovation.gof.Facade;

import SubCEP.CepApi;
import SubsistemaCRM.CRMService;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CRMService.gravarCliente(nome,cep,cidade,estado);
    }
}
