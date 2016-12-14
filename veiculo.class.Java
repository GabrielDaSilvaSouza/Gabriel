#Java

public class Carro {

    String portaMala;
    String portas;
    String airbag;

    public void mostraVeiculo() {
        System.out.println("\n PortaMala : " + getPortaMala());
        System.out.println("\n Portas : " + getPortas());
        System.out.println("\n airbag : " + getAirbag());
    }

    public String getPortaMala() {
        return portaMala;
    }

    public void setPortaMala(String portaMala) {
        this.portaMala = portaMala;
    }

    public String getPortas() {
        return portas;
    }

    public void setPortas(String portas) {
        this.portas = portas;
    }

    public String getAirbag() {
        return airbag;
    }

    public void setAirbag(String airbag) {
        this.airbag = airbag;
    }
} 


public class Moto {

    String capacete;
    String guidao;
    String pezinho;  
    
 public void mostraVeiculo() {
        System.out.println("\n capacete : " + getCapacete());
        System.out.println("\n guidao : " + getGuidao());
        System.out.println("\n pezinho: " + getPezinho());
    }
    public String getCapacete() {
        return capacete;
    }

    public void setCapacete(String capacete) {
        this.capacete = capacete;
    }

    public String getGuidao() {
        return guidao;
    }

    public void setGuidao(String guidao) {
        this.guidao = guidao;
    }

    public String getPezinho() {
        return pezinho;
    }

    public void setPezinho(String pezinho) {
        this.pezinho = pezinho;
    }    
}


public class Veiculo {

    private String anof;
    private String cor;
    private String farol;
    private String freios;
    char tipo;

    void pedido() {
        System.out.println("Ano de frabricação");
        System.out.println("Cor do veiculo");
        System.out.println("Farol do veiculo");
        System.out.println("Volante do veiculo");
        System.out.println("Cambio do veiculo");
        System.out.println("Freio do veiculo");
        System.out.println("Airbag Do veiculo");
    }

    void devolução() {
        System.out.println("Pedido Devolvido");
    }

    public void mostraVeiculo() {
        if (tipo == 'C') {
            System.out.println(" [ Carro ]");
            
        } else if (tipo == 'M') {
            System.out.println(" [ Moto ] ");
        }

    }

    public String getAnof() {
        return anof;
    }

    public void setAnof(String anof) {
        this.anof = anof;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getFarol() {
        return farol;
    }

    public void setFarol(String farol) {
        this.farol = farol;
    }

    public String getFreios() {
        return freios;
    }

    public void setFreios(String freios) {
        this.freios = freios;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
} 


public class Principal {

    public static void main(String[] args) {

        Veiculo carro = new Veiculo();
        carro.setAnof("2017");
        carro.setCor("Azul");
        carro.setFarol(" 4");
        carro.setFreios(" 2 freios ");
        carro.tipo = 'C';
        carro.mostraVeiculo();

        Carro carro1 = new Carro();
        carro1.portaMala = (" 1 ");
        carro1.portas = (" 2 ");
        carro1.airbag = (" 2 ");
        carro1.mostraVeiculo();

        Veiculo moto = new Veiculo();
        moto.setAnof("2017");
        moto.setCor("Azul");
        moto.setFarol(" 4");
        moto.setFreios(" 2 freios ");
        moto.tipo = 'M';
        moto.mostraVeiculo();

        Moto moto1 = new Moto();
        moto1.capacete = ("1");
        moto1.guidao = ("2");
        moto1.pezinho = ("1");
        moto1.mostraVeiculo();

    }

}
