package monopoly;

/**
 * Created by fjricci on 5/23/2015.
 * From: http://www.tkcs-collins.com/truman/monopoly/monopoly.shtml
 */
public class CollinsProbabilities {
	private final double transitionMatrix[][];

	CollinsProbabilities() {
		transitionMatrix = new double[][]{
				{1.212, 0.000, 2.384, 5.556, 9.322, 12.153, 13.836, 6.250, 13.836, 11.111, 8.280, 6.597, 3.766, 0.000, 0.000, 2.083, 0.000, 0.000, 0.000, 0.000, 0.000, 0.000, 0.000, 0.000, 1.042, 0.000, 0.000, 0.000, 0.000, 0.000, 0.000, 0.000, 0.000, 0.000, 0.000, 0.000, 0.000, 0.000, 0.000, 1.042, 1.531},
				{0.863, 0.000, 0.000, 2.695, 6.418, 9.113, 11.111, 5.177, 16.667, 13.806, 11.111, 9.113, 6.418, 2.695, 0.000, 1.726, 0.000, 0.000, 0.000, 0.000, 0.000, 0.000, 0.000, 0.000, 0.863, 0.000, 0.000, 0.000, 0.000, 0.000, 0.000, 0.000, 0.000, 0.000, 0.000, 0.000, 0.000, 0.000, 0.000, 0.863, 1.361},
				{}};

	}
}
