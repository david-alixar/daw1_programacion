Algoritmo usuario_y_contrasena
	
		Definir codigo_usuario como entero
		Definir contraseña Como Entero
		Escribir "Introduzca un código de usuario con valor numérico"
		Leer codigo_usuario
		
		Mientras codigo_usuario <> 1 Hacer
			Escribir "Código de usuario no válido, introduzca otro"
			Leer codigo_usuario
		FinMientras
		
		Escribir "Introduzca contraseña"
		Leer contraseña
		
		Mientras contraseña <> 1234 Hacer
			Escribir "contraseña no válida, introduzca otra"
			Leer contraseña
		FinMientras
		
		Escribir "bienvenido"
		
FinAlgoritmo

