<%@ import com.example.sample.model.Registrationdetails %>

<!DOCTYPE html>
<html>
<head>
  <title>Displaying Registration Details</title>
</head>
<body>

<%
  // Assuming data is available in the request scope (modify if needed)
  Registrationdetails[] data = (Registrationdetails[]) request.getAttribute("data");

  if (data != null) {
    for (Registrationdetails item : data) {
      out.println("<p>" + item.getName() + "</p>");  // Use getter method
    }
  } else {
    out.println("<p>No data available.</p>");
  }
%>

</body>
</html>
