Algoritmo dias_de_la_semana
	Definir dia_de_la_semana Como entero
	Escribir "Introduzca un n�mero del 1 al 7"
	Leer dia_de_la_semana
	
	Mientras dia_de_la_semana <>1 y dia_de_la_semana <> 2 y dia_de_la_semana <> 3 y dia_de_la_semana <> 4 y dia_de_la_semana <> 5 y dia_de_la_semana <> 6 y dia_de_la_semana <>7 Hacer
		
		Escribir "El n�mero debe ser entre el 1 y el 7"
		Leer dia_de_la_semana
		
	FinMientras	
	
	Segun dia_de_la_semana 
		1: Escribir "El d�a de la semana es: Lunes"
		2: Escribir "El d�a de la semana es: Martes"
		3: Escribir "El d�a de la semana es: Mi�rcoles"
		4: Escribir "El d�a de la semana es: Jueves"
		5: Escribir "El d�a de la semana es: Viernes"
		6: Escribir "El d�a de la semana es: S�bado"
		7: Escribir "El d�a de la semana es: Domingo"	
		De Otro Modo:
			Escribir "Error, el n�mero debe ser entre el 1 y el 7"
	Fin Segun
		
	
	
FinAlgoritmo
