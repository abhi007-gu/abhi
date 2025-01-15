import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class LibraryServlet extends HttpServlet {
    private Library library;

    @Override
    public void init() throws ServletException {
        super.init();
        library = new Library();
        library.addBook(new Book(1, "Java Basics", "John Doe"));
        library.addBook(new Book(2, "Advanced Java", "Jane Doe"));
    }

    // Handle GET request to display books
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("viewBooks".equals(action)) {
            request.setAttribute("books", library.getBooks());
            RequestDispatcher dispatcher = request.getRequestDispatcher("books.jsp");
            dispatcher.forward(request, response);
        } else if ("registerMember".equals(action)) {
            // Show registration form (This can be added as another JSP or HTML form)
        }
    }

    // Handle POST request for adding books, borrowing, returning, etc.
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Process POST actions such as borrowing or returning books
    }
}
