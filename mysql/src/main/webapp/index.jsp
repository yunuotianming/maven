<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <style>
        /*div {
            width: 100px;
            height: 100px;
            border: 2px solid red;
            padding: 20px;
            margin: 30px;
        }*/
        /* 最常用的清除所有的元素的内外边距, */
        * {
            margin: 0;
            padding: 0;  /*清除内外边距*/
        }
        body {
            /* 整体html背景颜色,很浅的灰色 */
            background-color: #eee;
        }
        .article {
            width: 380px;
            height: 263px;
            border: 1px solid #ccc;
            /* 外边距 上右下左都是100px */
            margin: 100px;
            padding: 20px 15px 0;  /*上 20  左右  15  下  0*/
        }
        .article h4 {
            color: #202026;
            font-size: 20px;
            border-bottom: 1px solid #ccc;
            /* 让标题下面的实线(下边框)靠下一点,避免靠太近粘在一起 */
            padding-bottom: 5px;
            /*margin-bottom: 12px;*/
        }
        li {
            /* li前面的小点比较难看,取消掉 */
            list-style: none;   /*取消li 前面的小点*/
        }
        .article ul li {
            height: 38px;
            /* line-height 和 height 保持一致,以便li中内容垂直居中 */
            line-height: 38px;
            border-bottom: 1px dashed #ccc; /* 1像素的虚线边框*/
            /* 首行缩进,也可以用padding做 */
            text-indent: 2em;
        }
        .article  a  {
            font-size: 12px;
            color: #333;
            text-decoration: none;
        }
        .article a:hover {
            text-decoration: underline;  /*添加下划线*/
        }
        .article ul {
            /* 使得 ul 和 h4的之间间隔12px */
            margin-top: 12px;
        }
    </style>
</head>
<body>
<div class="article">
    <h4>最新文章/New Articles</h4>
    <ul>
        <li><a href="#">北京招聘网页设计，平面设计，php</a></li>
        <li><a href="#">体验javascript的魅力</a></li>
        <li><a href="#">jquery世界来临</a></li>
        <li><a href="#">网页设计师的梦想</a></li>
        <li><a href="#">jquery中的链式编程是什么</a></li>
    </ul>
</div>
</body>
</html>
