package dio.webapi.handler;

/**
 * CampoObrigatorioException
 */
public class CampoObrigatorioException extends BusinessException {

    public CampoObrigatorioException(String campo) {
        super("Ocampo %s é obrigatório");
    }
}