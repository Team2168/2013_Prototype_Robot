package org.team2168.utils;

import edu.wpi.first.wpilibj.Victor;

/**
 * This class acts as a wrapper for the Victor class such that
 * commands sent to the motor controller are adjusted to yield
 * a linearized output.  
 *
 * @author James
 *
 */
public class LinearizedVictor extends Victor {
	/*
	 * Positive portion of Victor linearization lookup table. 8 bit resolution. 
	 */
	double[] lookupTable = {1.0000000000,
							0.9556843588,
							0.9061457882,
							0.8597161149,
							0.8162337349,
							0.7755434287,
							0.7374961804,
							0.7019489997,
							0.6687647477,
							0.6378119651,
							0.6089647045,
							0.5821023650,
							0.5571095310,
							0.5338758130,
							0.5122956926,
							0.4922683694,
							0.4736976121,
							0.4564916117,
							0.4405628381,
							0.4258278997,
							0.4122074059,
							0.3996258320,
							0.3880113879,
							0.3772958885,
							0.3674146280,
							0.3583062564,
							0.3499126584,
							0.3421788363,
							0.3350527936,
							0.3284854234,
							0.3224303980,
							0.3168440614,
							0.3116853248,
							0.3069155640,
							0.3024985200,
							0.2984002016,
							0.2945887905,
							0.2910345491,
							0.2877097303,
							0.2845884902,
							0.2816468025,
							0.2788623759,
							0.2762145730,
							0.2736843323,
							0.2712540917,
							0.2689077147,
							0.2666304183,
							0.2644087036,
							0.2622302881,
							0.2600840401,
							0.2579599153,
							0.2558488953,
							0.2537429283,
							0.2516348713,
							0.2495184351,
							0.2473881299,
							0.2452392141,
							0.2430676442,
							0.2408700266,
							0.2386435712,
							0.2363860471,
							0.2340957397,
							0.2317714093,
							0.2294122517,
							0.2270178609,
							0.2245881919,
							0.2221235271,
							0.2196244425,
							0.2170917765,
							0.2145265996,
							0.2119301864,
							0.2093039874,
							0.2066496045,
							0.2039687656,
							0.2012633022,
							0.1985351277,
							0.1957862167,
							0.1930185860,
							0.1902342770,
							0.1874353387,
							0.1846238120,
							0.1818017162,
							0.1789710346,
							0.1761337035,
							0.1732916001,
							0.1704465332,
							0.1676002339,
							0.1647543474,
							0.1619104259,
							0.1590699226,
							0.1562341861,
							0.1534044563,
							0.1505818602,
							0.1477674096,
							0.1449619987,
							0.1421664030,
							0.1393812784,
							0.1366071615,
							0.1338444704,
							0.1310935056,
							0.1283544525,
							0.1256273834,
							0.1229122610,
							0.1202089416,
							0.1175171793,
							0.1148366306,
							0.1121668589,
							0.1095073403,
							0.1068574690,
							0.1042165631,
							0.1015838715,
							0.0989585797,
							0.0963398174,
							0.0937266650,
							0.0911181609,
							0.0885133092,
							0.0859110869,
							0.0833104518,
							0.0000000000,
							0.0000000000,
							0.0000000000,
							0.0000000000,
							0.0000000000,
							0.0000000000,
							0.0000000000,
							0.0000000000,
							0.0000000000,
							0.0000000000,
							0.0000000000};

	public LinearizedVictor(int channel) {
		super(channel);
	}

	public LinearizedVictor(int slot, int channel) {
		super(slot, channel);
	}
	
    /**
     * This method acts as a middle man between the input and the Victor class'
     * set method. We know that the victor has an 8 bit output resolution. This
     * allows us to pre-compute all possible input values which generate unique
     * voltage outputs. Team 254's 7th order polynomial function was used to
     * generate the lookup table data.
     * Victor output is symetric about zero, so we only store the positive half
     * of the data set in the lookup table.
     * 
     * @param speed the desired % of output voltage from the victor.
     */
	public void set(double speed) {
		double retVal;

		retVal = lookupTable[128 - (int)(Math.abs(speed) * 128)];
		if (speed < 0)
			retVal *= -1.0;;
			
		super.set(retVal);
	}
}
