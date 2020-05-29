package model;

	public enum Tipo {

	    CAMISA(Categoria.PARTE_SUP),

	    REMERA(Categoria.PARTE_SUP),

	    PANTALON(Categoria.PARTE_INF),
	    
	    ZAPATILLA(Categoria.CALZADO),
	    
	    GORRA(Categoria.ACCESORIO);


	    private Categoria categoria;

	    Tipo(Categoria categoria) {
	        this.categoria = categoria;
	    }

	    public Categoria getCategoria() {
	        return categoria;
	    }
	}
