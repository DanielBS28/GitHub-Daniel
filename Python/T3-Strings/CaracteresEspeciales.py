#Usaremos el \ 

# mensaje = "Ella dijo "Hola" al entrar" ERROR
mensaje = "Ella dijo \"Hola\" al entrar" #Solucionado, hemos 'escapado' las comillas dobles con el \

salto = "Hola! \nsoy Daniel" #Salto de línea
tabulacion = "Nombre:Daniel"
tabulacion_bien = "Nombre:\tDaniel" #Funcionan cada 4 letras los tabuladores
apostrofe = 'O\'Donell'
# escapar_barra = "\C:\usuarios" ERROR -> no detecta el escape
escapar_barra = "\\C:\\usuarios" #Ahora si, escape la barra con \\

#Cadenas crudas raw String: Una raw string (cadena cruda) es un tipo de texto en programación que trata la barra invertida (\) como un carácter normal y no como una orden especial

#SOLUCIÓN AL PROBLEMA ANTERIOR, se pone r delante
escapar_barra_raw = r"\C:\usuarios"
barra_n = r"Puedo escribir \n y no me hace salto"


print(salto)
print(tabulacion)
print(tabulacion_bien)
print(apostrofe)
print(escapar_barra)
print(escapar_barra_raw)
print(barra_n)