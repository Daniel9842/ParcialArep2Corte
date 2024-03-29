#  Parcial 2do Tercio -Ejercicios de Diseño
### Daniel Santiago Ducuara Ardila
### 13/10/2021

Diseñé, construya y despliegue los siguientes servicios en un microcontenedor docker desplegado en una instancei a EC2 de AWS. Cada estudiante debe seleccionar para desarrollar dos funciones matemáticas de acuerdo a los dos últimos dígitos de su cédula como se especifica en la lista. Todas las funciones reciben un solo parámetro de tipo "Double" y retornan una prámetro sde tipo "Double".

0. log
1. ln
2. sin
3. cos
4. tan
5. acos
6. asin
7. atan
8. sqrt
9. exp (el número de eauler elevado ala potendia del parámetro)


Implemente los servicios para responder al método de solicitud HTTP GET. Deben usar el nombre de la función especificado en la lista y el parámetro debe ser pasado en la variable de query con nombre "value".


Ejemplo de una llamado:

https://amazonxxx.x.xxx.x.xxx:{port}/cos?value=3.141592


Salida. El formato de la salida y la respuesta debe ser un JSON con el siguiente formato

{

 "operation": "cos",

 "input":  3.141592,

 "output":  -0.999999

}


Entregable:

1. Proyecto actualizado en github. Incluya instrucciones de cómo clonarlo, compilarlo, y deplegarlo.
2. Descripción del proyecto enel README con pantalazos que muestren el funcionamiento.
3. Descripción de como correrlo en EC2
4. Video de menos de un minuto del funcionamiento (lo puede tomar con el celular una vez funcione)


## Para clonar este repositorio
```
git clone https://github.com/Daniel9842/ParcialArep2Corte
```
## Para compilar el proyecto
```
mvn package
```
## Para ejecutar localmente el proyecto
```
java -cp "target/classes;target/dependency/*" edu.escuelaing.arep.parcial.App
```
Luego en el navegador colocar lo siguiente, en el valor de value puede colocar el valor que desee.
```
http://localhost:4567/log?value=2
```
![function log](images/log.PNG "Log function")<br>
```
http://localhost:4567/exp?value=10
```
![function exp](images/exp.PNG "Exp function")<br>


## Video EC2

[EC2 ](https://github.com/Daniel9842/ParcialArep2Corte/blob/master/EC2%20video%20parcial.mp4)

## Licensia

[Licensia ](https://github.com/Daniel9842/ParcialArep2Corte/blob/master/LICENSE.txt)

## EC2 

Acceda la máquina virtual en AWS y coloque los siguiente comandos:
1.Actualiza la máquina
```
sudo yum update -y
```
2.Instalar Docker
```
sudo yum install docker
```
3.Inicie el servicio docker
```
sudo service docker start
```
4.A partir de la imagen creada en Dockerhub cree una instancia de un contenedor docker
```
docker run -d -p 42000:6000 --name firstdockerimageaws (nombredelrepositorio en Docker)
```
5.Verifique que puede acceder
