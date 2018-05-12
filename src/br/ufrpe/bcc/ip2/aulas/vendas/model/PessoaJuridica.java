package br.ufrpe.bcc.ip2.aulas.vendas.model;

import java.util.Objects;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                super.toString() + ", " +
                "cnpj='" + cnpj + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoaJuridica that = (PessoaJuridica) o;
        return Objects.equals(getCnpj(), that.getCnpj());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getCnpj());
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
