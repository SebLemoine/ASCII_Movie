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
		Page p = new Page();
		if(this.estDansLeTableau(numeroPage)){
			//TODO: la copie de la page
			this.test.add(p);
		}
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
			this.test.remove(numeroPage);
			this.numeroDePageCourante=0;
		}
		
	}
	public void changePositionPageCourante(int nouvellePosition) {
		/** TODO:changePositionPageCourante */
		if(estDansLeTableau(nouvellePosition))
		this.numeroDePageCourante = nouvellePosition;
	}
	public void changePosition(int numeroPage, int nouvellePosition ) {
		/** TODO:changePosition */
		Page p = test.get(numeroPage);
		test.remove(numeroPage);
		test.add(--nouvellePosition, p);
	}
	public void ActualiserPageCourante(){
		/** TODO:ActualiserPageCourante */
		//test.get(this.numeroDePageCourante).actualiser();
	}
	public void AfficherPageCourante() {
		/** TODO:AfficherPageCourante */
		//test.get(this.numeroDePageCourante).toString(numeroDePageCourante);
	}	
	public void play() throws InterruptedException  {
		/** TODO:play */
		for (Page page : test) {
			System.out.println();
			page.toString();
			Thread.sleep(1000);
		}
	}
	
	public List<Page> getTest() {
		return test;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getCreateur() {
		return createur;
	}
	public void setCreateur(String createur) {
		this.createur = createur;
	}
	public int getTailleXPage() {
		return tailleXPage;
	}
	public int getTailleYPage() {
		return tailleYPage;
	}
	public int getNumeroDePageCourante() {
		return numeroDePageCourante+1;
	}
	public int getNombreDePage(){
		return getTest().size();
	}
	
	private boolean estDansLeTableau(int numero){
		if( 0 <= numero && numero < this.test.size())
			return true;
		else{
			System.err.println("error : choisir un nombre entre 1 et" + this.test.size());
			return false;
		}
			
	}
	
	
}


