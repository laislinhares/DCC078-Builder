package org.example;

import java.util.Date;

public class EmpresaBuilder {

    private final Empresa empresa;

    public EmpresaBuilder() {
        empresa = new Empresa();
    }

    public Empresa build() {
        if (empresa.getCnpj() == 0) {
            throw new IllegalArgumentException("CNPJ inválido");
        }
        if (empresa.getNome().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return empresa;
    }

    public EmpresaBuilder setCnpj (int cnpj) {
        empresa.setCnpj(cnpj);
        return this;
    }

    public EmpresaBuilder setNome (String nome) {
        empresa.setNome(nome);
        return this;
    }

    public EmpresaBuilder setEndereco (String endereco) {
        empresa.setEndereco(endereco);
        return this;
    }

    public EmpresaBuilder setCidade (String cidade) {
        empresa.setCidade(cidade);
        return this;
    }

    public EmpresaBuilder setSetor (String setor) {
        empresa.setSetor(setor);
        return this;
    }

    public EmpresaBuilder setTelefone (int telefone) {
        empresa.setTelefone(telefone);
        return this;
    }

    public EmpresaBuilder setDataAbertura (Date dataAbertura) {
        empresa.setDataAbertura(dataAbertura);
        return this;
    }
}
