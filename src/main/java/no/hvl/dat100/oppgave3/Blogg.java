package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;
import no.hvl.dat100.oppgave2.Tekst;

public class Blogg {

	private Innlegg[] innleggTabell;
	private int nesteLedige;

	public Blogg() {
		innleggTabell=new Innlegg[20];
	}

	public Blogg(int lengde) {
		innleggTabell = new Innlegg[lengde];
		nesteLedige=0;
	}

	public int getAntall() {
		return nesteLedige;
	}
	
	public Innlegg[] getSamling() {
		return innleggTabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		int pos=0;
		boolean funnet = false;
		while(pos<nesteLedige&&!funnet){
			if(innleggTabell[pos].erLik(innlegg))
				funnet=true;
			else
				pos++;
		}
		if(funnet==true)
			return pos;
		else
			return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		int pos=finnInnlegg(innlegg);
        return pos >= 0;
	}

	public boolean ledigPlass() {
		if(nesteLedige<innleggTabell.length)
			return true;
		else
			return false;


	}
	
	public boolean leggTil(Innlegg innlegg) {

	if(!finnes(innlegg)){
		innleggTabell[nesteLedige]=innlegg;
		nesteLedige++;
		return true;
	}else
		return false;

    }
	
	public String toString() {
		String string="";
		for(int i=0;i<nesteLedige;i++){
			string += innleggTabell[i].toString();
		}


		return nesteLedige+"\n"+string;

	}

	// valgfrie oppgaver nedenfor

	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}