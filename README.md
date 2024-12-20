# prefinalSeguros
Prefinal de programación orientada a objetos.
CONSIGNA:
Defina las clases para implementar una solución orientada a objetos para el siguiente problema e implemente en Java.
Una aseguradora provee distintos tipos de seguros dentro de su cartera, entre los mismos se encuentran:
Seguro Automotor, en el cual se cuenta con un número de póliza
y una descripción (por ejemplo “automotor todo riesgo”, el monto
asegurado, el DNI del asegurado
● Seguro de Vida, donde se registra el DNI del asegurado, el
número de la póliza, su descripción y el monto asegurado de la póliza.
● Seguro Decremental, el número de la póliza, el monto asegurado
original, el DNI del asegurado, una descripción, y un año de inicio. El monto de este seguro se calcula como el monto original dividido
la diferencia en años entre la fecha inicio y la fecha actual. Por ejemplo si arranco en 2018 con $3000 de monto asegurado y en el
2020 preguntamos el monto del seguro este es 3000/2 = $1500
● Seguro Integrador, en el cual se guarda un cliente (solo el DNI) y
los seguros con los que cuenta (Automotor, Vida, Integrador, y cualquier otro tipo de seguro que ofrezcao pueda ofrecer la compañía). 
El monto asegurado de un seguro integrador se calcula como la suma de todos los montos de los seguros que contiene. 
El número de póliza de un seguro integrador queda determinado por el mayor número de póliza de los seguros que contiene.
● Seguro Transitorio, Está pensado para un seguro que tiene una fecha de inicio y fin, puede ser de
cualquier tipo de seguro existente. El número de póliza es el mismo que la póliza del seguro contenido,
lo mismo para el dni del asegurado. El monto asegurado es el monto del seguro contenido siempre y
cuando la fecha actual esté dentro del periodo de validez. En otro caso, el monto asegurado es 0.

La Aseguradora posee diferentes formas de calcular el costo de la póliza. Por ejemplo hay seguros
Automotores que se calculan como un valor fijo y otros que son un porcentaje del monto asegurado. En el
caso del Seguro Vida se calcula como un valor fijo más un porcentaje del monto asegurado. Sin embargo, la
forma de calcular el costo del seguro puede cambiar en cualquier momento, e incluso se pueden incorporar
nuevas formas de calcular el costo. Para el caso de seguro integrador es la suma de los costos de los
seguros contenidos, en el seguro temporal el costo es el costo del seguro contenido siempre y cuando la
fecha actual esté dentro de la vigencia del seguro

Se desea brindar listados en los cuales se incluyan todos los seguros que posee la compañía que cumplan
con determinado criterio. A continuación se listan algunos ejemplos.
a) Listar todos los seguros cuya descripción contenga la palabra “Automotor”,
b) Listar todos los seguros cuya descripción sea exactamente igual a “Hogar” y el monto asegurado sea superior a $250.000
c) Listar todos los seguros donde haya un DNI igual a 24.134.323.
d) Se pueden agregar nuevos tipos de búsquedas así como también combinaciones lógicas de las mismas.

NOTA: en el caso de seguro integrador el resultado de la búsqueda incluye cualquier seguro que posea y
cumple con la búsqueda (no se incluyen seguros integradores en los resultados). En el caso del seguro
transitorio, solo se incluye como resultado de la búsqueda los elementos por él contenidos y que cumplen
con la búsqueda siempre y cuando esté vigente (no se incluyen seguros transitorios).
