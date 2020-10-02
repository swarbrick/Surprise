package com.example.service;

public class TimeService {
	
	static String mm;

	public static String changeTimeToWords(String dbTime) {
		int hr = Integer.parseInt(dbTime.substring(0,2));
		int min = Integer.parseInt(dbTime.substring(2));
		
		if (hr > 12) {
			mm ="PM";
			hr = hr - 12;
		} else if (hr == 0) {
			mm = "AM";
			hr = 12;
		} else if (hr == 12) {
			mm = "PM";
		} else {
			mm = "AM";
		}
		
		return timeInWords(hr, min);
	}
	
	private static String timeInWords(int h, int m) {

        String hn;
        String hn2;

        if (h == 1) {
            hn = "one";
            hn2 = "two";
        } else if (h == 2) {
            hn = "two";
            hn2 = "three";
        } else if (h == 3) {
            hn = "three";
            hn2 = "four";
        } else if (h == 4) {
            hn = "four";
            hn2 = "five";
        } else if (h == 5) {
            hn = "five";
            hn2 = "six";
        } else if (h == 6) {
            hn = "six";
            hn2 = "seven";
        } else if (h == 7) {
            hn = "seven";
            hn2 = "eight";
        } else if (h == 8) {
            hn = "eight";
            hn2 = "nine";
        } else if (h == 9) {
            hn = "nine";
            hn2 = "ten";
        } else if (h == 10) {
            hn = "ten";
            hn2 = "eleven";
        } else if (h == 11) {
            hn = "eleven";
            hn2 = "twelve";
        } else {
            hn = "twelve";
            hn2 = "one";
        }

        if (m == 0) {
            return hn + " o' clock" + " " + mm;
        } else if (m == 1) {
            return "one minute past " + hn  + " " + mm;
        } else if (m == 2) {
            return "two minutes past " + hn + " " + mm;
        } else if (m == 3) {
            return "three minutes past " + hn  + " " + mm;
        } else if (m == 4) {
            return "four minutes past " + hn  + " " + mm;
        } else if (m == 5) {
            return "five minutes past " + hn  + " " + mm;
        } else if (m == 6) {
            return "six minutes past " + hn + " " + mm;
        } else if (m == 7) {
            return "seven minutes past " + hn + " " + mm;
        } else if (m == 8) {
            return "eight minutes past " + hn + " " + mm;
        } else if (m == 9) {
            return "nine minutes past " + hn + " " + mm;
        } else if (m == 10) {
            return "ten minutes past " + hn + " " + mm;
        } else if (m == 11) {
            return "eleven minutes past " + hn + " " + mm;
        } else if (m == 12) {
            return "twelve minutes past " + hn + " " + mm;
        } else if (m == 13) {
            return "thirteen minutes past " + hn + " " + mm;
        } else if (m == 14) {
            return "fourteen minutes past " + hn + " " + mm;
        } else if (m == 15) {
            return "quarter past " + hn + " " + mm;
        } else if (m == 16) {
            return "sixteen minutes past " + hn + " " + mm;
        } else if (m == 17) {
            return "seventeen minutes past " + hn + " " + mm;
        } else if (m == 18) {
            return "eighteen minutes past " + hn + " " + mm;
        } else if (m == 19) {
            return "nineteen minutes past " + hn + " " + mm;
        } else if (m == 20) {
            return "twenty minutes past " + hn + " " + mm;
        } else if (m == 21) {
            return "twenty one minutes past " + hn + " " + mm;
        } else if (m == 22) {
            return "twenty two minutes past " + hn + " " + mm;
        } else if (m == 23) {
            return "twenty three minutes past " + hn + " " + mm;
        } else if (m == 24) {
            return "twenty four minutes past " + hn + " " + mm;
        } else if (m == 25) {
            return "twenty five minutes past " + hn + " " + mm;
        } else if (m == 26) {
            return "twenty six minutes past " + hn + " " + mm;
        } else if (m == 27) {
            return "twenty seven minutes past " + hn + " " + mm;
        } else if (m == 28) {
            return "twenty eight minutes past " + hn + " " + mm;
        } else if (m == 29) {
            return "twenty nine minutes past " + hn + " " + mm;
        } else if (m == 30) {
            return "half past " + hn + " " + mm;
        } else if (m == 31) {
            return "twenty nine minutes to " + hn2 + " " + mm;
        } else if (m == 32) {
            return "twenty eight minutes to " + hn2 + " " + mm;
        } else if (m == 33) {
            return "twenty seven minutes to " + hn2 + " " + mm;
        } else if (m == 34) {
            return "twenty six minutes to " + hn2 + " " + mm;
        } else if (m == 35) {
            return "twenty five minutes to " + hn2 + " " + mm;
        } else if (m == 36) {
            return "twenty four minutes to " + hn2 + " " + mm;
        } else if (m == 37) {
            return "twenty three minutes to " + hn2 + " " + mm;
        } else if (m == 38) {
            return "twenty two minutes to " + hn2 + " " + mm;
        } else if (m == 39) {
            return "twenty one minutes to " + hn2 + " " + mm;
        } else if (m == 40) {
            return "twenty minutes to " + hn2 + " " + mm;
        } else if (m == 41) {
            return "nineteen minutes to " + hn2 + " " + mm;
        } else if (m == 42) {
            return "eighteen minutes to " + hn2 + " " + mm;
        } else if (m == 43) {
            return "seventeen minutes to " + hn2 + " " + mm;
        } else if (m == 44) {
            return "sixteen minutes to " + hn2 + " " + mm;
        } else if (m == 45) {
            return "quarter to " + hn2 + " " + mm;
        } else if (m == 46) {
            return "fourteen minutes to " + hn2 + " " + mm;
        } else if (m == 47) {
            return "thirteen minutes to " + hn2 + " " + mm;
        } else if (m == 48) {
            return "twelve minutes to " + hn2 + " " + mm;
        } else if (m == 49) {
            return "eleven minutes to " + hn2 + " " + mm;
        } else if (m == 50) {
            return "ten minutes to " + hn2 + " " + mm;
        } else if (m == 51) {
            return "nine minutes to " + hn2 + " " + mm;
        } else if (m == 52) {
            return "eight minutes to " + hn2 + " " + mm;
        } else if (m == 53) {
            return "seven minutes to " + hn2 + " " + mm;
        } else if (m == 54) {
            return "six minutes to " + hn2 + " " + mm;
        } else if (m == 55) {
            return "five minutes to " + hn2 + " " + mm;
        } else if (m == 56) {
            return "four minutes to " + hn2 + " " + mm;
        } else if (m == 57) {
            return "three minutes to " + hn2 + " " + mm;
        } else if (m == 58) {
            return "two minutes to " + hn2 + " " + mm;
        } else if (m == 59) {
            return "one minute to " + hn2 + " " + mm;
        } else {
            return "0";
        }
	}
}
