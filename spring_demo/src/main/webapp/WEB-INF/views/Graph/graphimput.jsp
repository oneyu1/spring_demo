<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Spring-MVCデータモデルのバインドサンプル</title>
<meta charset="UTF-8" />
</head>

<body>
<form action="./promenaderes.xhtml" method="post">
<table>
    <tr>
        <td>
            あなたのお名前は？　<input type="text" name="myname" size="40" />
        </td>
    </tr>
    <tr>
        <td>
            あなたの年齢は？　<input type="text" name="age" size="10" maxlength="3"/>
        </td>
    </tr>
    <tr>
        <td>
            あなたの都道府県は？　<input type="text" name="pref" size="40" />
        </td>
    </tr>
    <tr>
        <td>
            あなたの電話番号は？　<input type="text" name="phone" size="40" />
        </td>
    </tr>
    <tr>
        <td>
            <input type="submit" value="回答しちゃるけん" />
        </td>
    </tr>
</table>
</form>

</body>
</html>