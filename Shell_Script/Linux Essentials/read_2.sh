# PARTE 2 #

echo Introduzca su nombre: #Esto realiza un salto de línea y nos pide la información, para solucionar esto podemos poner un echo -n
read nombre apellido apellido2
echo Usted se llama $nombre $apellido $apellido2

# Otra solución para el salto de línea es usar directamente read -p y el texto entre comillas, lo siguiente serán las variables

read -p "Introduza su nombre: " nom ap1 ap2
echo Usted se llama $nom $ap1 $ap2

