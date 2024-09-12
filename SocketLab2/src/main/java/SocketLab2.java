import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SocketLab2
 */
@WebServlet("/SocketLab2")
public class SocketLab2 extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SocketLab2() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String socketType = request.getParameter("socketType");
        String quantityStr = request.getParameter("quantity");
        String customerName = request.getParameter("customerName");
        String customerEmail = request.getParameter("customerEmail");

        int quantity = 0;
        try {
            quantity = Integer.parseInt(quantityStr);
        } catch (NumberFormatException e) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Quantity must be a valid number.");
            return;
        }

        double pricePerSocket = getPricePerSocket(socketType);
        double totalCost = quantity * pricePerSocket;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Socket Quote </h2>");
        out.println("<p>Socket Type: " + socketType + "</p>");
        out.println("<p>Quantity: " + quantity + "</p>");
        out.println("<p>Total Cost: $" + totalCost + "</p>");
        out.println("</body></html>");
    }

    private double getPricePerSocket(String socketType) {
        switch (socketType) {
            case "Type A":
                return 35.0; 
            case "Type B":
                return 40.5; 
            case "Type C":
                return 45.0; 
            default:
                return 0.0; 
        }
    }
}
