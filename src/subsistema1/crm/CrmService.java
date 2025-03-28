package subsistema1.crm;

public class CrmService {
    private CrmService(){}
    public static void gravarCliente(String nome,String cep ,String cidade,String estado){
        System.out.printf("Cliente %s salvo no Crm\n", nome);
    }
}
