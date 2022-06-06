<!DOCTYPE html>
<html>
    <head>
        <%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
        <title>성장통</title>
        <link href="/growth_prediction/css/style.css" rel="stylesheet" type="text/css">
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <!-- jQuery는
        1. 엘리먼트를 선택할 수 있는 강력한 방법
        2. 선택된 엘리먼트를 효율적으로 제어할 수 있는 방법
        
        $(#id)
        $(.class)
        $(h1.class)
        $(h1.classone.classtwo.#idone#idtwo )
        -->
    </head>

    <body>
        <section class="login-form">
            <h1>골연령 검사</h1>
            <form action="">
                <div class="int-area">
                    <input type="text" name="id" id="id"
                    autocomplete="off" required>
                    <label for="id">USER NAME</label>
                </div>

                <div class="int-area">
                    <input type="password" name="pw" id="pw"
                    autocomplete="off" required>
                    <label for="pw">PASSWORD</label>
                </div>

                <div class="btn-area">
                    <button id="btn" type="submit">LOGIN</button>
                </div>
            </form>

            <div class="caption">
                <a href="">Forgot Password</a>
            </div>
        </section> 

        <script src="/growth_prediction/js/jscript.js" type="text/javascript"></script>


    </body>
</html>