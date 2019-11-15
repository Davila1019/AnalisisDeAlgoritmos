#include <stdio.h>
#include <string.h>

int buscar_patron(char *cad, char *pat);

int main() {
	int n = 0;
	char *cadena = "bbbbaacdbbb";
	char *patron = "bbb";
	printf("Cadena ingresada: %s \nPatron ingresado: %s\n", cadena , patron);
	n = buscar_patron(cadena, patron);
	if(n != 0){
		printf("\nSe encontro el patron %d veces",n);
	}
	else{
		printf("No se encontro la cadena");
	}
}


int buscar_patron(char *cad, char *pat){
	int longitud1 = strlen(cad);
	int longitud2 = strlen(pat);
	int i, j;
	char c;
	if(longitud2 > longitud1)
	{
		printf("El patron es mas grande que la cadena");
		return 0;
	}else{
		i=0;
		
		j=0;
		c=pat[0];
		while(i < longitud1){
			/*Si el primer elemento del patron es iguan al elemento de la cadena en la posicion i,
			se puede avanzar y comparar los demas elementos, 
			si no, no se comparan y avanza hasta encontrarse de nuevo con el caso.
			*/ 
			if(cad[i] == c){
				if( strncmp( &cad[i], pat, longitud2 ) == 0 ){
					j++;
				}	
			}
		i++;
		}
	return j;
	}
}
