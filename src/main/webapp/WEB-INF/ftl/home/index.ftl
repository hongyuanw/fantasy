[#ftl ]
[#list films as film]
    ${film.filmId},
    ${film.title},
    ${film.description}
    <br />
[/#list]

powered by ${domain}