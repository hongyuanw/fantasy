[#ftl ]
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>fantasy</title>
    <link href="http://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
    <link href="/static/css/navbar.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                        aria-expanded="false" aria-controls="navbar">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="/">Fantasy</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="/">Home</a></li>
                </ul>
            </div>
            <!--/.nav-collapse -->
        </div>
        <!--/.container-fluid -->
    </nav>
    <table class="table table-bordered">
        <thead>
        <tr>
            <th>Id</th>
            <th>Title</th>
            <th>Description</th>
        </tr>
        </thead>
        <tbody>
        [#list filmDtos.items as film]
        <tr>
            <td>${film.filmId}</td>
            <td>${film.title}</td>
            <td>${film.description}</td>
        </tr>
        [/#list]
        </tbody>
    </table>
    <nav>
        <ul class="pagination">
            [#if filmDtos.pageNum==1]
                <li class="disabled"><a href="" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
            [#else ]
                <li><a href="${urlWithoutPaging}/pagenum/${filmDtos.pageNum-1}" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
            [/#if]
            [#list 1..filmDtos.pageCount as num]
                [#if num==filmDtos.pageNum]
                    <li class="active"><a href="${urlWithoutPaging}/pagenum/${num}">${num} <span class="sr-only">(current)</span></a></li>
                [#else]
                    <li><a href="${urlWithoutPaging}/pagenum/${num}">${num} </a></li>
                [/#if]
            [/#list]
            [#if filmDtos.pageNum==filmDtos.pageCount]
                <li class="disabled"><a href="" aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li>
            [#else ]
                <li><a href="${urlWithoutPaging}/pagenum/${filmDtos.pageNum+1}" aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li>
            [/#if]
        </ul>
    </nav>
    powered by ${domain}
</div>
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>