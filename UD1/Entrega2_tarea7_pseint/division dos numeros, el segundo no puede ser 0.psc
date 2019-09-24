Algoritmo Dvision_dos_numeros_segundo_no_puede_ser_0
	Definir num1 Como Entero
	Definir num2 Como Entero
	Escribir "Introduzca dos números para que se dividan, el segundo no puede ser 0"
	Leer num1
	Leer num2
	
	Mientras num2 = 0 Hacer
		
		Escribir "El segundo número no puede ser 0, introduzca uno válido"
		Leer num2
		
	FinMientras
	
	Escribir "El resultado de la división es:" " " num1 / num2
	
FinAlgoritmo
