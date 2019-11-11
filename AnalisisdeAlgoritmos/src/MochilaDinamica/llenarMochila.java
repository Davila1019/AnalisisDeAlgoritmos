package MochilaDinamica;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ismael Cortes
 */
public class llenarMochila {
    
    	public void llenarMochila(Mochila m_base, ObjetoMochila[] elementos, boolean llena, Mochila m_opt) {
	      //si esta llena
	      if (llena) {
	          //compruebo si tiene mas beneficio que otra
	          if (m_base.getBeneficio() >= m_opt.getBeneficio()) {	 
	              ObjetoMochila[] elementosMochBase = m_base.getElementos();
	              m_opt.clear();
	              //metemos los elementos
	              for (ObjetoMochila e : elementosMochBase) {
	                  if (e != null) {
	                      m_opt.aniadirElemento(e);
	                  }
	              }	 
	          }	 
	      } else {
	    	  //if la suma de todos los pesos es menor o igual al peso maximo, se debe retornar todos los elementos else hacer el calculo
	    	  int sumaTodos = 0;
	    	  for(int i = 0; i < elementos.length; i++) {
	    		  sumaTodos+=elementos[i].getBeneficio();
	    	  }
	    	  if(sumaTodos<=m_base.getPesoMaximo()) {
	    		  for (int i = 0; i < elementos.length; i++) {
		        	  m_base.aniadirElemento(elementos[i]); //añadimos
                  }
	    		  //llenarMochila(m_base, elementos, true, m_opt);		          
	    	  }else {
	    		  //Recorre los elementos
		    	  for (int i = 0; i < elementos.length; i++) {
		        	  //si existe el elemento
		              if (!m_base.existeElemento(elementos[i])) {
		            	  //Si el peso de la mochila se supera, indicamos que esta llena
		                  if (m_base.getPesoMaximo() >= m_base.getPeso() + elementos[i].getPeso()) {
		                	  m_base.aniadirElemento(elementos[i]); //añadimos
		                      llenarMochila(m_base, elementos, false, m_opt);
		                      m_base.eliminarElemento(elementos[i]); // lo eliminamos
		                  }else {
		                      llenarMochila(m_base, elementos, true, m_opt);
		                  }
		 
		              }
		 
		          }
	    	  }
	      }
	 
	  }
}
