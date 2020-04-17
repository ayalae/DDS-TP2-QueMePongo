# DDS-TP2-QueMePongo

##Pseudocodigo

    Clase Prenda{
    TipoDePrenda tipo
    Categoria categoria
    TipoDeMaterial material 
    Color colorPrincipal
    Color colorSecundario
    

    Prenda(TipoDePrenda type, Categoria category, TipoDeMaterial tela, Color colorPr, Color colorSec){

      tipo=type
       if tipo==NULL
          lanzar excepcion("No ha especificado el tipo de la Prenda")

       categoria=category
       if categoria==NULL
          lanzar excepcion("No ha especificado la categoria de la prenda")
       if categoria!=tipo.categoria()
          lanzar excepcion("La categoria ingresada no se condige con su tipo") 

       material=tela
       if material==NULL
           lanzar excepcion("No ha especificado el material de la prenda")

       colorPrincipal=colorPr
       if colorPrincipal==NULL
          lanzar excepcion("No ha especificado el color principal de la prenda")

       colorSecundario=colorSec
    }
    }

    enum TipoDePrenda{
    ZAPATO(CALZADO),CAMISA(PARTESUP),PANTALON(PARTEINF),LENTES(ACCESORIO)

    Categoria = categoria

	}

    }
    enum Categoria{
    PARTESUP,PARTEINF,CALZADO,ACCESORIO
    }
    enum TipoDeMaterial{
    CUERO,JEAN
    }
    enum Color{
    BLANCO,NEGRO,ROJO,VERDE
    }
