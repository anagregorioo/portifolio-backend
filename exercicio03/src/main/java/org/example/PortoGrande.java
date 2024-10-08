package org.example;

class PortoGrande extends BasePorto {
    public PortoGrande(String nome) {
        super(nome);
    }

    @Override
    public void atracarBarco(Barco barco) {
        if (barco.getTamanho() >= 10) {
            super.atracarBarco(barco);
        } else {
            System.out.println("Barco " + barco.getNome() + " não pode ser atracado no " + getNome() + " devido ao tamanho.");
        }
    }
}
