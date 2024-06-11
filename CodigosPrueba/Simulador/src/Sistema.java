import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Sistema {

    final LocalTime horaInicio;
    final LocalTime horaCierre;
    private int numeroTrabajadores;
    Camion[] camiones;
    int media;

    private final int a = 72561, c = 56822, m = 341157, xn = 50;
    private final LocalTime descanso = LocalTime.of(15,00,00);

    public Sistema(){
        this.horaInicio = LocalTime.of(11, 00,00);
        this.horaCierre = LocalTime.of(19, 30, 00);
        this.media = 13;
        camiones = new Camion[media];
        for(int i=0; i<media;i++){
            camiones[i] = new Camion();
        }
        generadorMixto(a, c, m, xn);
        generadorMulti(a, m, xn);
        calcularTabla();

        showTabla();
    }
    
    //Genera la primera tanda de numeros para las llegadas
    public void generadorMixto(double a, double c, double m, double xn){
        for(Camion t : camiones){
            double resultado = (a*xn+c)%m;
            t.psed1 = Math.round((resultado/m)*100000.0)/100000.0;
            xn = resultado;
        }
    }

    //Genera para los tiempos de servicio
    public void generadorMulti(double a, double m, double xn){
        for(Camion t : camiones){
            double resultado = (a*xn)%m;
            t.psed2 = Math.round((resultado/m)*100000.0)/100000.0;
            xn = resultado;
        }
    }


    public void calcularTabla(){
        for(int i=0; i<camiones.length; i++){
            if(i==0){
                camiones[i].tiempoLlegada = 0;
                camiones[i].horaLlegada = horaInicio;
                camiones[i].horaInicioServicio = horaInicio;
                camiones[i].tiempoEspera = 0;
                camiones[i].tiempoServicio = transformadaInversa2(camiones[i].psed2);
                camiones[i].horaSalida = camiones[i].horaInicioServicio.plusMinutes(camiones[i].tiempoServicio);
                
            }else{
                camiones[i].horaInicioServicio = horaInicio.plusMinutes(transformadaInversa1(camiones[i].psed1));
                camiones[i].tiempoServicio = transformadaInversa2(camiones[i].psed2);
                camiones[i].tiempoLlegada = transformadaInversa1(camiones[i].psed1);
                camiones[i].horaLlegada = camiones[i-1].horaLlegada.plusMinutes(camiones[i].tiempoLlegada);
                       
                if(estaOcupado(camiones[i-1].horaSalida, camiones[i].horaLlegada)){
                    camiones[i].horaInicioServicio = camiones[i-1].horaSalida;
                }else if(camiones[i].horaLlegada.isAfter(descanso) && estaOcupado(camiones[i-1].horaSalida, camiones[i].horaLlegada)){
                    camiones[i].horaInicioServicio = camiones[i-1].horaSalida.plusMinutes(30);
                }else if(camiones[i].horaLlegada.isAfter(descanso)){
                    camiones[i].horaInicioServicio = camiones[i].horaLlegada.plusMinutes(30);
                }else{
                    camiones[i].horaInicioServicio = camiones[i].horaLlegada;
                }
                camiones[i].horaSalida = camiones[i].horaInicioServicio.plusMinutes(camiones[i].tiempoServicio);
                camiones[i].tiempoEspera = camiones[i].horaLlegada.until(camiones[i].horaInicioServicio, ChronoUnit.MINUTES);
                camiones[i].osioObservado = camiones[i-1].horaSalida.until(camiones[i].horaInicioServicio, ChronoUnit.MINUTES);

                if(estaOcupado(camiones[i-1].horaSalida, camiones[i].horaLlegada)){
                    camiones[i].colaEspera+=1;
                }
            }
            
        }
    }

    public boolean estaOcupado(LocalTime salida1, LocalTime entrada2){
        return entrada2.isBefore(salida1);
    }

    public void showTabla(){
        // pseudo1, tiempo llegada, hora llegada, inicio servicio, pseudo2, tiempo servicio, hora salida, osio 
        //System.out.println("p1   llegada(t)    llegada(h)    servicio(i)    p1    servicio(t)    servicio(s)    servicio(s)    espera    osio    cola");
        for(Camion i: camiones){
            System.out.println(i.psed1+"   "+i.tiempoLlegada+"   "+i.horaLlegada+"   "+i.horaInicioServicio+"   "+i.psed2+"   "+i.tiempoServicio+"   "+i.horaSalida+"   "+i.tiempoEspera+"   "+i.osioObservado+"   "+i.colaEspera);
        }
    }

     //Tempos de llegada
     public int transformadaInversa1(double numero1){
        int x = 0;
        
        if(numero1 >= 0 && numero1 < 0.02){
            x = 20;
        }else if(numero1 >= 0.02 && numero1 < 0.10){
            x = 25;
        }else if(numero1 >= 0.10 && numero1 < 0.22){
            x = 30;
        }else if(numero1 >= 0.22 && numero1 < 0.47){
            x = 35;
        }else if(numero1 >= 0.47 && numero1 < 0.67){
            x = 40;
        }else if(numero1 >= 0.67 && numero1 < 0.82){
            x = 45;
        }else if(numero1 >= 0.82 && numero1 < 0.92){
            x = 50;
        }else if(numero1 >= 0.92 && numero1 < 0.97){
            x = 55;
        }else if(numero1 >= 0.97 && numero1 < 1){
            x = 60;
        }

        return x;
    
    }

    //Tiempos de servicio
    public int transformadaInversa2(double numero){
        int y = 0;

        if(numero >= 0 && numero < 0.05){
            y = 20;
        }else if(numero >= 0.05 && numero < 0.15){
            y = 25;
        }else if(numero >= 0.15 && numero < 0.35){
            y = 30;
        }else if(numero >= 0.35 && numero < 0.60){
            y = 35;
        }else if(numero >= 0.60 && numero < 0.72){
            y = 40;
        }else if(numero >= 0.72 && numero < 0.82){
            y = 45;
        }else if(numero >= 0.82 && numero < 0.90){
            y = 50;
        }else if(numero >= 0.90 && numero < 0.96){
            y = 55;
        }else if(numero >= 0.96 && numero < 1){
            y = 60;
        }

        return y;

    }


    public int cuatroPersona(double numero){
        int y = 0;

        if(numero >= 0 && numero < 0.05){
            y = 20;
        }else if(numero >= 0.05 && numero < 0.15){
            y = 25;
        }else if(numero >= 0.15 && numero < 0.35){
            y = 30;
        }else if(numero >= 0.35 && numero < 0.60){
            y = 35;
        }else if(numero >= 0.60 && numero < 0.72){
            y = 40;
        }else if(numero >= 0.72 && numero < 0.82){
            y = 45;
        }else if(numero >= 0.82 && numero < 0.90){
            y = 50;
        }else if(numero >= 0.90 && numero < 0.96){
            y = 55;
        }else if(numero >= 0.96 && numero < 1){
            y = 60;
        }

        return y;

    }


    public int revision(double n, int chambeadores){
        int retorno=0;
        switch(chambeadores){
            case 3:
            retorno = transformadaInversa2(n);
            break;
            case 5:

            case 7:
        }
    return retorno;
    }

    






    
}
