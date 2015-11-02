[#ftl ]
[#list articles as article]
    ${article.id},
    ${article.title},
    ${article.content}
    <br />
[/#list]