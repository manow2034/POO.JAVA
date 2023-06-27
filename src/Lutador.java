


public class Lutador {

            //ATRIBUTOS
    
            private String nome;
            private String nacionalidade;
            private int idade;
            private float altura;
            private float peso;
            private String categoria;
            private int vitorias;
            private int derrotas;
            private int empates;

            //METODOS PUBLICOS
    
    public void apresentarLutador(){
    
        System.out.println(" ----------------------------------------------------------------------- ");
        System.out.println
        (" Ladies and gentlemen, we are live! "
        + " This is the main event of the evening,  "
        + " \nThis is the moment you've all been waiting for, It's time! " + 
        "\nFighting in the red corner, " + getIdade() + " years , " + " \nthis man is a fighter Weight " + isCategoria() +
        ", \ntotaliing " + getVitorias() + " victories , " + getDerrotas() + 
        " defeats and " + getEmpates() + " ties, with " 
        + getAltura() + " height, weighing " + getPeso() 
        + " kg, \nrepresenting " + isNacionalidade() + "" + isNome() + " !!!!!! " );
        
        System.out.println(" ------------------------------------------------------------------------ ");
      
    }
    
   
    
    public void statusLutador(){
        
        System.out.println(" STATUS ");
        System.out.println(" --------------------------------------");
        System.out.println(" NOME: " + isNome());
        System.out.println(" NACIONALIDAE: " + isNacionalidade());;
        System.out.println(" CATEGORIA: " + isCategoria());
        System.out.println(" VITÓRIAS: " + getVitorias() );
        System.out.println(" DERROTAS: " + getDerrotas());
        System.out.println(" EMPATES: " + getEmpates());

        System.out.println(" ----------------------------------------");
    
    }
    
    
    
    public void ganharLuta(){
        
        setVitorias(getVitorias() + 1 );
            

        }
    
    public void perderLuta(){
        
        this.setDerrotas(this.getDerrotas() +1 );
       
    
    }
    
    public void empatarLuta(){
        
        this.setEmpates(this.getEmpates() + 1);
    
    }

        //METODOS ESPECIAIS
    
        //CONSTRUTOR
    

    
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, String categoria,
            int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }


    
    // GETERS
    
    

    public String isNome() {
        return nome;
    }
    
    public String isNacionalidade(){
        return nacionalidade;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public float getPeso(){
        return peso;
    }

    public String isCategoria() {
        return categoria;
    }
    
    
    
    public float getAltura(){
        return altura;
    }
    
    public int getVitorias(){
        return vitorias;
    }
    
    public int getDerrotas(){
        return derrotas;
    }
    
    public int getEmpates(){
        return empates;
    }
    
    //SETTERS

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
        
    }

    private  void setCategoria() {
        
        if (this.peso <  52.2){
            this.categoria = "INVALIDO";
        }
    else 
        if (this.peso <=  70.3){
            this.categoria = "LEVE";
        }
    else
        
        if (this.peso <=  83.9){
            this.categoria = "MÉDIO";
        }
        
    else
        
        if (this.peso <=  120.2){
            this.categoria = "PESADO";
        }
    else
        {this.categoria = "INVALIDO"; } 
        
    }

    
    
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    

}


    

