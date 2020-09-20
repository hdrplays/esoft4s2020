package Atividade_avaliativa;

class VeiculoNaoRegistradoException extends RuntimeException {
    private static final long serialVersionUID = 1;

    public VeiculoNaoRegistradoException(String msg) {
        super(msg);
    }

    public VeiculoNaoRegistradoException(String msg, Throwable cause) {
        super(msg, cause);
    }
}