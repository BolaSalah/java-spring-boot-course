<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Result</title>
<script src="https://cdn.tailwindcss.com"></script> <%-- Tailwind css --%>
</head>
<body class="bg-gradient-to-br from-blue-100 to-indigo-200 flex justify-center items-center min-h-screen p-4">

<%
    String fullName = request.getParameter("fullName");
    String password = request.getParameter("password");
    String age = request.getParameter("age");
    String addressRadio = request.getParameter("addressRadio");
    String addressSelect = request.getParameter("addressSelect");
%>

    <div class="bg-white p-8 rounded-2xl shadow-xl w-full max-w-md space-y-5">

        <h1 class="text-2xl font-bold text-center text-gray-800">Received Data</h1>

        <dl class="divide-y divide-gray-200">
            <div class="flex justify-between py-3">
                <dt class="text-sm font-medium text-gray-500">Full Name</dt>
                <dd class="text-sm font-semibold text-gray-800"><%= fullName %></dd>
            </div>
            <div class="flex justify-between py-3">
                <dt class="text-sm font-medium text-gray-500">Password</dt>
                <dd class="text-sm font-semibold text-gray-800"><%= password %></dd>
            </div>
            <div class="flex justify-between py-3">
                <dt class="text-sm font-medium text-gray-500">Age</dt>
                <dd class="text-sm font-semibold text-gray-800"><%= age %></dd>
            </div>
            <div class="flex justify-between py-3">
                <dt class="text-sm font-medium text-gray-500">Address (radio)</dt>
                <dd class="text-sm font-semibold text-gray-800"><%= addressRadio %></dd>
            </div>
            <div class="flex justify-between py-3">
                <dt class="text-sm font-medium text-gray-500">Address (select)</dt>
                <dd class="text-sm font-semibold text-gray-800"><%= addressSelect %></dd>
            </div>
        </dl>

        <%-- Back to the form --%>
        <a href="form.jsp"
           class="block w-full text-center bg-blue-600 text-white font-semibold py-2.5 rounded-lg
                  hover:bg-blue-700 transition">
            &larr; Back to Form
        </a>
    </div>

</body>
</html>