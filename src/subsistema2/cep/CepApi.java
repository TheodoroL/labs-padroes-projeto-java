package subsistema2.cep;

public class CepApi {
    private static CepApi instancia = new CepApi();
    private CepApi(){}

    public static  CepApi getInstancia(){
        return instancia;
    }

    public String  recuperarCidade(){
        return "Campo Grande";
    }
    public  String recuperarEstado(){
        return "MS";
    }
}
