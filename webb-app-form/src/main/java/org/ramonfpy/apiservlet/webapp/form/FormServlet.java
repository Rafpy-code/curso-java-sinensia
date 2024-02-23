package org.ramonfpy.apiservlet.webapp.form;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet("/registro")
public class FormServlet extends HttpServlet {

    // Patrón para validar el email
    public boolean validarEmail(String email) {
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }

    @Override   // doGet para pasar los datos por la url (y en el index.jsp también quitar el método).
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email    = req.getParameter("email");
        String country  = req.getParameter("pais");

        String[] languages = req.getParameterValues("lenguajes");
        String[] roles = req.getParameterValues("roles");

        String idioma = req.getParameter("idioma");

        boolean habilitar = req.getParameter("habilitar") != null &&
                req.getParameter("habilitar").equals("on");

        String secreto = req.getParameter("secreto");

        List<String> errores = new ArrayList<>();

        if (username == null || username.isBlank()) {
            errores.add("El nombre de usuario es requerido!");
        }
        if (password == null || password.isBlank()) {
            errores.add("La contraseña es requerida!");
        }

       if (!validarEmail(email)) {
            errores.add("El formato del email es incorrecto!");
        }

        if (country == null || country.isBlank()) {
            errores.add("El país es requerido!");
        }
        if (languages == null || languages.length == 0) {
            errores.add("Debe seleccionar al menos un lenguaje de programación");
        }
        if (roles == null || roles.length == 0) {
            errores.add("Debe seleccionar al menos un rol");
        }
        if (idioma == null) {
            errores.add("Debe seleccionar un idioma!");
        }

        try (PrintWriter out = resp.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("     <head>");
            out.println("         <meta charset = \"UTF-8\">");
            out.println("         <title>Resultado Form</title>");
            out.println("     </head>");
            out.println("     <body>");
            out.println("         <h1>Resultado Form Registro de Usuarios:</h1>");

            out.println("         <ul>");

            if (errores.isEmpty()) {
                out.println("             <li>Usuario: " + username + "</li>");
                out.println("             <li>Contraseña: " + password + "</li>");
                out.println("             <li>Email: " + email + "</li>");
                out.println("             <li>País: " + country + "</li>");

                out.println("             <li>Lenguajes: <ul>");
                Arrays.asList(languages).forEach(language -> {
                    out.println("             <li> " + language + "</li>");
                });
                out.println("             </ul></li>");

                out.println("             <li>Roles: <ul>");
                Arrays.asList(roles).forEach(rol -> {
                    out.println("             <li> " + rol + "</li>");
                });
                out.println("             </ul></li>");

                out.println("               <li>Idioma:  " + idioma + " </li>");
                out.println("               <li>Habilitado: " + habilitar + " </li>");
                out.println("               <li>Secreto: " + secreto + " </li>");
            } else {
                errores.forEach(error -> {
                    out.println("<li>Error: " + error + "</li>");
                });
                out.println("<p><a href=\"/webb-app-form/index.jsp\">Volver</a></p>");
            }
            out.println("         </ul>");

            out.println("         <h4>by Ramón</h4>");
            out.println("         <p></p>");
            out.println("     </body>");
            out.println("</html>");
        }
    }
}

// Patrón para validar el email
//            Pattern pattern = Pattern
//                    .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
//                            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
//
//            Matcher matcher = pattern.matcher(email);
//
//            if (matcher.find() == false) {
//                errores.add("El formato del email es incorrecto!");
//            }

