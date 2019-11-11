package MochilaDinamica;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class TestMochila{
	 //llenarMochila llm= new llenarMochila();
	public static void main(String[] args) {
        llenarMochila llm = new llenarMochila();
        ObjetoMochila[] elementos = {
            new ObjetoMochila(100,100),
            new ObjetoMochila(50,50),
            new ObjetoMochila(20,20),
            new ObjetoMochila(100,100),
            new ObjetoMochila(200,200),
            new ObjetoMochila(200,200),
            new ObjetoMochila(200,200),
        };
 
        Mochila m_base = new Mochila(10000, elementos.length);
        Mochila m_opt = new Mochila(10000, elementos.length);
 
        llm.llenarMochila(m_base, elementos, false, m_opt);
 
        System.out.println(m_opt);
        
    }

	
}