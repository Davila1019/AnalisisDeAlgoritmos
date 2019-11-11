/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaballoAvido;

/**
 *
 * @author Davila
 */

import java.util.Random;

public class Caballo {  
    private int n1 = 2, n2= 2, tam = 8, cont = 1;  
    int fallos=0;
    
    public Caballo(){
    
    }
    
    public Caballo(int n1,int n2, int tam){
        this.n1=n1;
        this.n2=n2;
        this.tam=tam;  
    } 

    public void Solucionar(){ 
        Random aleatorio = new Random();
        int Tablero[][] = new int[tam + 1][tam +1];
        Tablero[1][1] = 1;
        int pos1, pos2, cas=tam;
        while ( cont < cas ){
            fallos++;
            cont = 1;
            int ciclo = 0;
            for ( int s = 0; s <= tam; s++ ){   
                for ( int t = 0; t <= tam; t++ )
                    Tablero[s][t] = 0;
            }  
        
        Tablero[1][1] = 1;

        while ( 1000 != ciclo){
            ciclo++;
            pos1 = 1 + aleatorio.nextInt(tam);
            pos2 = 1 + aleatorio.nextInt(tam);
            if ( Math.abs(Math.abs(n1) - Math.abs(pos1)) == 2){ 
                if ( Math.abs(Math.abs(n2) - Math.abs(pos2)) == 1  )
                    if ( 0 == Tablero[pos1][pos2]){  
                        Tablero[pos1][pos2] = ++cont;   
                        n1 = pos1;
                        n2 = pos2;
                        ciclo = 0;
                    }  
            }  
            if ( Math.abs(Math.abs(n1) - Math.abs(pos1)) == 1){
                if ( Math.abs(Math.abs(n2) - Math.abs(pos2)) == 2  )
                    if ( 0 == Tablero[pos1][pos2] ){  
                        Tablero[pos1][pos2] = ++cont;
                        n1 = pos1;
                        n2 = pos2;
                        ciclo = 0;
                    }  
            }  
        } 
    }   
        System.out.printf("Terminado: Se recorrieron %d casillas.\n", cont);
        System.out.printf("\nSe intentaron %d caminos antes de obtener el requerido.\n", fallos);
        Mostrar(Tablero);
    }   
 
    public void Mostrar(int B[][]){   
        for ( int k = 1; k <= tam; k++ ){
            for ( int j = 1; j <= tam; j++){
                System.out.printf("%5d", B[k][j]);
            } 
            System.out.println("\n");
        }
    }  

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
    
}
