package ende;


	/**
	 *
	 */
public class Jugador{
	   
	    private int exitos;      // número de partidas ganadas
	    private int winTotal;
	    
	    /**
	     * Escoge piedra, papel o tijera al azar
	     */
	    public String opcionAlAzar()
	    {
	        String opcion = "";
	        Integer aleatorio = (int)(Math.random()*3);
	        switch(aleatorio) {
	            case 0:
	            	opcion = ("piedra");
	                break;
	            case 1:
	            	opcion = ("papel");
	                break;
	            case 2:
	            	opcion = ("tijeras");
	        }
	        return opcion;
	    }
	    public void setExitos() 
	    {
	        exitos++;
	    }
	    public int getExitos() 
	    {
	        return(exitos);
	    }
	    

	}

