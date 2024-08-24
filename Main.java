// PARTNER NAME:
// PARTNER NAME:
// CS111 SECTION #:
// DATE: 

public class Main
{
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		String surname = "SPECIMEN",
           givenName = "TEST V",
           category = "C09",
           cardNum = "SRC0000000773",
           countryBirth = "Ethiopia",
           termsConditions = "None",
           numUSCIS1st = "000",
           numUSCIS2nd = "000",
           numUSCIS3rd = "773",
           dateBirth = "01",
           monthBirth = "JAN",
           yearBirth = "1920",
           dateValid = "01",
           monthValid = "01",
           yearValid = "80",
           dateExpire = "05",
           monthExpire = "10",
           yearExpire = "11";

    char sex ='M';     
    
		//INPUT SECTION
		// N/A
		
		//CALCULATION SECTION
		
		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════");
		System.out.println("║         UNITED STATES OF AMERICA");
		System.out.println("║                                  EMPLOYMENT AUTHORIZATION CARD");
		System.out.println("║                       Surname");
		System.out.println("║                       " + surname);
		System.out.println("║  .----.    .----.     Given Name");
		System.out.println("║ (   ^  \\  /  ^   )    " + givenName);
		System.out.println("║        |  |           USCIS#         Category   Card#");
		System.out.println("║       _/  \\_          " + numUSCIS1st + "-" + numUSCIS2nd + "-" + numUSCIS3rd + "    " + category + "        " + cardNum);
		System.out.println("║      (_    _)         Country of Birth");
		System.out.println("║   ,    `--`    ,      " + countryBirth);
		System.out.println("║   \\'-.______.-'/      Terms and Conditions");
		System.out.println("║    \\          /       " + termsConditions);
		System.out.println("║     '.--..--.'        Date of Birth   Sex");
		System.out.println("║       `\"\"\"\"\"`         " + dateBirth + " " + monthBirth + " " + yearBirth + "     " + sex);
		System.out.println("║                       Valid From:     " + dateValid + "/" + monthValid + "/" + yearValid);
		System.out.println("║                       Card Expires:   " + dateExpire + "/" + monthExpire + "/" + yearExpire);
		System.out.println("║ ascii art by: jgs     NOT VALID FOR REENTRY TO U.S.");
		System.out.println("╚══════════════════════════════════════════════════════════════════════");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}