#ifndef _TEST_APP
#define _TEST_APP

#include "ofMain.h"
#include "ofSketch.h"
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
		ofTexture		texScreen;
		ofImage			af0, af1, af2, af3,af4,af5,af6,af7, screen;		
		ofImage			af0000,af0001,af0002,af0003,af0004,af0005,af0006,af0007,af0008,af0009;
		ofImage			af0010,af0011,af0012,af0013,af0014,af0015,af0016,af0017,af0018,af0019;
		ofImage			af0020,af0021,af0022,af0023,af0024,af0025,af0026,af0027,af0028,af0029;
		ofImage			af0030,af0031,af0032,af0033,af0034,af0035,af0036,af0037,af0038,af0039;
		ofImage			af0040,af0041,af0042,af0043,af0044,af0045,af0046,af0047,af0048,af0049;
		ofImage			af0050,af0051,af0052,af0053,af0054,af0055,af0056,af0057,af0058,af0059;
		ofImage			af0060,af0061,af0062,af0063,af0064,af0065,af0066,af0067,af0068,af0069;
		ofImage			af0070,af0071,af0072,af0073,af0074,af0075,af0076,af0077,af0078,af0079;
		ofImage			af0080,af0081,af0082,af0083,af0084,af0085,af0086,af0087,af0088,af0089;		
		ofImage			af0090,af0091,af0092,af0093,af0094,af0095,af0096,af0097,af0098,af0099;

		ofImage			af0100,af0101,af0102,af0103,af0104,af0105,af0106,af0107,af0108,af0109;
		ofImage			af0110,af0111,af0112,af0113,af0114,af0115,af0116,af0117,af0118,af0119;
		ofImage			af0120,af0121,af0122,af0123,af0124,af0125,af0126,af0127,af0128,af0129;
		ofImage			af0130,af0131,af0132,af0133,af0134,af0135,af0136,af0137,af0138,af0139;
		ofImage			af0140,af0141,af0142,af0143,af0144,af0145,af0146,af0147,af0148,af0149;
		ofImage			af0150,af0151,af0152,af0153,af0154,af0155,af0156,af0157,af0158,af0159;
		ofImage			af0160,af0161,af0162,af0163,af0164,af0165,af0166,af0167,af0168,af0169;
		ofImage			af0170,af0171,af0172,af0173,af0174,af0175,af0176,af0177,af0178,af0179;
		ofImage			af0180,af0181,af0182,af0183,af0184,af0185,af0186,af0187,af0188,af0189;		
		ofImage			af0190,af0191,af0192,af0193,af0194,af0195,af0196,af0197,af0198,af0199;

		ofImage			af0200,af0201,af0202,af0203,af0204,af0205,af0206,af0207,af0208,af0209;
		ofImage			af0210,af0211,af0212,af0213,af0214,af0215,af0216,af0217,af0218,af0219;
		ofImage			af0220,af0221,af0222,af0223,af0224,af0225,af0226,af0227,af0228,af0229;
		ofImage			af0230,af0231,af0232,af0233,af0234,af0235,af0236,af0237,af0238,af0239;
		ofImage			af0240,af0241,af0242,af0243,af0244,af0245,af0246,af0247,af0248,af0249;
		ofImage			af0250,af0251,af0252,af0253,af0254,af0255,af0256,af0257,af0258,af0259;
		ofImage			af0260,af0261,af0262,af0263,af0264,af0265,af0266,af0267,af0268,af0269;
		ofImage			af0270,af0271,af0272,af0273,af0274,af0275,af0276,af0277,af0278,af0279;
		ofImage			af0280,af0281,af0282,af0283,af0284,af0285,af0286,af0287,af0288,af0289;		
		ofImage			af0290,af0291,af0292,af0293,af0294,af0295,af0296,af0297,af0298,af0299;
		
		ofTrueTypeFont	font;
		ofSketch		sketch[MAX_SKETCHES];

		
		map<string, int> iv;
		map<string, float> fv;		

		float	data[1024];
		float		countX;
		
		bool full;

		
	private:
		ofxOscReceiver	receiver;

		int				current_msg_string;
		string			msg_strings[NUM_MSG_STRINGS];
		float			timers[NUM_MSG_STRINGS];
		string			mouseButtonState;
	

};

#endif
