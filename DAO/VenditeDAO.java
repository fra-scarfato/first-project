package DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import Entit�.Carrello;
import Entit�.Fattura;
import Entit�.Prodotto_kg;
import Entit�.ProdottoUnitario;
import Risorse.MieEccezioni.CarrelloNonTrovatoException;
import Risorse.MieEccezioni.CarrelloVuotoException;
import Risorse.MieEccezioni.TesseraNonTrovataException;

public interface VenditeDAO {

	public ArrayList<Fattura> getFattura() throws SQLException;
	public void inserisciCarrello() throws SQLException;
	public int getUltimoIDCarrello() throws SQLException;
	public void inserisciCompCarelloKG(int IDCarrello, int IDProdotto, float quantit�) throws SQLException;
	public void inserisciCompCarelloN(int IDCarrello, int IDProdotto, int quantit�) throws SQLException;
	public ArrayList<Prodotto_kg> getCarrelloKGByID(int IDCarrello) throws SQLException;
	public ArrayList<ProdottoUnitario> getCarrelloNByID(int IDCarrello) throws SQLException;
	public Carrello getPrezzoEPuntiByID(int IDCarrello) throws SQLException;
	public void getTesserabyNTessera(int NTessera) throws TesseraNonTrovataException,SQLException;
	public void inserisciFattura(Fattura FatturaDaGenerare) throws SQLException, CarrelloVuotoException;
	public Carrello getCarrello(int IDCarrello)throws SQLException;
	public Carrello getIDCarrelloByIDFattura(String idFattura)throws SQLException, CarrelloNonTrovatoException;
	public void eliminaCarrello(int IDCarrello) throws SQLException;

}
