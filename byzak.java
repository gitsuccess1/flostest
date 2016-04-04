import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.Files;
import java.util.regex.*;
import java.util.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import sekas;
import static java.nio.file.LinkOption.NOFOLLOW_LINKS;


class byzak implements Runnable {
	
	private Integer CoreNum;
	
	public byzak(Integer jkj) {
		CoreNum = jkj;
	}
	
	public void run() {
		Integer i = 0;
		Integer v = 0;
		
		List<Float> leftovers = new ArrayList<Float>();
		while (true != false) {
			i++;
			Float m = 123f / 2387f;
			leftovers.add(m);
			if (i > 20000000) {
				v++;
				System.out.println("!!! Core:" + CoreNum + "---Counter: " + v);
				leftovers = new ArrayList<Float>();
				/*
				try {
				    Thread.sleep(500);
				} 
				catch(InterruptedException e){
				    System.out.println("got interrupted!");
				}
				*/
				i = 0;
			}
		}
	}		
}


public class FullLoad  extends Thread  {
	
	public static void main(String[] args) {
		FullLoad myclass = new FullLoad();
		        
		for (Integer m = 1; m < 50; m++) {
		
			Thread myThready = new Thread(new byzak(m));
	        myThready.start();	
	        
	        System.out.println("Thread started " + m);

	        
			try {
			    Thread.sleep(1000);
			} 
			catch(InterruptedException e){
			    System.out.println("got interrupted!");
			}
			
		}	
	}

	public void run() {
		while (true != false) {
			Float m = 123f / 2387f;
		}
	}
	
	
	
	
	
}
