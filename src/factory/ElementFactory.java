package factory;

import element.*;
import film.AbstractFactory;

public class ElementFactory extends AbstractFactory {

	@Override
	public Element geElement(String element) {
      if(element.equalsIgnoreCase("CARRE")){
          return new Carre();
          
       }else if(element.equalsIgnoreCase("LIGNE")){
          return new Ligne();
          
       }else if(element.equalsIgnoreCase("POINT")){
          return new Point();
       }
		return null;
	}

}
