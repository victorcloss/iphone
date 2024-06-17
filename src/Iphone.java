public class Iphone implements ReprodutorMusical, AparelhoTelefonico, Navegador{
    public static void main(String[] args) {
        
    }
    public void ligarIphone(){
        System.out.println("Iphone Ligado");
    }
    public void abrirAppItunes(){System.out.println("Itunes esta aberto");}
    public void abrirAppTelefone(){System.out.println("App do Telefone esta aberto");}
    public void abrirAppNavegador(){System.out.println("Navegador esta aberto");}

    public void ligar(String numero){ 
        System.out.println("Ligando para o numero: "+ numero);
    }
    public void atender(){ 
        System.out.println("Atender ou Desligar?");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Seu correio de voz");
    }          
    
    public void tocar(){
        System.out.println("A musica esta tocando");
    }
    public void pausar(){
        System.out.println("A musica esta pausada");
    }
    public void selecionarMusica(String msc){
        System.out.println("Tocando a musica: "+ msc);
    }
    
    public void exibirPagina(String url){
        System.out.println("Exibindo pagina: "+ url);
    }
    public void adicionarNovaAba(){
        System.out.println( "Nova Aba foi aberta");
    }
    public void atualizarPagina(){
        System.out.println("Pagina atual foi atualizada");
    }
}
