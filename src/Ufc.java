public class Ufc {
    public static void main(String[] args) throws Exception {


        // poderia fazer de um a um como abaixo
        
    //lutador l1  = new lutador("Mano", "Brasileiro", 29 , 1.68f, 67.4f , 11, 4, 2 );
    //lutador l2  = new lutador("Rafa", "frances", 29 , 1.68f, 67.4f , 11, 4, 2 );

    //l1.apresentarLutador();
    
    //mas vamos criar um vetor com algumas posições conforme a quantidade de lutadores
    
       Lutador l[] = new Lutador[6];
            
        l[0]= new Lutador(" MANOOO ", " BRAZIL ", 29 , 1.68f, 67.4f , null, 11, 4, 2 );
        l[1]= new Lutador(" RAFAAAAA ", " EUA ", 25 , 1.76f, 89.4f , null, 8, 2, 3 );
        l[2]= new Lutador(" ALDOOO ", " CANADA ", 40 , 1.71f, 105.3f , null, 7, 4, 1 );
        l[3]= new Lutador(" JUANNN ", " FRANÇA ", 32 , 1.55f, 90.1f , null, 12, 6, 4 );
        l[4]= new Lutador(" RINOOO ", " JAPÃO ", 21 , 1.65f, 59.8f , null, 9, 2, 2 );
        l[5]= new Lutador(" MEEEN ", " ARGENTINA ", 28 , 1.74f, 92.4f , null, 11, 5, 3 );
        
       Luta UFC01 = new Luta();
       UFC01.marcarLuta(l[3],l[5]);
       UFC01.lutar();
       
    }
}


         
            


  
