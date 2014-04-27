package graphics;

import java.net.URL;

public class ImageLoader {
	//This is a small method I made to simplify loading of images.
		
	private URL loadTexture(String filename){   
		URL tempImg = this.getClass().getResource(filename);
		        
		return tempImg;
	}

//To load an image with this function, just use:

//image = loadTexture(loadResource("whatever.png"));
// with image being an Image, or a ImageIcon, or anything that would accept a URL.
}
