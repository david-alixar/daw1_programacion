Algoritmo reloj

	Definir altura,x,i,j como entero
	

	cont<-"*"

	Escribir "ingrese altura:"
	Leer altura;

	Mientras altura < 3 o altura Es Par
		Escribir "El número debe ser mayor que 3 e impar"
		Leer altura
	FinMientras
	
	Para x<-1 Hasta altura Con Paso 1 Hacer
		
		Escribir cont
		cont<-cont+"*"
		
	FinPara
	
	Para i<- altura Hasta 1 Con Paso -1 Hacer
		cont<- ""
		altura<-altura-1
		
		Para j<-altura Hasta 1 Con Paso -1 Hacer
			
			cont<- cont+"*"
		FinPara
		
		Escribir cont
		
	FinPara
	
	
	
	Para i<- altura Hasta 1 Con Paso -1 Hacer
		cont<- ""
		altura<-altura-1
		
	FinPara
	
		
		Escribir cont
	
	Para x<-1 Hasta altura Con Paso 1 Hacer
		
		Escribir cont
		cont<-cont+"*"
		
	FinPara
	Para j<-altura Hasta 1 Con Paso -1 Hacer
		
		cont<- cont+"*"
	FinPara

		

	
FinAlgoritmo
