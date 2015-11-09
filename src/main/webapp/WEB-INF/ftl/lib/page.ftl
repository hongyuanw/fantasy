[#ftl ]
[#macro genPage pageNum pageCount urlWithoutPaging]
    [#if pageNum==1]
    <li class="disabled"><a aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
    [#else ]
    <li><a href="${urlWithoutPaging}/pagenum/${pageNum-1}" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
    [/#if]

    [#--show 10 page links one line--]
    [#assign startPage=(pageNum / 10)?int * 10 +1]
    [#assign endPage=(pageNum / 10)?int * 10 +10]
    [#if pageNum%10 == 0]
        [#assign startPage = startPage-10]
        [#assign endPage = endPage-10]
    [/#if]
    [#if endPage > pageCount]
        [#assign endPage=pageCount]
    [/#if]
    [#if startPage > endPage]
        [#assign startPage=endPage]
    [/#if]
    [#list startPage..endPage as num]
        [#if num==pageNum]
        <li class="active"><a href="${urlWithoutPaging}/pagenum/${num}">${num} <span class="sr-only">(current)</span></a></li>
        [#else]
        <li><a href="${urlWithoutPaging}/pagenum/${num}">${num} </a></li>
        [/#if]
    [/#list]
    [#if pageNum==pageCount]
    <li class="disabled"><a aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li>
    [#else ]
    <li><a href="${urlWithoutPaging}/pagenum/${pageNum+1}" aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li>
    [/#if]
[/#macro]