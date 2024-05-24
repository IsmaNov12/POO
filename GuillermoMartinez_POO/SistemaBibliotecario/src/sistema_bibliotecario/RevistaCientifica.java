package sistema_bibliotecario;

public class RevistaCientifica extends Material {
	
     private String areaCientifica;

	 public RevistaCientifica(int codigo, String autor, String titulo, int anio, String estado, String areaCientifica) {
	     super(codigo, autor, titulo, anio, estado);
	     this.areaCientifica = areaCientifica;
	    }

	  public String getAreaCientifica() { return areaCientifica; }
	  public void setAreaCientifica(String areaCientifica) { this.areaCientifica = areaCientifica; }

	@Override
	public String toString() {
		return "Revista Cientifica, \nArea Cientifica = " + areaCientifica + super.toString();
	}
  
	}


