package film;

import java.util.ArrayList;
import java.util.List;

public class Film {
	private List<Page> test = new ArrayList<Page>() ;
	private String titre;
	private String createur;
	private int tailleXPage;
	private int tailleYPage;
	private int numeroDePageCourante;
	
	public Film(String titre,String createur,int tailleXPage, int tailleYPage){
		this.titre = titre;
		this.createur = createur;
		this.tailleXPage = tailleXPage;
		this.tailleYPage = tailleYPage;
		this.test.add(new Page());
		this.numeroDePageCourante = 0;
	}
	public void nouvellePage(){
		/** TODO:nouvellePage */
		this.test.add(new Page());
		this.changerDePage(this.test.size()-1);
	}
	public void nouvellePageCopie(int numeroPage ) {
		/** TODO:nouvellePageCopie */
		--numeroPage;
		Page p;
		if(this.estDansLeTableau(numeroPage)){
			p = this.test.get(numeroPage);
			this.test.add(p);
		}
		else System.err.println("error : choisir un nombre entre 1 et" + this.test.size());
			
	}
	public void changerDePage(int numeroPage) {
		/** TODO:changerDePage */
		--numeroPage;
		if(this.estDansLeTableau(numeroPage))
			this.numeroDePageCourante = numeroPage;
	}
	public void pageSuperieur() {
		/** TODO:pageSuperieur */
		this.numeroDePageCourante++;
		if(!this.estDansLeTableau(this.numeroDePageCourante)) numeroDePageCourante--;
	}
	public void pageInferieur() {
		/** TODO:pageInferieur */
		this.numeroDePageCourante--;
		if(!this.estDansLeTableau(this.numeroDePageCourante)) numeroDePageCourante++;
	}
	public void supprimerPageCourante() {
		/** TODO:supprimerPageCourante */
		this.test.remove(numeroDePageCourante);
		if(!this.estDansLeTableau(this.numeroDePageCourante)) numeroDePageCourante=0;
		this.changerDePage(numeroDePageCourante);
		
	}
	public void supprimerPage(int numeroPage) {
		/** TODO:supprimerPage */
		numeroPage--;
		if(numeroPage == this.numeroDePageCourante){
			supprimerPageCourante();
		}else{
			this.test.remove(this.numeroDePageCourante);
			this.numeroDePageCourante=0;
		}
		
	}
	public void changePositionPageCourante(int nouvellePosition) {
		/** TODO:changePositionPageCourante */
		this.numeroDePageCourante = nouvellePosition;
	}
	public void changePosition(int numeroPage, int nouvellePosition ) {
		/** TODO:changePosition */
	}
	public void ActualiserPageCourante(){
		/** TODO:ActualiserPageCourante */
	}
	public void AfficherPageCourante() {
		/** TODO:AfficherPageCourante */
	}	
	public void play() {
		/** TODO:play */
	}
	private boolean estDansLeTableau(int numero){
		if( 0 <= numero && numero < this.test.size())
			return true;
		else
			return false;
	}
	
	
}


