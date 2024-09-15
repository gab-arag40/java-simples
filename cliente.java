import java.util.Date;

public class cliente{
   
    public enum TipoDocumento {
        CPF, RG, CNH, PASSAPORTE;
    }

//atributos
    private int id_cliente;
    private String nome_Cli;
    private static TipoDocumento old_Tipo_documento;
    private int Cod_Docum; 
    private int Rg_Cli;
    private String Endereco;
    private String Bairro;
    private String Cidade;
    private String Estado;
    private String CEP;
    private int DDD_res;
    private String Tel_res;
    private int DDD_com;
    private String Tel_com;
    private int DDD_cel;
    private String Tel_cel;
    private int E_mail;
    private int Status_cli;
    private Date Data_cad_cli;

//get´s e set´s

    // g&s id_cliente
    public int getid_cliente(){
        return id_cliente;
    }

    public void setid_cliente(int id_cliente){
        this.id_cliente = id_cliente;
    }

    // g&s nome_Cli
    public String getnome_Cli(){
        return nome_Cli;
    }

    public void setnome_Cli(String nome_Cli){
        this.nome_Cli = nome_Cli;
    }

    // g&s old_Tipo_documento 
    public TipoDocumento getold_Tipo_documento() {
        return old_Tipo_documento;
    }

    public void setold_Tipo_documento(TipoDocumento old_tipo_documento) {
        this.old_Tipo_documento = old_Tipo_documento;
    }

    // g&s Cod_Docum
    public int getCod_Docum(){
        return Cod_Docum;
    }

    public void setCod_Docum(int Cod_Docum){
        this.Cod_Docum = Cod_Docum;
    }

    // g&s Rg_Cli
    public int getRg_Cli(){
        return Rg_Cli;
    }

    public void setRg_Cli(int Rg_Cli){
        this.Rg_Cli = Rg_Cli;
    }

    // g&s Endereco
    public String getEndereco(){
        return Endereco;
    }

    public void setEndereco(String Endereco){
        this.Endereco = Endereco;
    }

    // g&s Bairro
    public String getBairro(){
        return Bairro;
    }

    public void setBairro(String Bairro){
        this.Bairro = Bairro;
    }

    // g&s Cidade
    public String getCidade(){
        return Cidade;
    }

    public void setCidade(String Cidade){
        this.Cidade = Cidade;
    }

    
    // g&s Estado
    public String getEstado(){
        return Estado;
    }

    public void setEstado(String Estado){
        this.Estado = Estado;
    }


    // g&s CEP
    public String getCEP(){
        return CEP;
    }

    public void setCEP(String CEP){
        this.CEP = CEP;
    }

    // g&s DDD_res
    public int getDDD_res(){
        return DDD_res;
    }

    public void setDDD_res(int DDD_res){
        this.DDD_res = DDD_res;
    }

    // g&s Tel_res
    public String getTel_res(){
        return Tel_res;
    }

    public void setTel_res(String Tel_res){
        this.Tel_res = Tel_res;
    }

    // g&s DDD_com
    public int getDDD_com(){
        return DDD_com;
    }

    public void setDDD_com(int DDD_com){
        this.DDD_com = DDD_com;
    }

    // g&s Tel_com
    public String getTel_com(){
        return Tel_com;
    }

    public void setTel_com(String Tel_com){
        this.Tel_com = Tel_com;
    }

    // g&s DDD_cel
    public int getDDD_cel(){
        return DDD_cel;
    }

    public void setDDD_cel(int DDD_cel){
        this.DDD_cel = DDD_cel;
    }

    // g&s Tel_cel
    public String getTel_cel(){
        return Tel_cel;
    }

    public void setTel_cel(String Tel_cel){
        this.Tel_cel = Tel_cel;
    }

    // g&s E_mail
    public int getE_mail(){
        return E_mail;
    }

    public void setE_mail(int E_mail){
        this.E_mail = E_mail;
    }

    // g&s Status_cli
    public int getStatus_cli(){
        return Status_cli;
    }

    public void setStatus_cli(int Status_cli){
        this.Status_cli = Status_cli;
    }

    //g&s Data_cad_cli
    public Date getData_cad_cli(){
        return Data_cad_cli;
    }

    public void setData_cad_cli(Date Data_cad_cli){
        this.Data_cad_cli = Data_cad_cli;
    }


 // metodos

    //efetuar pedido
    public void Efetua_pedido(){
        System.out.println(nome_Cli + " efetuou um pedido.");
    }

    //efetuar pagamento
    public void Efetua_pagamento(){
        System.out.println(nome_Cli + " efetuou o pagamento.");
    }

    //Cadastrar cliente
    public void Cadastra_cliente(){
        System.out.println(nome_Cli + " foi cadastrado(a) com sucesso.");
    }

    //excluir cliente
    public void Exclui_cliente(){
        System.out.println("O cadastro de " + nome_Cli + " foi excluido com sucesso.");
    }

    //alteração de dados
    public void Altera_Dados(){
        System.out.println("Os dados de cadastro de " + nome_Cli + " foram alterados com sucesso.");
    }

    //consulta de dados
    public void Consulta_Dados(){
        System.out.println("Os dados de " + nome_Cli + " são: RG nº " + Rg_Cli + " / " + " Endereço: " + Endereco +" - "+ Bairro +", "+ Cidade +" - "+ Estado +" / " +"CEP: " + CEP);
    }

 // metodo principal
    public static void main(String[] args){
        cliente alice = new cliente();
        alice.setnome_Cli("Alice M. Yui");
        alice.setid_cliente(1);
        alice.setRg_Cli(4725746);
        alice.setEndereco("Rua dos Anjos, 22");
        alice.setBairro("Jardim Saudade");
        alice.setCidade("Cariacica");
        alice.setEstado("ES");
        alice.setCEP("48542330");
        alice.setDDD_cel(27);
        alice.setTel_cel("997542036");
      
        System.out.println("inclui o cliente: " + alice.getnome_Cli() + ". ");
        alice.Cadastra_cliente();
        alice.Efetua_pedido();
        alice.Efetua_pagamento();
        alice.Altera_Dados();
        alice.Consulta_Dados();
        alice.Exclui_cliente();

        System.out.println("================");

    }
}

