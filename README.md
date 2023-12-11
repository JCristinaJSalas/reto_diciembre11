# Reto Dic 11 2023



## Punto 1 

El primer punto se basa en dar un numero (N), y se evalua si los numeros comprendidos entre 0 y el numero en si, son multiplos de  3 y 5. Ademas, se tiene en cuenta al momento de tener un numero multiplo de ambos.

````
    public static void main(String[] args) {
        int num = 20;
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                continue;
            }
            else if(i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }
        System.out.println("Total=  " + sum);
    }
````



## Punto 2

Para este punto, dada una contraseña se valida las siguientes opciones.

Tener longitud de 8, contener 1 mayuscula y 1 minuscula, ademas de 1 numero, y dejar agregar caracteres especiales como : !,@,#,$,%,^,&,*. Para este ejercicio decidi usar el peso de las letras para validar cada requisito.

````
    public static void main(String[] args) {
        String contrasena = "dsrg!hb4gRE";
        boolean isValidMay = false;
        boolean isValidMin = false;
        boolean isValidNum = false;
        boolean isValidCaracter = false;

        if (contrasena.length() >= 8) {
            char[] desglose = contrasena.toCharArray();
            for (char d : desglose) {
                int var1 = d;
                
                if( var1 >= 65 && var1 <=90){
                    isValidMay = true;
                }
                else if(var1 >= 97 && var1 <= 122){
                    isValidMin = true;
                }
                else if(var1 >= 48 && var1 <= 57){
                    isValidNum = true;
                }
                else if(var1 ==33 || var1 == 64 ||var1 ==35 || var1 == 36 ||var1 ==37 || var1 == 94 ||var1 ==38 || var1 == 42){
                    isValidCaracter = true;
                }
                }
            }
       
        if(isValidMin == true && isValidMay == true && isValidNum == true && isValidCaracter == true){
            
            System.out.println("Contrasena Correcta");
        }else{
            System.out.println("Contrasena Incorrecta, revisa si cumples con los requisitos");
              
        }
    }

````







## Punto3

 





## Punto4

A)  Con respecto al funcionamiento del punto 4, se logra observar que el resultado es mostrar en pantalla los 10 primero numeros, empezando desde 0 e incrementando en doble en cada ciclo.



B) El siguiente codigo es una posible solucion e interpretacion en codigo .java.

````
    public static void main(String[] args) {
        int a =0 ,b=1;
        for (int i=0; i<10; i++){
            System.out.print(a + " ");
            a =b;
            b=a+b;
            
        }
        System.out.println("");
    }
````

