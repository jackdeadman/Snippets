package graphics;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;

public class ImageLoader {
	//This is a small method I made to simplify loading of images.
		
	private URL loadTexture(String filename){
		URL tempImg;
		        
		tempImg = this.getClass().getResource(filename);
		        
		return tempImg;
		
	}

//Just use this line of code!

//image = loadTexture(loadResource("whatever.png"));
}
