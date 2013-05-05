package PqED;

public class Circulo 
{
        /**
        * Ejemplo: círculos.
        *
        * @author Pablo Recatalá Mollá
        * @version 7/4/2013
        */
          private double centroX;
          private double centroY;
          private double radio;
          
          /**
           * Constructor.
           * @param coordX centro: coordenada X.
           * @param coordY centro: coordenada Y.
           * @param r radio.
           */
          public Circulo(double pCoordX, double pCoordY, double pRadio) 
          {
              this.centroX = pCoordX;
              this.centroY = pCoordY;
              this.radio = pRadio;
          }

          /**
           * devCentroX()
           * @return centro: coordenada X.
           */
          public double devCentroX() 
          {
              return this.centroX;
          }

          /**
           * calcCircunferencia()
           * Calcula y la longitud de la circunferencia (perímetro del círculo).
           * @return longitud de la circunferencia.
           */
          public double calcCircunferencia() 
          {
              return (2 * Math.PI * this.radio);
          }

          /**
           * Desplaza el círculo a otro lugar.
           * @param deltaX movimiento en el eje X.
           * @param deltaY movimiento en el eje Y.
           */
          public void mueve(double deltaX, double deltaY)
          {
              this.centroX = this.centroX + deltaX;
              this.centroY = this.centroY + deltaY;
          }

          /**
           * Escala el círculo (cambia su radio).
           * @param factorEscala factor de escala.
           */
          public void escala(double factorEscala) 
          {
              this.radio = this.radio * factorEscala;
          }
      }

   