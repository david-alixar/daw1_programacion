Algoritmo Suma_dos_numeros_al_azar
	Definir num1 como entero 
	Definir num2 Como Entero
	num1 <- azar (100)
	num2 <- azar (100)
	Escribir "Sume los valores siguientes:" " " num1 " y " num2
	Definir resultado Como Entero
	Leer resultado
	
	Mientras resultado <> num1+num2 Hacer
		Escribir "El reultado es erróneo, inténtelo de nuevo:" " " num1 " + " num2 " es = "
		Leer resultado
	FinMientras
	
	Escribir "Enhorabuena! El resultado es correcto"
	
FinAlgoritmo

