<!--
Nombre      : comprobarLogin.jsp
Descripci�n : P�gina de Comprobar login
Fecha       : 28-08-2003
Estado      : OK
JSP visual  : No
Enlaces con : accesoAplicaciones.jsp, errorLogin.jsp
-->

<%@ page import = "totem.utl.utlPropiedades" %>
<jsp:useBean id="vs_prop" class="totem.utl.utlPropiedades" scope="session"/>

<%@ page import = "totem.lib.WFBD" %>
<jsp:useBean id="vs_wfbd" class="totem.lib.WFBD" scope="session"/>

<%@ page import = "totem.lib.WFSesion" %>
<jsp:useBean id="vs_sesion" class="totem.lib.WFSesion" scope="session"/>

<%@ page import = "totem.lib.WFRegistrarConexion" %>

<%

   String driver,c1,c2;
   driver = vs_prop.getString("driver");
   c1 = vs_prop.getString("c1");
   c2 = vs_prop.getStringElement("c2", Integer.parseInt(request.getParameter("entorno")));
   /*vs_wfbd.inicializar(driver+c1+c2,"","","david");*/
   vs_wfbd.inicializar(driver+c1+c2,"","",
   vs_prop.getStringElement("Entornos", Integer.parseInt(request.getParameter("entorno"))));

   if (vs_wfbd.estaConectado()) 
   { 
      //Registrar la conexi�n
      WFRegistrarConexion rc = new WFRegistrarConexion(vs_wfbd.leeConnection()); rc.ponModulo("Conexi�nWEB");
      rc.registrarLOG("InicioConexi�nWEB");
      //Crear una nueva sesi�n
      vs_sesion.inicializar(vs_wfbd);
      vs_sesion.login(request.getParameter("nombreUsuario"),request.getParameter("claveUsuario"));
      if (vs_sesion.estaLogin()) 
      { %> <jsp:forward page="accesoAplicaciones.jsp"/> <% } 
      else
      { 
         rc.registrarLOG("FinConexi�nWEB");
         vs_wfbd.desconectar();
         %> <jsp:forward page="../../htm/errorLogin.html"/> <% 
      }
   } 
   else
   { %> <jsp:forward page="../../htm/errorLogin.html"/> <% }
%> 
   
