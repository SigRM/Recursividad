package capaLogica;

/**
 *
 * @author sigrid
 */
public class Recursividad {
    
    
    public static int factorial(int n){//Calcula el factorial de un numero mayor o igual a cero
        if(n==0){
            return 1;
        }else{
            return n* factorial(n-1);
        }
    }
    
    //Algoritmo que calcula x elevado a la y
    public static int potencia(int x, int y){
        if(y==0){
            return 1;
        }else{
            return x*potencia(x,y-1);
        }
    }
    
    //Algoritno recursivo que calcula un numero de la serie finonacci
    public static int fibonaci(int n){
        if(n==1 || n==2){
            return 1;
        }else{
            return fibonaci(n-1)+fibonaci(n-2);
        }
    }
    
    //Algoritmo recursivo que permite sumar los elementos de un vector(arreglo) hasta la posicion n
    public static int suma_arreglo(int []v,int n){
        if(n==0){
            return v[n];
        }else{
            return suma_arreglo(v,n-1)+ v[n];
        }
    }
    
    //Algoritmo recursivo que permite multiplicar hasta el elemnto n de un arreglo
    public static int multiplicar(int []arreglo,int n){
        if(n==0){
            return (arreglo[0]);        
    }else{
            return (arreglo[n]*multiplicar(arreglo,n-1));
        }
    }
    
    //Algoritmo recursivo que permita encontrar el mayor de un arreglo
    public static int mayorArreglo(int []arreglo,int posicion){
        if(posicion ==0){
            return arreglo[0];
        }else{
            return Math.max(arreglo[posicion],mayorArreglo(arreglo, posicion-1));
        }
    }
    
    //***Algoritmo recursivo que permita encontrar el mayor de un arreglo
    public static int mayorArreglo1(int[]arreglo,int posicion){
        if(posicion==0){
            return arreglo[0];
        }else{
            if(arreglo[posicion]>mayorArreglo(arreglo,posicion-1)){
                return arreglo[posicion];
            }else{
                return mayorArreglo(arreglo,posicion-1);
            }
        }
    }
    
    //Algoritmo recursivo que permita encontrar el menor de un arreglo
    public static int menorArreglo(int[]arreglo,int posicion){
        if(posicion ==0){
            return(arreglo[0]);
        }else{
            return Math.min(arreglo[posicion],menorArreglo(arreglo,posicion-1));
        }
    }
    
    //Algoritmo recursivo que permita efectuar una resta como una serie de restas
    public static int resta(int n, int divisor){
        if(divisor>n){
            return 0;
        }else{
            if(divisor==n){
                return 1;
            }else{
                return 1+resta(n-divisor,divisor);//Si el divisor es menor a n
            }
        }
    }
    
    //x*y
    //5*8
    //8+(4*8)
    //8+8+(3*8)
    //8+8+8(2*8)
    //8+8+8+8(1*8)
    //8+8+8+8+8(0*8)
    //8+8+8+8+8+0
    
    public static int multiplicar(int x,int y){
        if(x==0 || y==0){
            return 0;
        }else{
            return y + multiplicar(x-1,y);
        }
    }
    
    public static int sumar(int x,int y){//Para numeros positivos
        if(x==0){
            return y;
        }else{
            if(y==0){
                return x;
            }else{
                return x+ sumar(1,y-1);
            }
        }
    }
    
    public static long invertir(long num,int tamannio){//es el tamannio del numero
        if(num<10){
            return num;
        }else{
            return num%10*(long)Math.pow(10,tamannio-1)+ invertir(num/10,tamannio-1);
        }
    }  
}
