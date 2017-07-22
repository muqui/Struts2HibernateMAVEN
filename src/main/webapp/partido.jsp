<%-- 
    Document   : partido
    Created on : 22/07/2017, 12:20:30 PM
    Author     : mq12
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Hello World</title>
<s:head />
</head>
<body>
   <s:form action="addpartido">
   <s:textfield name="local" label="Local"/>
   <s:textfield name="goleslocal" label="Goles local"/>
   <s:textfield name="visita" label="Visita"/>
   <s:textfield name="golesvista" label="Goles visita"/>
   <s:textfield name="estadio" label="Estadio"/>
   
    <s:textfield name="fechaTemporal" label="fecha" />
   <s:textfield name="jornada" label="Jornada"/>
   <s:textfield name="torneo" label="Torneo"/>
  
   <s:submit/>
   <hr/>
   <table>
      <tr>
         <td>Local</td>
         <td>Goles local</td>
         <td>Visita</td>
          <td>Goles Visita</td>
          <td>Jornada</td>
         <td>Torneo </td>
         <td>Fecha</td>
          <td>Estadio</td>
      </tr>
      <s:iterator value="listPartido">	
         <tr>
            <td><s:property value="local"/></td>
            <td><s:property value="goleslocal"/></td>
            <td><s:property value="visita"/></td>
            <td><s:property value="golesvisita"/></td>
           <td><s:property value="jornada"/></td>
            <td><s:property value="torneo"/></td>
          <td><s:property value="fecha"/></td>
            <td><s:property value="torneo"/></td>
          
           </tr>
      </s:iterator>	
   </table>
   </s:form>
</body>
</html>