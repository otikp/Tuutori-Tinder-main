package application;

import java.util.ArrayList;

import javafx.scene.image.Image;
//make the user profile and gives every profile a image
public class ProfileImages {
	
	private Image myImage1;
	private Image myImage2;
	private Image myImage3;
	private Image myImage4;
	private int imageIndex;
	private ArrayList<Image> imageList;
	//saves the image to variables and adds it to a list
	public ProfileImages() {
		this.myImage1 = new Image(getClass().getResourceAsStream("654.png"));
		this.myImage2 = new Image(getClass().getResourceAsStream("RoopeSeta.png"));
		this.myImage3 = new Image(getClass().getResourceAsStream("image.png"));
		this.myImage4 = new Image(getClass().getResourceAsStream("AkuAnkka.png"));
		this.imageList = new ArrayList<>();
		this.imageList.add(myImage1);
		this.imageList.add(myImage2);
		this.imageList.add(myImage3);
		this.imageList.add(myImage4);
		this.imageIndex = -1;
	}
	//Gives profiles one possible image from four existing images.
	public Image getProfileImage() {
		if (this.imageIndex < (this.imageList.size() - 1) ) {
			this.imageIndex++;
			return imageList.get(imageIndex);
		} else {
			this.imageIndex = 0;
			return imageList.get(imageIndex);
		}
	}
}
