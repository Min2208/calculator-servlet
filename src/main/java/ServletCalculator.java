import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletCalculator extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float firstNumber=Float.parseFloat(req.getParameter("first-operand"));
        float secondtNumber=Float.parseFloat(req.getParameter("second-operand"));

        String operator=req.getParameter("operator");

        PrintWriter writer = resp.getWriter();
        try {
              float result=Calculator.calculator(firstNumber,secondtNumber,operator);
              writer.print(firstNumber +" + " + secondtNumber+" = " + result);
        }catch (Exception e){
            writer.print("Error : " + e.getMessage());
        }
    }
}
