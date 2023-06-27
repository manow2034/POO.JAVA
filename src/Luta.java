
    

    import java.util.Random;


public class Luta {
    //atributos
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //metodos publicos
    
    public void marcarLuta(Lutador l1, Lutador l2){
        
        if (l1.isCategoria() .equals(l2.isCategoria()) && l1 != l2){
            
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
          System.out.println(" LUTA AGENDADA! DESAFIO ACEITO. ");

        }
        else {
           this.aprovada = false;
           this.desafiante = null;
           this.desafiado = null; 
           System.out.println("Está luta nao pode ser marcada! \ncertifique-se que são dois atletas com categorias iguais");
        
        
        }
    }
    
    public void lutar(){
        
        if (this.aprovada ){
            
            System.out.println(" ### DESAFIADO ### ");
            
            this.desafiado.apresentarLutador();
            
            System.out.println(" ### DESAFIANTE ### ");

            this.desafiante.apresentarLutador();
            
            // vamos usar agora uma classe da biblioteca java chamada random, ela gera numeros aleatórios.
            
            System.out.println(" ### RESULTADO DA LUTA ### ");
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            
            switch (vencedor){
            
                case 0:
                    System.out.println(" EMPATOU ");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    
                break;
            
                case 1:
                    System.out.println(" VITÓRIA DO :  " + this.desafiado.isNome()  );
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                break;
                
                case 2:
                    System.out.println(" VITÓRIA DO : " + this.desafiante.isNome()  );
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                break;
            
            
            }
            
        
        }
        
        else {
            System.out.println(" Esta luta não esta marcada, \nagende a luta com antecedencia :D ");
        }
    
    
    }
    
    
    // metodos getters

    public Lutador getDesafiado() {
        return desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }
    
    // metodos setters

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
     
    
}


