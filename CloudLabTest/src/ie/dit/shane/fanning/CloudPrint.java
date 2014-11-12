package ie.dit.shane.fanning;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CloudPrint extends HttpServlet { 
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
	int a, b, c, d;
	String AString, BString, CString, DString;
	int Lans, Rans, Answer;
	
	AString =  req.getParameter("A");
	BString =  req.getParameter("B");
	CString =  req.getParameter("C");
	DString =  req.getParameter("D");
	
	a = Integer.parseInt(AString);
	b = Integer.parseInt(BString);
	c = Integer.parseInt(CString);
	d = Integer.parseInt(DString);
	
	Lans = a - b;
	Rans = c - d;
	Answer = Lans * Rans;
	
	resp.getWriter().println("Inputs are " + AString + ", " + BString + ", " + CString + " and " + DString + "!");
	resp.getWriter().println("(" + AString + " - " + BString + ") * (" + CString + " - " + DString + ")");
	resp.getWriter().println("(" + Lans + ") * (" + Rans + ")");
	resp.getWriter().println("Total is: " + Answer + "!");
	
	}
}
