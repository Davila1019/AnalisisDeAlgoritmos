#include <stdio.h>
#include<string.h>
#define d 256

int busqueda(char cad[], char pat[], int valorHash);

int main(){
    int q;
    char cadena[40]="bababaabbabbbabad";
	char patron[40]="ca";
	int total = busqueda(cadena,patron,1);
	if(total != 0){
		printf("Cadena: %s\nPatron: %s\nEl patron se econtro %d veces",cadena,patron,total );
	}else{
		printf("Cadena: %s\nPatron: %s\nEl patron no se encontro :(",cadena,patron );
	}
    return 0;
}


int busqueda(char cad[], char pat[], int valorHash){

	int longitud1= strlen(pat);
	int longitud2= strlen(cad);
	int i, j, patron=0, cadena=0, hash=1, contador=0; 
	for(i=0; i<longitud1-1; i++){
    	patron=((d*patron + pat[i])%valorHash);
  	  	cadena=((d*cadena + cad[i])%valorHash);
	}
	for(i=0; i<= longitud2-longitud1; i++){
   		if(patron==cadena){
        	for(j=0; j<longitud1; j++){
            	if(cad[i+j]!=pat[j])
            		break;
			}
      		if(j==longitud1){
        		contador++;
      		}else{
      			contador=contador;
			  }
   		}
        else if(i<longitud2-longitud1){
        	cadena=(d*(cadena-cad[i]*hash)+cad[i+longitud2])%valorHash;
           	if (cadena<0)
            cadena=(cadena+valorHash);
     	}
	}
	return contador;
}

