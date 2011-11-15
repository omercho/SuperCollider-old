#ifndef _TEST_APP
#define _TEST_APP

#include "ofMain.h"
#include "ofxOsc.h"
#include "ofxOpenCv.h"
// 
// listen on port 12345
#define PORT 12345
#define NUM_MSG_STRINGS 20
#define MAX_SKETCHES 500

class testApp : public ofBaseApp{

	public:

		testApp();
		void setup();
		void update();
		void draw();

		void keyPressed  (int key);
		void mouseMoved(int x, int y );
		void mouseDragged(int x, int y, int button);
		void mousePressed(int x, int y, int button);
		void mouseReleased(int x, int y, int button);		
		void printFoto(int photoID, float xPosImg, float yPosImg, float wImg, float hImg);
		
		ofxOscSender	osc_sender;		
		//	Feedback	
		ofTexture		texScreen;
		float 			feedbackSpeedX,	feedbackSpeedY;
		int				feedbackView, timeLine, viewRotate, view_fillBackground;

        
        //VIDEO
        int playVideo, rVideo, gVideo, bVideo, aVideo;
        float vidX,vidY, vidWidth, vidHeight; 
        
        ofVideoPlayer*  myVideo;
		
		ofImage			image[200];
		
		ofImage			screen;		
		
		ofTrueTypeFont	font;

		
		map<string, int> iv;
		map<string, float> fv;		

		float	data[1024];
		float		countX;
		
		int imgWidth, imgHeight;
		
		bool full;

		
	private:
		ofxOscReceiver	receiver;

		int				current_msg_string;
		string			msg_strings[NUM_MSG_STRINGS];
		float			timers[NUM_MSG_STRINGS];
		string			mouseButtonState;
	

};

#endif
