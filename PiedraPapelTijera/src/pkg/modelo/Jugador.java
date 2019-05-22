package pkg.modelo;


	/**
	 *
	 */
public class Jugador{
	   
	    private int exitos;      // número de partidas ganadas
	    
	    /**
	     * Escoge piedra, papel o tijera al azar
	     */
	    public String opcionAlAzar()
	    {
	        String opcion = "";
	        Integer aleatorio = (int)(Math.random()*3);
	        switch(aleatorio) {
	            case 0:
	            	opcion = "piedra";
	                break;
	            case 1:
	            	opcion = "papel";
	                break;
	            default:
	            	opcion = "tijeras";
	        }
	        return opcion;
	    }
	    
	    public void setExitos() 
	    {
	        exitos++;
	    }
	    
	    public int getExitos() 
	    {
	        return exitos;
	    }
	    
		public int setExitos(int exitos) {
			this.exitos = exitos;
			return exitos;
		}
	    

	}

