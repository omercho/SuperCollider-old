#include "testApp.h"
#include "stdio.h"

//------------------------------------*--------------------------
testApp::testApp(){

}

//--------------------------------------------------------------
void testApp::setup(){
	{
		//ofSetFullscreen(true);
		
		ofSetBackgroundAuto(false);
		ofEnableSmoothing();
		ofEnableAlphaBlending();
		ofBackground(0,0,0);
		ofSetFrameRate(60);
		ofSetWindowTitle("reAfesi");
	}	//Screen
	{
		texScreen.allocate(ofGetWidth(), ofGetHeight(),GL_RGB);// GL_RGBA); 
		screen.allocate(ofGetWidth(), ofGetHeight(),GL_RGB);
		
	}	//Texture
	{
		af0000.loadImage("/Users/fou/images/shadows/0000.JPG");af0001.loadImage("/Users/fou/images/shadows/0001.JPG");af0002.loadImage("/Users/fou/images/shadows/0002.JPG");af0003.loadImage("/Users/fou/images/shadows/0003.JPG");af0004.loadImage("/Users/fou/images/shadows/0004.JPG");af0005.loadImage("/Users/fou/images/shadows/0005.JPG");af0006.loadImage("/Users/fou/images/shadows/0006.JPG");af0007.loadImage("/Users/fou/images/shadows/0007.JPG");af0008.loadImage("/Users/fou/images/shadows/0008.JPG"); af0009.loadImage("/Users/fou/images/shadows/0009.JPG");
		af0010.loadImage("/Users/fou/images/shadows/0010.JPG");af0011.loadImage("/Users/fou/images/shadows/0011.JPG");af0012.loadImage("/Users/fou/images/shadows/0012.JPG");af0013.loadImage("/Users/fou/images/shadows/0013.JPG");af0014.loadImage("/Users/fou/images/shadows/0014.JPG");af0015.loadImage("/Users/fou/images/shadows/0015.JPG");af0016.loadImage("/Users/fou/images/shadows/0016.JPG");af0017.loadImage("/Users/fou/images/shadows/0017.JPG");af0018.loadImage("/Users/fou/images/shadows/0018.JPG"); af0019.loadImage("/Users/fou/images/shadows/0019.JPG");
		af0020.loadImage("/Users/fou/images/shadows/0020.JPG");af0021.loadImage("/Users/fou/images/shadows/0021.JPG");af0022.loadImage("/Users/fou/images/shadows/0022.JPG");af0023.loadImage("/Users/fou/images/shadows/0023.JPG");af0024.loadImage("/Users/fou/images/shadows/0024.JPG");af0025.loadImage("/Users/fou/images/shadows/0025.JPG");af0026.loadImage("/Users/fou/images/shadows/0026.JPG");af0027.loadImage("/Users/fou/images/shadows/0027.JPG");af0028.loadImage("/Users/fou/images/shadows/0028.JPG"); af0029.loadImage("/Users/fou/images/shadows/0029.JPG");
		af0030.loadImage("/Users/fou/images/shadows/0030.JPG");af0031.loadImage("/Users/fou/images/shadows/0031.JPG");af0032.loadImage("/Users/fou/images/shadows/0032.JPG");af0033.loadImage("/Users/fou/images/shadows/0033.JPG");af0034.loadImage("/Users/fou/images/shadows/0034.JPG");af0035.loadImage("/Users/fou/images/shadows/0035.JPG");af0036.loadImage("/Users/fou/images/shadows/0036.JPG");af0037.loadImage("/Users/fou/images/shadows/0037.JPG");af0038.loadImage("/Users/fou/images/shadows/0038.JPG"); af0039.loadImage("/Users/fou/images/shadows/0039.JPG");
		af0040.loadImage("/Users/fou/images/shadows/0040.JPG");af0041.loadImage("/Users/fou/images/shadows/0041.JPG");af0042.loadImage("/Users/fou/images/shadows/0042.JPG");af0043.loadImage("/Users/fou/images/shadows/0043.JPG");af0044.loadImage("/Users/fou/images/shadows/0044.JPG");af0045.loadImage("/Users/fou/images/shadows/0045.JPG");af0046.loadImage("/Users/fou/images/shadows/0046.JPG");af0047.loadImage("/Users/fou/images/shadows/0047.JPG");af0048.loadImage("/Users/fou/images/shadows/0048.JPG"); af0049.loadImage("/Users/fou/images/shadows/0049.JPG");
		af0050.loadImage("/Users/fou/images/shadows/0050.JPG");af0051.loadImage("/Users/fou/images/shadows/0051.JPG");af0052.loadImage("/Users/fou/images/shadows/0052.JPG");af0053.loadImage("/Users/fou/images/shadows/0053.JPG");af0054.loadImage("/Users/fou/images/shadows/0054.JPG");af0055.loadImage("/Users/fou/images/shadows/0055.JPG");af0056.loadImage("/Users/fou/images/shadows/0056.JPG");af0057.loadImage("/Users/fou/images/shadows/0057.JPG");af0058.loadImage("/Users/fou/images/shadows/0058.JPG"); af0059.loadImage("/Users/fou/images/shadows/0059.JPG");
		af0060.loadImage("/Users/fou/images/shadows/0060.JPG");af0061.loadImage("/Users/fou/images/shadows/0061.JPG");af0062.loadImage("/Users/fou/images/shadows/0062.JPG");af0063.loadImage("/Users/fou/images/shadows/0063.JPG");af0064.loadImage("/Users/fou/images/shadows/0064.JPG");af0065.loadImage("/Users/fou/images/shadows/0065.JPG");af0066.loadImage("/Users/fou/images/shadows/0066.JPG");af0067.loadImage("/Users/fou/images/shadows/0067.JPG");af0068.loadImage("/Users/fou/images/shadows/0068.JPG"); af0069.loadImage("/Users/fou/images/shadows/0069.JPG");
		af0070.loadImage("/Users/fou/images/shadows/0070.JPG");af0071.loadImage("/Users/fou/images/shadows/0071.JPG");af0072.loadImage("/Users/fou/images/shadows/0072.JPG");af0073.loadImage("/Users/fou/images/shadows/0073.JPG");af0074.loadImage("/Users/fou/images/shadows/0074.JPG");af0075.loadImage("/Users/fou/images/shadows/0075.JPG");af0076.loadImage("/Users/fou/images/shadows/0076.JPG");af0077.loadImage("/Users/fou/images/shadows/0077.JPG");af0078.loadImage("/Users/fou/images/shadows/0078.JPG"); af0079.loadImage("/Users/fou/images/shadows/0079.JPG");
		af0080.loadImage("/Users/fou/images/shadows/0080.JPG");af0081.loadImage("/Users/fou/images/shadows/0081.JPG");af0082.loadImage("/Users/fou/images/shadows/0082.JPG");af0083.loadImage("/Users/fou/images/shadows/0083.JPG");af0084.loadImage("/Users/fou/images/shadows/0084.JPG");af0085.loadImage("/Users/fou/images/shadows/0085.JPG");af0086.loadImage("/Users/fou/images/shadows/0086.JPG");af0087.loadImage("/Users/fou/images/shadows/0087.JPG");af0088.loadImage("/Users/fou/images/shadows/0088.JPG"); af0089.loadImage("/Users/fou/images/shadows/0089.JPG");
		af0090.loadImage("/Users/fou/images/shadows/0090.JPG");af0091.loadImage("/Users/fou/images/shadows/0091.JPG");af0092.loadImage("/Users/fou/images/shadows/0092.JPG");af0093.loadImage("/Users/fou/images/shadows/0093.JPG");af0094.loadImage("/Users/fou/images/shadows/0094.JPG");af0095.loadImage("/Users/fou/images/shadows/0095.JPG");af0096.loadImage("/Users/fou/images/shadows/0096.JPG");af0097.loadImage("/Users/fou/images/shadows/0097.JPG");af0098.loadImage("/Users/fou/images/shadows/0098.JPG"); af0099.loadImage("/Users/fou/images/shadows/0099.JPG");

		af0100.loadImage("/Users/fou/images/shadows/0100.JPG");af0101.loadImage("/Users/fou/images/shadows/0101.JPG");af0102.loadImage("/Users/fou/images/shadows/0102.JPG");af0103.loadImage("/Users/fou/images/shadows/0103.JPG");af0104.loadImage("/Users/fou/images/shadows/0104.JPG");af0105.loadImage("/Users/fou/images/shadows/0105.JPG");af0106.loadImage("/Users/fou/images/shadows/0106.JPG");af0107.loadImage("/Users/fou/images/shadows/0107.JPG");af0108.loadImage("/Users/fou/images/shadows/0108.JPG"); af0109.loadImage("/Users/fou/images/shadows/0109.JPG");
		af0110.loadImage("/Users/fou/images/shadows/0110.JPG");af0111.loadImage("/Users/fou/images/shadows/0111.JPG");af0112.loadImage("/Users/fou/images/shadows/0112.JPG");af0113.loadImage("/Users/fou/images/shadows/0113.JPG");af0114.loadImage("/Users/fou/images/shadows/0114.JPG");af0115.loadImage("/Users/fou/images/shadows/0115.JPG");af0116.loadImage("/Users/fou/images/shadows/0116.JPG");af0117.loadImage("/Users/fou/images/shadows/0117.JPG");af0118.loadImage("/Users/fou/images/shadows/0118.JPG"); af0119.loadImage("/Users/fou/images/shadows/0119.JPG");
		af0120.loadImage("/Users/fou/images/shadows/0120.JPG");af0121.loadImage("/Users/fou/images/shadows/0121.JPG");af0122.loadImage("/Users/fou/images/shadows/0122.JPG");af0123.loadImage("/Users/fou/images/shadows/0123.JPG");af0124.loadImage("/Users/fou/images/shadows/0124.JPG");af0125.loadImage("/Users/fou/images/shadows/0125.JPG");af0126.loadImage("/Users/fou/images/shadows/0126.JPG");af0127.loadImage("/Users/fou/images/shadows/0127.JPG");af0128.loadImage("/Users/fou/images/shadows/0128.JPG"); af0129.loadImage("/Users/fou/images/shadows/0129.JPG");
		af0130.loadImage("/Users/fou/images/shadows/0130.JPG");af0131.loadImage("/Users/fou/images/shadows/0131.JPG");af0132.loadImage("/Users/fou/images/shadows/0132.JPG");af0133.loadImage("/Users/fou/images/shadows/0133.JPG");af0134.loadImage("/Users/fou/images/shadows/0134.JPG");af0135.loadImage("/Users/fou/images/shadows/0135.JPG");af0136.loadImage("/Users/fou/images/shadows/0136.JPG");af0137.loadImage("/Users/fou/images/shadows/0137.JPG");af0138.loadImage("/Users/fou/images/shadows/0138.JPG"); af0139.loadImage("/Users/fou/images/shadows/0139.JPG");
		af0140.loadImage("/Users/fou/images/shadows/0140.JPG");af0141.loadImage("/Users/fou/images/shadows/0141.JPG");af0142.loadImage("/Users/fou/images/shadows/0142.JPG");af0143.loadImage("/Users/fou/images/shadows/0143.JPG");af0144.loadImage("/Users/fou/images/shadows/0144.JPG");af0145.loadImage("/Users/fou/images/shadows/0145.JPG");af0146.loadImage("/Users/fou/images/shadows/0146.JPG");af0147.loadImage("/Users/fou/images/shadows/0147.JPG");af0148.loadImage("/Users/fou/images/shadows/0148.JPG"); af0149.loadImage("/Users/fou/images/shadows/0149.JPG");
		af0150.loadImage("/Users/fou/images/shadows/0150.JPG");af0151.loadImage("/Users/fou/images/shadows/0151.JPG");af0152.loadImage("/Users/fou/images/shadows/0152.JPG");af0153.loadImage("/Users/fou/images/shadows/0153.JPG");af0154.loadImage("/Users/fou/images/shadows/0154.JPG");af0155.loadImage("/Users/fou/images/shadows/0155.JPG");af0156.loadImage("/Users/fou/images/shadows/0156.JPG");af0157.loadImage("/Users/fou/images/shadows/0157.JPG");af0158.loadImage("/Users/fou/images/shadows/0158.JPG"); af0159.loadImage("/Users/fou/images/shadows/0159.JPG");
		af0160.loadImage("/Users/fou/images/shadows/0160.JPG");af0161.loadImage("/Users/fou/images/shadows/0161.JPG");af0162.loadImage("/Users/fou/images/shadows/0162.JPG");af0163.loadImage("/Users/fou/images/shadows/0163.JPG");af0164.loadImage("/Users/fou/images/shadows/0164.JPG");af0165.loadImage("/Users/fou/images/shadows/0165.JPG");af0166.loadImage("/Users/fou/images/shadows/0166.JPG");af0167.loadImage("/Users/fou/images/shadows/0167.JPG");af0168.loadImage("/Users/fou/images/shadows/0168.JPG"); af0169.loadImage("/Users/fou/images/shadows/0169.JPG");
		af0170.loadImage("/Users/fou/images/shadows/0170.JPG");af0171.loadImage("/Users/fou/images/shadows/0171.JPG");af0172.loadImage("/Users/fou/images/shadows/0172.JPG");af0173.loadImage("/Users/fou/images/shadows/0173.JPG");af0174.loadImage("/Users/fou/images/shadows/0174.JPG");af0175.loadImage("/Users/fou/images/shadows/0175.JPG");af0176.loadImage("/Users/fou/images/shadows/0176.JPG");af0177.loadImage("/Users/fou/images/shadows/0177.JPG");af0178.loadImage("/Users/fou/images/shadows/0178.JPG"); af0179.loadImage("/Users/fou/images/shadows/0179.JPG");
		af0180.loadImage("/Users/fou/images/shadows/0180.JPG");af0181.loadImage("/Users/fou/images/shadows/0181.JPG");af0182.loadImage("/Users/fou/images/shadows/0182.JPG");af0183.loadImage("/Users/fou/images/shadows/0183.JPG");af0184.loadImage("/Users/fou/images/shadows/0184.JPG");af0185.loadImage("/Users/fou/images/shadows/0185.JPG");af0186.loadImage("/Users/fou/images/shadows/0186.JPG");af0187.loadImage("/Users/fou/images/shadows/0187.JPG");af0188.loadImage("/Users/fou/images/shadows/0188.JPG"); af0189.loadImage("/Users/fou/images/shadows/0189.JPG");
		af0190.loadImage("/Users/fou/images/shadows/0190.JPG");af0191.loadImage("/Users/fou/images/shadows/0191.JPG");af0192.loadImage("/Users/fou/images/shadows/0192.JPG");af0193.loadImage("/Users/fou/images/shadows/0193.JPG");af0194.loadImage("/Users/fou/images/shadows/0194.JPG");af0195.loadImage("/Users/fou/images/shadows/0195.JPG");af0196.loadImage("/Users/fou/images/shadows/0196.JPG");af0197.loadImage("/Users/fou/images/shadows/0197.JPG");af0198.loadImage("/Users/fou/images/shadows/0198.JPG"); af0199.loadImage("/Users/fou/images/shadows/0199.JPG");

		af0200.loadImage("/Users/fou/images/shadows/0200.JPG");af0201.loadImage("/Users/fou/images/shadows/0201.JPG");af0202.loadImage("/Users/fou/images/shadows/0202.JPG");af0203.loadImage("/Users/fou/images/shadows/0203.JPG");af0204.loadImage("/Users/fou/images/shadows/0204.JPG");af0205.loadImage("/Users/fou/images/shadows/0205.JPG");af0206.loadImage("/Users/fou/images/shadows/0206.JPG");af0207.loadImage("/Users/fou/images/shadows/0207.JPG");af0208.loadImage("/Users/fou/images/shadows/0208.JPG"); af0209.loadImage("/Users/fou/images/shadows/0209.JPG");
		af0210.loadImage("/Users/fou/images/shadows/0210.JPG");af0211.loadImage("/Users/fou/images/shadows/0211.JPG");af0212.loadImage("/Users/fou/images/shadows/0212.JPG");af0213.loadImage("/Users/fou/images/shadows/0213.JPG");af0214.loadImage("/Users/fou/images/shadows/0214.JPG");af0215.loadImage("/Users/fou/images/shadows/0215.JPG");af0216.loadImage("/Users/fou/images/shadows/0216.JPG");af0217.loadImage("/Users/fou/images/shadows/0217.JPG");af0218.loadImage("/Users/fou/images/shadows/0218.JPG"); af0219.loadImage("/Users/fou/images/shadows/0219.JPG");
		af0220.loadImage("/Users/fou/images/shadows/0220.JPG");af0221.loadImage("/Users/fou/images/shadows/0221.JPG");af0222.loadImage("/Users/fou/images/shadows/0222.JPG");af0223.loadImage("/Users/fou/images/shadows/0223.JPG");af0224.loadImage("/Users/fou/images/shadows/0224.JPG");af0225.loadImage("/Users/fou/images/shadows/0225.JPG");af0226.loadImage("/Users/fou/images/shadows/0226.JPG");af0227.loadImage("/Users/fou/images/shadows/0227.JPG");af0228.loadImage("/Users/fou/images/shadows/0228.JPG"); af0229.loadImage("/Users/fou/images/shadows/0229.JPG");
		af0230.loadImage("/Users/fou/images/shadows/0230.JPG");af0231.loadImage("/Users/fou/images/shadows/0231.JPG");af0232.loadImage("/Users/fou/images/shadows/0232.JPG");af0233.loadImage("/Users/fou/images/shadows/0233.JPG");af0234.loadImage("/Users/fou/images/shadows/0234.JPG");af0235.loadImage("/Users/fou/images/shadows/0235.JPG");af0236.loadImage("/Users/fou/images/shadows/0236.JPG");af0237.loadImage("/Users/fou/images/shadows/0237.JPG");af0238.loadImage("/Users/fou/images/shadows/0238.JPG"); af0239.loadImage("/Users/fou/images/shadows/0239.JPG");
		af0240.loadImage("/Users/fou/images/shadows/0240.JPG");af0241.loadImage("/Users/fou/images/shadows/0241.JPG");af0242.loadImage("/Users/fou/images/shadows/0242.JPG");af0243.loadImage("/Users/fou/images/shadows/0243.JPG");af0244.loadImage("/Users/fou/images/shadows/0244.JPG");af0245.loadImage("/Users/fou/images/shadows/0245.JPG");af0246.loadImage("/Users/fou/images/shadows/0246.JPG");af0247.loadImage("/Users/fou/images/shadows/0247.JPG");af0248.loadImage("/Users/fou/images/shadows/0248.JPG"); af0249.loadImage("/Users/fou/images/shadows/0249.JPG");
		af0250.loadImage("/Users/fou/images/shadows/0250.JPG");af0251.loadImage("/Users/fou/images/shadows/0251.JPG");af0252.loadImage("/Users/fou/images/shadows/0252.JPG");af0253.loadImage("/Users/fou/images/shadows/0253.JPG");af0254.loadImage("/Users/fou/images/shadows/0254.JPG");af0255.loadImage("/Users/fou/images/shadows/0255.JPG");af0256.loadImage("/Users/fou/images/shadows/0256.JPG");af0257.loadImage("/Users/fou/images/shadows/0257.JPG");af0258.loadImage("/Users/fou/images/shadows/0258.JPG"); af0259.loadImage("/Users/fou/images/shadows/0259.JPG");
		af0260.loadImage("/Users/fou/images/shadows/0260.JPG");af0261.loadImage("/Users/fou/images/shadows/0261.JPG");af0262.loadImage("/Users/fou/images/shadows/0262.JPG");af0263.loadImage("/Users/fou/images/shadows/0263.JPG");af0264.loadImage("/Users/fou/images/shadows/0264.JPG");af0265.loadImage("/Users/fou/images/shadows/0265.JPG");af0266.loadImage("/Users/fou/images/shadows/0266.JPG");af0267.loadImage("/Users/fou/images/shadows/0267.JPG");af0268.loadImage("/Users/fou/images/shadows/0268.JPG"); af0269.loadImage("/Users/fou/images/shadows/0269.JPG");
		af0270.loadImage("/Users/fou/images/shadows/0270.JPG");af0271.loadImage("/Users/fou/images/shadows/0271.JPG");af0272.loadImage("/Users/fou/images/shadows/0272.JPG");af0273.loadImage("/Users/fou/images/shadows/0273.JPG");af0274.loadImage("/Users/fou/images/shadows/0274.JPG");af0275.loadImage("/Users/fou/images/shadows/0275.JPG");af0276.loadImage("/Users/fou/images/shadows/0276.JPG");af0277.loadImage("/Users/fou/images/shadows/0277.JPG");af0278.loadImage("/Users/fou/images/shadows/0278.JPG"); af0279.loadImage("/Users/fou/images/shadows/0279.JPG");
		af0280.loadImage("/Users/fou/images/shadows/0280.JPG");af0281.loadImage("/Users/fou/images/shadows/0281.JPG");af0282.loadImage("/Users/fou/images/shadows/0282.JPG");af0283.loadImage("/Users/fou/images/shadows/0283.JPG");af0284.loadImage("/Users/fou/images/shadows/0284.JPG");af0285.loadImage("/Users/fou/images/shadows/0285.JPG");af0286.loadImage("/Users/fou/images/shadows/0286.JPG");af0287.loadImage("/Users/fou/images/shadows/0287.JPG");af0288.loadImage("/Users/fou/images/shadows/0288.JPG"); af0289.loadImage("/Users/fou/images/shadows/0289.JPG");
		af0290.loadImage("/Users/fou/images/shadows/0290.JPG");af0291.loadImage("/Users/fou/images/shadows/0291.JPG");af0292.loadImage("/Users/fou/images/shadows/0292.JPG");af0293.loadImage("/Users/fou/images/shadows/0293.JPG");af0294.loadImage("/Users/fou/images/shadows/0294.JPG");af0295.loadImage("/Users/fou/images/shadows/0295.JPG");af0296.loadImage("/Users/fou/images/shadows/0296.JPG");af0297.loadImage("/Users/fou/images/shadows/0297.JPG");af0298.loadImage("/Users/fou/images/shadows/0298.JPG"); af0299.loadImage("/Users/fou/images/shadows/0299.JPG");
								
		af1.loadImage("/Users/fou/images/gradient/NYSunset.jpg"); //
		af2.loadImage("/Users/fou/Dropbox/AB-/ArisOmer/AferesiDB/aferesi/af2.png");
		af3.loadImage("/Users/fou/Dropbox/AB-/ArisOmer/AferesiDB/aferesi/af3.png");
		af4.loadImage("/Users/fou/Dropbox/AB-/ArisOmer/AferesiDB/aferesi/af4.png");
		af5.loadImage("/Users/fou/Dropbox/AB-/ArisOmer/AferesiDB/aferesi/af5.png");
		af6.loadImage("/Users/fou/Dropbox/AB-/ArisOmer/AferesiDB/aferesi/af6.png");
		af7.loadImage("/Users/fou/Dropbox/AB-/ArisOmer/AferesiDB/aferesi/af7.png");
		
		//af1.allocate(600,600,OF_IMAGE_COLOR);												
	}	//load DATA
	{
		cout << "listening for osc messages on port " << PORT << "\n";
		receiver.setup( PORT );
		current_msg_string = 0;
	}	//OSC
	{		
		for (int i = 0; i < MAX_SKETCHES; i++){
			sketch[i].init(ofRandom(0.01, 0.29), ofRandom(0.01, 0.29));
		}
	}	//sketch
	{
	iv["textureRed"] = iv["textureGreen"] = iv["textureBlue"] = iv["textureAlpha"] = 255;
	iv["reverseEllipse"] = ofGetWidth();	iv["reverseTexture"] = -1;
	iv["mirrorMode"] = 0; iv["pixelate"] = 0;
	fv["spectroRed"] = fv["spectroGreen"] = fv["spectroBlue"] = 1;
	
	fv["xPosImg"] = ofGetWidth()/2 - af1.width/2;
	fv["yPosImg"] = ofGetHeight()/2 - af1.height/2;
	fv["wImg"] = af1.width; fv["hImg"] = af1.height;
	iv["sketch"] = 0;
	iv["alphaSketch"] = 10;
	}	//Initial value
}

//--------------------------------------------------------------
void testApp::update(){
	{
	for ( int i=0; i<NUM_MSG_STRINGS; i++ )
	{
		if ( timers[i] < ofGetElapsedTimef() )
			msg_strings[i] = "";
	}

	// check for waiting messages
	while( receiver.hasWaitingMessages() )
	{
		ofxOscMessage m;
		receiver.getNextMessage( &m );

		// map implementation
		if ( m.getAddress() == "int" )	{
			iv[m.getArgAsString(0)] = m.getArgAsInt32(1);	
			printf("value = %d\n", m.getArgAsInt32(1));		
		}
		if ( m.getAddress() == "float" )	{
			fv[m.getArgAsString(0)] = m.getArgAsFloat(1);			
		}
		if ( m.getAddress() == "img" )	{
			printFoto(int(m.getArgAsFloat(0)), m.getArgAsFloat(1), m.getArgAsFloat(2),m.getArgAsFloat(3),m.getArgAsFloat(4));			
		}				
	}
	}	//OSC
}
//--------------------------------------------------------------
void testApp::draw(){
	switch ( iv["mirrorMode"] )	{
		case 0:
		break;
		 case 1:
			texScreen.loadScreenData(0,0,ofGetWidth(), ofGetHeight());	
			ofSetColor(iv["textureRed"],iv["textureGreen"],iv["textureBlue"],iv["textureAlpha"]);
			texScreen.draw(iv["reverseTexture"],0,ofGetWidth(), ofGetHeight());
			
			break;
		 case 2:
			texScreen.loadScreenData(0,0,ofGetWidth(), ofGetHeight());
			ofSetColor(iv["textureRed"],iv["textureGreen"],iv["textureBlue"],iv["textureAlpha"]);
			texScreen.draw(iv["reverseTexture"],0,ofGetWidth(), ofGetHeight());
			break;
		 case 3:
			texScreen.loadScreenData(0,0,ofGetWidth(), ofGetHeight());
			ofSetColor(iv["textureRed"],iv["textureGreen"],iv["textureBlue"],iv["textureAlpha"]);
			texScreen.draw(iv["reverseTexture"],0,ofGetWidth(), ofGetHeight());
			break;

		 case 4:
			texScreen.loadScreenData(0,0,ofGetWidth()/2, ofGetHeight());
			ofSetColor(iv["textureRed"],iv["textureGreen"],iv["textureBlue"],iv["textureAlpha"]);					
			texScreen.draw(-1,0,ofGetWidth()/2, ofGetHeight());					
			texScreen.loadScreenData(ofGetWidth()/2, 0,ofGetWidth(), ofGetHeight());
			ofSetColor(iv["textureRed"],iv["textureGreen"],iv["textureBlue"],iv["textureAlpha"]);					
			texScreen.draw(ofGetWidth()/2 +1,0,ofGetWidth(), ofGetHeight());					
			break;
		 case 5:
			ofSetColor(255,255,255,255);
			texScreen.loadScreenData(0,0,ofGetWidth()/4, ofGetHeight());
			texScreen.draw(-1,0);					
			texScreen.loadScreenData(ofGetWidth()/4, 0,ofGetWidth()/4, ofGetHeight());
			texScreen.draw(ofGetWidth()/4 + 1,0);					
								
			texScreen.loadScreenData(ofGetWidth()/4, 0,ofGetWidth()/4, ofGetHeight());
			texScreen.draw(3*ofGetWidth()/4 + 1,0);					
//
			texScreen.loadScreenData(ofGetWidth()/2, 0, ofGetWidth()/4, ofGetHeight());
			texScreen.draw(ofGetWidth()/2 - 1,0);
			
			break;
		 default:
			printf("%d", fv["mirrorMode"]);
		}	// mirrowMode
		
	if (iv["sketch"] == 1)	{	
		if(mouseX > 0 and mouseX < af0.width and mouseY > 0 and mouseY < af0.height)	{
			unsigned char * pixels = af0.getPixels();
			int index = mouseY*af0.width*3 + mouseX*3;
			iv["redSketch"] = pixels[index];
			iv["greenSketch"] = pixels[index+1];
			iv["blueSketch"] = pixels[index+2];
			for( int i=0; i<MAX_SKETCHES; i++ ) {

				sketch[i].draw(mouseX, mouseY, 0, iv["redSketch"], iv["greenSketch"], iv["blueSketch"], iv["alphaSketch"], 0);	
			}		
		}
	}
	if (iv["pixelate"] == 1)	{	
		unsigned char * pixels = af0.getPixels();
		for (int y=0; y<af0.height; y += 1){	
			for(int x=0; x<af0.width; x += 1){
				// the index of the pixel:
				int index = y*af0.width*3 + x*3;
				int red = pixels[index];
				int green = pixels[index+1];
				int blue = pixels[index+2];
				ofSetColor(red,green,blue);
				ofEllipse(x,y,4,4);
			}
		}
	}
	if (iv["edgeDetection"] == 1)	{	
		float kernel[3][3] = {	{ -1, -1, -1 },
								{ -1, 9,  -1 },
								{ -1, -1,  -1 } };
								
		kernel[1][1] = 8 +sin(ofGetFrameNum());
		
		for (int y = 1; y < screen.height-1; y++) { // Skip top and bottom edges
			for (int x = 1; x < screen.width-1; x++) { // Skip left and right edges
			  float sum = 0; // Kernel sum for this pixel
			  for (int ky = -1; ky <= 1; ky++) {
				for (int kx = -1; kx <= 1; kx++) {
				  // Calculate the adjacent pixel for this kernel point
				  int pos = (y + ky)*screen.width + (x + kx);
				  
				  //+++++++++ SOLVE THIS ++++++++++++++++++//
				  // Image is grayscale, red/green/blue are identical
				  
				  //float val = screen.pixels[pos].rgbRed;
				  
				  // Multiply adjacent pixels based on the kernel values
				  
				  //sum += kernel[ky+1][kx+1] * val;
				  
				}
			  }
			  // For this pixel in the new image, set the gray value
			  // based on the sum from the kernel
		
			  	
				//screen.pixels[y*screen.width + x] = color(sum);
					
					
			}
		  }
		  // State that there are changes to edgeImg.pixels[]
		  
		  //screen.updatePixels();
		  
		  screen.draw(0,0);// Draw the new image
		  //image(edgeImg, 600, 0); // Draw the new image
		

	
	}
	
}

void testApp::keyPressed  (int key){
	if(key == 'v' or key == 'V'){
		full = !full;
		if(full){
			ofSetFullscreen(true);
		} else {
			ofSetFullscreen(false);
		}
	}	
	if(key == 'b' or key == 'B'){
		ofBackground(0,0,0);
	}	
	
	if(key == 'c' or key == 'C')	{
	{
		int trans= ofRandom(0,500);
		unsigned char * pixels = af1.getPixels();
		for (int y=0; y<600; y++){
			for(int x=0; x<600; x++){
				// the index of the pixel:
				int index = y*600*3 + x*3;
				int red = pixels[index];
				int green = pixels[index+1];
				int blue = pixels[index+2];
				//printf("%d,%d,%d\n", red, green , blue);	
				ofSetColor(red,green,blue);
				ofLine(x,y,300,300);
				//ofEllipse(trans+x,y,2,2);
				// ok, so this example does not actually DO anything...
			}
		}
	}	//Working
	}
	if(key == 'k' or key == 'K')	{
	{

		unsigned char * pixels = af0.getPixels();
		int index = mouseY*af0.width*3 + mouseX*3;
		iv["redSketch"] = pixels[index];
		iv["greenSketch"] = pixels[index+1];
		iv["blueSketch"] = pixels[index+2];
		ofSetColor(iv["redSketch"],iv["greenSketch"],iv["blueSketch"]);
		ofEllipse(mouseX, mouseY,10,10);
		
	}	//Working
	}

	if(key == 't' or key == 'T'){
		//ofEllipse(100,100,100,100);
		for (int i = 0; i < 10; i++)	{
			ofSetColor(255,255,255,255);
			texScreen.loadScreenData(int(ofRandom(0,1200)),int(ofRandom(0,1200)),int(ofRandom(100,500)),int(ofRandom(100,500)));
			texScreen.draw(int(ofRandom(0,1400)),int(ofRandom(0,1400)),100,100);			
		}		
	}	
}
void testApp::mouseDragged(int x, int y, int button){
//pixel (100,20):
}
void testApp::mouseMoved(int x, int y ){
		/*
		unsigned char * pixels = grayImage.getPixels();
		int widthOfLine = grayImage.width * 1024;  // how long is a line of pixels
		iv["redSketch"] 	= pixels[(mouseY * widthOfLine) + mouseX * 3    ];
		iv["greenSketch"] 	= pixels[(mouseY * widthOfLine) + mouseX * 3 + 1];
		iv["blueSketch"] 	= pixels[(mouseY * widthOfLine) + mouseX * 3 + 2];
		iv["alphaSketch"] 	= pixels[(mouseY * widthOfLine) + mouseX * 3 + 3];
		printf("%d,%d,%d,%d\n", iv["redSketch"], iv["greenSketch"], iv["blueSketch"], iv["alphaSketch"]);	
		ofSetColor(iv["redSketch"], iv["greenSketch"], iv["blueSketch"], iv["alphaSketch"]);
		ofLine(0,0,mouseX, mouseY);
		ofLine(0,ofGetHeight(),mouseX, mouseY);
		ofLine(ofGetWidth(),0,mouseX, mouseY);
		ofLine(ofGetWidth(), ofGetHeight(),mouseX, mouseY);				
		ofEllipse(mouseX, mouseY, 10,10);
		*/

}
void testApp::mousePressed(int x, int y, int button)	{

}
void testApp::mouseReleased(int x, int y, int button){}

void testApp::printFoto(int photoID, float xPosImg, float yPosImg, float wImg, float hImg)	{
	glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA); // GL_SRC_ALPHA_SATURATE,GL_ONE     GL_SRC_ALPHA, GL_ONE
	ofFill();
	ofSetColor(0xFFFFFF);				
	fv["xPosImg"] = xPosImg;
	fv["yPosImg"] = yPosImg;
	fv["wImg"] = wImg;
	fv["hImg"] = hImg;			
	switch ( photoID )	{
		case 0:		af0000.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 1:		af0001.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 2:		af0002.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 3:		af0003.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 4:		af0004.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 5:		af0005.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 6:		af0006.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 7:		af0007.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 8:		af0008.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 9:		af0009.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break;						
		case 10:	af0010.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 11:		af0011.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 12:		af0012.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 13:		af0013.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 14:		af0014.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 15:		af0015.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 16:		af0016.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 17:		af0017.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 18:		af0018.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 19:		af0019.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break;
		case 20:	af0020.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 21:		af0021.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 22:		af0022.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 23:		af0023.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 24:		af0024.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 25:		af0025.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 26:		af0026.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 27:		af0027.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 28:		af0028.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 29:		af0029.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break;
		case 30:	af0030.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 31:		af0031.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 32:		af0032.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 33:		af0033.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 34:		af0034.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 35:		af0035.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 36:		af0036.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 37:		af0037.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 38:		af0038.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 39:		af0039.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break;
		case 40:	af0040.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 41:		af0041.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 42:		af0042.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 43:		af0043.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 44:		af0044.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 45:		af0045.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 46:		af0046.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 47:		af0047.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 48:		af0048.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 49:		af0049.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break;
		case 50:	af0050.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 51:		af0051.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 52:		af0052.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 53:		af0053.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 54:		af0054.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 55:		af0055.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 56:		af0056.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 57:		af0057.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 58:		af0058.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 59:		af0059.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break;
		case 60:	af0060.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 61:		af0061.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 62:		af0062.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 63:		af0063.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 64:		af0064.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 65:		af0065.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 66:		af0066.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 67:		af0067.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 68:		af0068.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 69:		af0069.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break;
		case 70:	af0070.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 71:		af0071.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 72:		af0072.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 73:		af0073.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 74:		af0074.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 75:		af0075.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 76:		af0076.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 77:		af0077.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 78:		af0078.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 79:		af0079.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break;
		case 80:	af0080.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 81:		af0081.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 82:		af0082.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 83:		af0083.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 84:		af0084.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 85:		af0085.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 86:		af0086.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 87:		af0087.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 88:		af0088.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 89:		af0089.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break;
		case 90:	af0090.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 91:		af0091.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 92:		af0092.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 93:		af0093.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 94:		af0094.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 95:		af0095.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 96:		af0096.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 97:		af0097.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 98:		af0098.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 99:		af0099.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break;

		case 100:	af0100.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 101:	af0101.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 102:	af0102.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 103:	af0103.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 104:	af0104.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 105:	af0105.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 106:	af0106.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 107:	af0107.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 108:	af0108.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 109:	af0109.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break;						
		case 110:	af0110.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 111:	af0111.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 112:	af0112.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 113:	af0113.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 114:	af0114.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 115:	af0115.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 116:	af0116.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 117:	af0117.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 118:	af0118.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 119:	af0119.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break;
		case 120:	af0120.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 121:	af0121.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 122:	af0122.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 123:	af0123.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 124:	af0124.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 125:	af0125.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 126:	af0126.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 127:	af0127.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 128:	af0128.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 129:	af0129.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break;
		case 130:	af0130.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 131:	af0131.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 132:	af0132.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 133:	af0133.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 134:	af0134.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 135:	af0135.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 136:	af0136.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 137:	af0137.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 138:	af0138.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 139:	af0139.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break;
		case 140:	af0140.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 141:	af0141.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 142:	af0142.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 143:	af0143.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 144:	af0144.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 145:	af0145.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 146:	af0146.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 147:	af0147.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 148:	af0148.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 149:	af0149.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break;
		case 150:	af0150.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 151:	af0151.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 152:	af0152.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 153:	af0153.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 154:	af0154.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 155:	af0155.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 156:	af0156.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 157:	af0157.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 158:	af0158.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 159:	af0159.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break;
		case 160:	af0160.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 161:	af0161.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 162:	af0162.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 163:	af0163.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 164:	af0164.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 165:	af0165.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 166:	af0166.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 167:	af0167.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 168:	af0168.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 169:	af0169.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break;
		case 170:	af0170.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 171:	af0171.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 172:	af0172.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 173:	af0173.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 174:	af0174.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 175:	af0175.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 176:	af0176.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 177:	af0177.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 178:	af0178.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 179:	af0179.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break;
		case 180:	af0180.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 181:	af0181.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 182:	af0182.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 183:	af0183.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 184:	af0184.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 185:	af0185.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 186:	af0186.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 187:	af0187.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 188:	af0188.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 189:	af0189.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break;
		case 190:	af0190.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 191:	af0191.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 192:	af0192.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 193:	af0193.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 194:	af0194.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 195:	af0195.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 196:	af0196.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 197:	af0197.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 198:	af0198.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 199:	af0199.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break;

		case 200:	af0200.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 201:	af0201.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 202:	af0202.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 203:	af0203.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 204:	af0204.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 205:	af0205.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 206:	af0206.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 207:	af0207.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 208:	af0208.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 209:	af0209.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break;						
		case 210:	af0210.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 211:	af0211.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 212:	af0212.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 213:	af0213.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 214:	af0214.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 215:	af0215.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 216:	af0216.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 217:	af0217.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 218:	af0218.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 219:	af0219.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break;
		case 220:	af0220.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 221:	af0221.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 222:	af0222.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 223:	af0223.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 224:	af0224.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 225:	af0225.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 226:	af0226.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 227:	af0227.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 228:	af0228.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 229:	af0229.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break;
		case 230:	af0230.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 231:	af0231.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 232:	af0232.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 233:	af0233.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 234:	af0234.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 235:	af0235.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 236:	af0236.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 237:	af0237.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 238:	af0238.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 239:	af0239.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break;
		case 240:	af0240.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 241:	af0241.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 242:	af0242.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 243:	af0243.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 244:	af0244.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 245:	af0245.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 246:	af0246.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 247:	af0247.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 248:	af0248.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 249:	af0249.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break;
		case 250:	af0250.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 251:	af0251.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 252:	af0252.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 253:	af0253.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 254:	af0254.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 255:	af0255.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 256:	af0256.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 257:	af0257.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 258:	af0258.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 259:	af0259.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break;
		case 260:	af0260.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 261:	af0261.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 262:	af0262.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 263:	af0263.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 264:	af0264.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 265:	af0265.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 266:	af0266.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 267:	af0267.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 268:	af0268.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 269:	af0269.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break;
		case 270:	af0270.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 271:	af0271.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 272:	af0272.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 273:	af0273.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 274:	af0274.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 275:	af0275.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 276:	af0276.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 277:	af0277.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 278:	af0278.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 279:	af0279.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break;
		case 280:	af0280.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 281:	af0281.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 282:	af0282.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 283:	af0283.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 284:	af0284.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 285:	af0285.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 286:	af0286.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 287:	af0287.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 288:	af0288.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 289:	af0289.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break;
		case 290:	af0290.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 291:	af0291.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 292:	af0292.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 293:	af0293.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 294:	af0294.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 295:	af0295.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 296:	af0296.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 297:	af0297.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 298:	af0298.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break; case 299:	af0299.draw(fv["xPosImg"],fv["yPosImg"], fv["wImg"], fv["hImg"]);	break;

		
		//default: //printf("No foto found\n");
	}
}

