package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import model.OrderForm;
import service.CustomerService;
import service.OrderFormService;

/**
 * Servlet implementation class Order
 */
@WebServlet("/order")
public class Order extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Order() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cardNum = request.getParameter("number");
		String cardType= request.getParameter("card");
		String price= request.getParameter("price");
		String inital= request.getParameter("midint");
		String itemNum= request.getParameter("item");
		String address= request.getParameter("address");
		String firstName= request.getParameter("fsname");
		String description= request.getParameter("des");
		
		String lastName= request.getParameter("lsname");
		
		String fsnumber= request.getParameter("number");
		String lsnumber=request.getParameter("number1");
		
		
		 OrderForm orderform = new OrderForm(cardNum,cardType,price,inital,itemNum, address,
				firstName, description, lastName);
		 request.setAttribute("orderform", orderform);
		
		String page=null;
		
		if(fsnumber.equals(lsnumber)) {
			page="/view/order.jsp";
			
		}
		else
			page="/view/form.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
	}

	
	}


