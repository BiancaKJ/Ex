package myapp;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

public class JsonEx extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		Gson gSon = new Gson();
		central cen = new central(1,"Blumenau");
		String C = gSon.toJson(central);
		resp.getWriter().println(C);
	}
}
