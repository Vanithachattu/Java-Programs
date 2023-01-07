package co.capg;

import java.util.StringTokenizer;

public class source {
	public int dosum(String message) {
		int token;
		int sum=0;
		StringTokenizer st = new StringTokenizer(message);
		while(st.hasMoreTokens()) {
			token=Integer.parseInt(st.nextToken());
				sum+=token;
			
		}
		return sum;
	}


}
