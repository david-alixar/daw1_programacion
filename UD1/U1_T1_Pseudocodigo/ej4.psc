Algoritmo sin_titulo
	Dimension dim[20]
	Definir dim Como Entero
	
	Para i<- 1 Hasta 20 Con Paso 1 Hacer
		dim[i] <- azar (401)
		Escribir dim[i]
	FinPara
	Escribir "Introduzca 1 para ver los m�ltiplos de 5 y 2 para los de 7"
	
	Leer n	
	
		
	Si n = 1 Entonces
		Para i<- 1 Hasta 20 Con Paso 1 Hacer
			si (dim[i] MOD 5) =0 
				multiplos<- dim[1]
				Escribir "Los siguienes n�meros son m�ltiplos de 5 " dim[i]
			FinSi
		FinPara
	FinSi
	
	Si n = 2 Entonces
		Para i<- 1 Hasta 20 Con Paso 1 Hacer
			si (dim[i] MOD 7) =0 
				multiplos<- dim[1]
				Escribir "Los siguienes n�meros son m�ltiplos de 7 " dim[i]
			FinSi
		FinPara
	FinSi
	
	Si n <> 1 o n <> 2 Entonces
		Escribir "Tiene que introducir 1 � 2 para ver m�ltiplos, el programa se cerrar�"
	FinSi
FinAlgoritmo

	
	

