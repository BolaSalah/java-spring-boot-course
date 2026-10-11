<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Form</title>
<script src="https://cdn.tailwindcss.com"></script> <%-- Tailwind css --%>
</head>
<body class="bg-gradient-to-br from-blue-100 to-indigo-200 flex justify-center items-center min-h-screen p-4">

    <form method="post" action="result.jsp"
          class="bg-white p-8 rounded-2xl shadow-xl w-full max-w-md space-y-5">

        <h1 class="text-2xl font-bold text-center text-gray-800">Registration</h1>

        <%-- Full name --%>
        <div>
            <label for="fullName" class="block text-sm font-medium text-gray-700 mb-1">Full Name</label>
            <input type="text" id="fullName" name="fullName" placeholder="Enter your full name" required
                   class="w-full border border-gray-300 rounded-lg px-3 py-2 outline-none
                          focus:ring-2 focus:ring-blue-500 focus:border-blue-500" />
        </div>

        <%-- Password --%>
        <div>
            <label for="password" class="block text-sm font-medium text-gray-700 mb-1">Password</label>
            <input type="text" id="password" name="password" placeholder="Enter your password" required
                   class="w-full border border-gray-300 rounded-lg px-3 py-2 outline-none
                          focus:ring-2 focus:ring-blue-500 focus:border-blue-500" />
        </div>

        <%-- Age --%>
        <div>
            <label for="age" class="block text-sm font-medium text-gray-700 mb-1">Age</label>
            <input type="text" id="age" name="age" placeholder="Enter your age" required
                   class="w-full border border-gray-300 rounded-lg px-3 py-2 outline-none
                          focus:ring-2 focus:ring-blue-500 focus:border-blue-500" />
        </div>

        <hr class="border-gray-200" />

        <%-- Address (radio) --%>
        <fieldset>
            <legend class="block text-sm font-medium text-gray-700 mb-2">Choose Your Address (radio)</legend>
            <div class="flex gap-6">
                <label class="flex items-center gap-2 cursor-pointer">
                    <input type="radio" name="addressRadio" value="cairo" required class="accent-blue-600" /> cairo
                </label>
                <label class="flex items-center gap-2 cursor-pointer">
                    <input type="radio" name="addressRadio" value="alex" class="accent-blue-600" /> alex
                </label>
                <label class="flex items-center gap-2 cursor-pointer">
                    <input type="radio" name="addressRadio" value="menofia" class="accent-blue-600" /> menofia
                </label>
            </div>
        </fieldset>

        <hr class="border-gray-200" />

        <%-- Address (select) --%>
        <div>
            <label for="addressSelect" class="block text-sm font-medium text-gray-700 mb-1">Choose Your Address (select)</label>
            <select id="addressSelect" name="addressSelect" required
                    class="w-full border border-gray-300 rounded-lg px-3 py-2 outline-none bg-white
                           focus:ring-2 focus:ring-blue-500 focus:border-blue-500">
                <option value="" disabled selected>-- Select --</option>
                <option value="cairo">cairo</option>
                <option value="alex">alex</option>
                <option value="menofia">menofia</option>
            </select>
        </div>

        <input type="submit" value="Send"
               class="w-full bg-blue-600 text-white font-semibold py-2.5 rounded-lg cursor-pointer
                      hover:bg-blue-700 transition" />
    </form>
</body>
</html>