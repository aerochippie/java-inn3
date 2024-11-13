package no.hvl.dat100.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SkrivBlogg {

    private static final Logger log = LoggerFactory.getLogger(SkrivBlogg.class);

    public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		PrintWriter writer = null;

		try {
			writer = new PrintWriter(mappe + filnavn);
			writer.print(samling.toString());
			writer.close();

		} catch (FileNotFoundException e) {
			log.error("e: ", e);
		} catch(Exception e){
			System.out.println("Somethign went wrong \n" + e);
		} finally{
			if(writer !=null){
				System.out.println("Suksess");
			}
		}

		return writer!=null;
}}
