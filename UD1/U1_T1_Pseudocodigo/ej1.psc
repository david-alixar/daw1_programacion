Algoritmo sin_titulo
	
	Escribir "Introduzca las horas trabajadas esta semana"
	sueldo_extra <- 0
	
	Leer horas_semana
	
	
	Si horas_semana < 40 Entonces
		sueldo_base <- horas_semana * 10
		sueldo_semana <- sueldo_base
	Sino 
		para i <- 41 hasta horas_semana Con Paso 1 Hacer
			horas_extra <- horas_extra+1
		FinPara
		sueldo_extra <- horas_extra * 15
		sueldo_base <- 40 * 10
		sueldo_semana <- sueldo_base + sueldo_extra
	FinSi
	
	Escribir "Esta semana le corresponde cobrar: " sueldo_semana
FinAlgoritmo
