#Podemos generar una subcadena nueva a través de una cadena

nombre_archivo = "archivo.pdf"
fecha = "27-09-2026"

fecha_cortada_año = fecha[6:10] #El primer número es el inicio del corte de la cadena, el segundo hasta donde corto pero sin incluir, es decir si pusiera fecha[6:9] saldría 202 faltaría el 6 ya que no se incluye, si me pasará del rango permitido no da error, se coge toda la cadena desde el inicio que puse hasta el final.

print(fecha_cortada_año)

#Puedo añadir un tercer parametro que es el paso, que son los saltos que soy entre caracteres
fecha_cortada_año2 = fecha[0:10:2]
print(fecha_cortada_año2) #En este caso "27-09-2026" saldría -> 2-922 ya que los saltos al cortar son de dos en dos.

print(fecha[2:]) #Desde el caracter 2 hasta el final 
print(fecha[:5]) #Desde el caracter 0 (implicito) hasta 5 

#También se puede poner indices negativos
#Ejemplo: la palabra PYTHON en vez de empezar por el indice 0, ahora los indices son -6-5-4-3-2-1, basicamente sirve para empezar al reves.
palabra = "PYTHON" #-6P -5Y -4T 3-H -2O -1N
print(palabra[-1])
print(palabra[-4:]) #Esto sería desde el indice -4 (incluido) hasta el final de la cadena

print(palabra[::-1]) #Esto le da la vuelta a la string, [::paso] al poner el -1 empieza dando saltos desde el menos 1 hasta el principio (sentido negativo), el salto podría poner el que quiera. Al dejar el inicio y el fin vacíos, le estás diciendo: "Toma todo el texto desde el principio hasta el final, pero recórrelo hacia atrás".

print(palabra[::1]) #El salto es de 1 en uno, se imprime dando saltos de 1 en 1.

print(palabra[::2]) #El salto es de 2 en 2, empezando desde el 0 positivo

