// Lab15st.java
// This is the student, starting file for Lab 15.
// This file is identical to Java1521.java.
// This slide show is about Mr. Leon Schram.
// Each student needs to alter this presentation,
// add pictures, add pages, add graphics and make it about him/herself.


import java.awt.*;


public class Lab15st extends java.applet.Applet
{

	int numClicks;
	Image picture1, picture2, picture3, picture4, picture5;

	public void init()
	{
		numClicks = 0;
		picture1 = getImage(getDocumentBase(),"LSchram.gif");
		picture2 = getImage(getDocumentBase(),"JSchram.jpg");
		picture3 = getImage(getDocumentBase(),"nederlands.gif");
		picture4 = getImage(getDocumentBase(),"leon&isolde.jpg");
		picture5 = getImage(getDocumentBase(),"JPIILogo.jpg");

		// The following MediaTracker/try/catch code ensures that
		// all images are loaded before the program continues.
		MediaTracker tracker = new MediaTracker(this);
		tracker.addImage(picture1,1);
		tracker.addImage(picture2,1);
		tracker.addImage(picture3,1);
		tracker.addImage(picture4,1);
		tracker.addImage(picture5,1);
		try
		{
			tracker.waitForAll();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

	public void paint(Graphics g)
	{
		switch (numClicks)
		{
			case 0 : page1(g); break;
			case 1 : page2(g); break;
			case 2 : page3(g); break;
			case 3 : page4(g); break;
			case 4 : page5(g); break;
			case 5 : page6(g); break;
			case 6 : page7(g); break;
			case 7 : numClicks -= 1; break;
			
		}
	}

	public boolean mouseDown(Event e, int x, int y)
	{
		numClicks++;
		repaint();
		return true;
	}

	public void page1(Graphics g)
	{
		Expo.setFont(g,"Arial",Font.BOLD,100);
		Expo.drawString(g,"THE TITLE PAGE OF DOOM",218,100);
		Expo.setColor(g,Expo.yellow);
		Expo.drawThickPreciseSpiral(g,510,370,275,50,15);
		Expo.setColor(g,Expo.red);
		Expo.fillStar(g,510,370,175,8);
		Expo.setColor(g,Expo.green);
		Expo.drawThickStar(g,510,370,225,8,25);
		Expo.setColor(g,Expo.blue);
		Expo.drawThickStar(g,510,370,275,8,25);
		g.drawImage(picture1,425,285,this);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"My name is David Iarkowski.",30,300);
		Expo.drawString(g,"Click once to continue.",760,550);
	}

	public void page2(Graphics g)
	{
		Expo.setFont(g,"Algerian",Font.BOLD,100);
		Expo.drawString(g,"TURN BACK NOW",200,100);
		Expo.setColor(g,Expo.blue);
		Expo.fillRectangle(g,100,250,900,500);
		Expo.setColor(g,Expo.chartreuse);
		g.drawImage(picture3,200,300,this);
		g.drawImage(picture4,500,280,this);
		Expo.setColor(g,Expo.blue);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I was born in Teaneck, NJ on May 9, 2000. I have not married yet because I'm 15 and don't live in West Virginia, nor do I want to.",100,200);
		Expo.drawString(g,"Click once to continue.",750,550);
	}

	public void page3(Graphics g)
	{
		Expo.setFont(g,"Impact",Font.BOLD,100);
		Expo.drawString(g,"I'M WARNING YOU",200,100);
		Expo.setColor(g,Expo.darkGreen);
		Expo.fillRoundedRectangle(g,460,170,960,515,50);
		g.drawImage(picture5,150,225,this);
		g.drawImage(picture2,500,193,this);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I am a sophomore. I go to school at Vernon Township High School in Vernon, NJ. Also, this is totally a picture of me. I definitely look like Adam Sandler on meth.",100,150);
		Expo.drawString(g,"Click once to continue.",750,550);
	}

	public void page4(Graphics g)
	{
		Expo.setFont(g,"Impact",Font.BOLD,100);
		Expo.drawString(g,"YOU'RE ON YOUR OWN NOW",200,100);
		Expo.setColor(g,Expo.purple);
		Expo.fillRoundedRectangle(g,460,170,960,515,50);
		g.drawImage(picture5,150,225,this);
		g.drawImage(picture2,500,193,this);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I am a member of the VTHS Concert Choir, VTHS Chanticleer, and East Coast Sound. Starting next year, I will be in the Meistersingers Honours Choir.",100,150);
		Expo.drawString(g,"Click once to continue.",750,550);
		
	}

	public void page5(Graphics g)
	{
		Expo.setFont(g,"Times New Roman",Font.BOLD,100);
		Expo.drawString(g,"Page 5",200,100);
		Expo.setColor(g,Expo.blue);
		Expo.fillRectangle(g,100,250,900,500);
		Expo.setColor(g,Expo.chartreuse);
		g.drawImage(picture3,200,300,this);
		g.drawImage(picture4,500,280,this);
		Expo.setColor(g,Expo.blue);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"Other hobbies of mine include Rubik's Cubing, Pokémon, and writing.",100,200);
		Expo.drawString(g,"Click once to continue.",750,550);
	}

	public void page6(Graphics g)
	{
		Expo.setFont(g,"Times New Roman",Font.BOLD,100);
		Expo.drawString(g,"Page 6",200,100);
		Expo.setColor(g,Expo.blue);
		Expo.fillRectangle(g,100,250,900,500);
		Expo.setColor(g,Expo.chartreuse);
		g.drawImage(picture3,200,300,this);
		g.drawImage(picture4,500,280,this);
		Expo.setColor(g,Expo.blue);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"Other hobbies of mine include Rubik's Cubing, Pokémon, and writing.",100,200);
		Expo.drawString(g,"Click once to continue.",750,550);
	}

	public void page7(Graphics g)
	{
		Expo.setFont(g,"Impact",Font.BOLD,100);
		Expo.drawString(g,"Page 7",200,100);
		Expo.setColor(g,Expo.purple);
		Expo.fillRoundedRectangle(g,460,170,960,515,50);
		g.drawImage(picture5,150,225,this);
		g.drawImage(picture2,500,193,this);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I can also recite all the Presidents in order, and have memorized Pi to the 39th digit.",100,150);
		Expo.drawString(g,"Click once to continue.",750,550);
	}

}