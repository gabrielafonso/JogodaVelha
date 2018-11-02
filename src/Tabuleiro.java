
public class Tabuleiro {
	 private int[][] tabuleiro= new int[3][3];
	    
	    public Tabuleiro(){
	        tabuleiroZerado();
	    }
	    
	    public void tabuleiroZerado(){
	        for(int i=0 ; i<3 ; i++)
	            for(int j=0 ; j<3 ; j++)
	                tabuleiro[i][j]=0;
	    }
	    
	    public void exibirTabuleiro(){
	        System.out.println();
	        for(int i=0 ; i<3 ; i++){
	        
	            for(int j=0 ; j<3 ; j++){
	                
	                if(tabuleiro[i][j]==-1){
	                    System.out.print(" X ");
	                }
	                if(tabuleiro[i][j]==1){
	                    System.out.print(" O ");
	                }
	                if(tabuleiro[i][j]==0){
	                    System.out.print("   ");
	                }
	                
	                if(j==0 || j==1)
	                    System.out.print("|");
	            }
	            System.out.println();
	        }
	                
	    }

	    public int getPosicao(int[] tentativa){
	        return tabuleiro[tentativa[0]][tentativa[1]];
	    }
	    
	    public void setPosicao(int[] tentativa, int jogador){
	        if(jogador == 1)
	            tabuleiro[tentativa[0]][tentativa[1]] = -1;
	        else
	            tabuleiro[tentativa[0]][tentativa[1]] = 1;
	        
	        exibirTabuleiro();
	    }

	    public int checarLinhas(){
	        for(int i=0 ; i<3 ; i++){

	            if( (tabuleiro[i][0] + tabuleiro[i][1] + tabuleiro[i][2]) == -3)
	                return -1;
	            if( (tabuleiro[i][0] + tabuleiro[i][1] + tabuleiro[i][2]) == 3)
	                return 1;
	        }
	        
	        return 0;
	                
	    }
	    
	    public int checarColunas(){
	        for(int j=0 ; j<3 ; j++){

	            if( (tabuleiro[0][j] + tabuleiro[1][j] + tabuleiro[2][j]) == -3)
	                return -1;
	            if( (tabuleiro[0][j] + tabuleiro[1][j] + tabuleiro[2][j]) == 3)
	                return 1;
	        }
	        
	        return 0;
	                
	    }
	    
	    public int checarDiagonais(){
	        if( (tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2]) == -3)
	            return -1;
	        if( (tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2]) == 3)
	            return 1;
	        if( (tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0]) == -3)
	            return -1;
	        if( (tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0]) == 3)
	            return 1;
	        
	        return 0;
	    }

	    public boolean tabuleiroCompleto(){
	        for(int i=0 ; i<3 ; i++)
	            for(int j=0 ; j<3 ; j++)
	                if( tabuleiro[i][j]==0 )
	                    return false;
	        return true;
	    }
}
