package film;

import java.util.ArrayList;
import java.util.List;

import factory.Element;
import factory.ElementFactory;

public class Page {
	
	private char page[][];
	private List<Element> elements = new ArrayList<Element>();
	private static AbstractFactory elementFactory = new ElementFactory();
	private int numeroElementCourant;
	
	public void ajouterUnElement(String nomElement) {
		/**	TODO:ajouterUnElement  */
	}
	public void changerElementCourant(int element){
		/**	TODO:changerElementCourant  */
	}
	public void bougerElementCourant(){
		/**	TODO:bougerElementCourant  */
	}
	public void changerPositionElement(int element, int position){
		/**	TODO:changerPositionElement  */
	}
	public void bougerElement(int element){
		/**	TODO:bougerElement  */
	}
	public void supprimerUnElement(int element) {
		/**	TODO:supprimerUnElement  */
	}
	
}
