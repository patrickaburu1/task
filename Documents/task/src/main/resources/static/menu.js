$(".checkMenu").change(function () {

    var id= this.id;

    console.log(id);

    $.ajax({
        type: "GET",
        url: "/choices/"+id,
        success: function (json) {
            console.log("data  "+json);

            var data=json;
            for (var i = 0; i < json.length; i++) {
                console.log(data[i].name);

                $(id).append("<input type=\"checkbox\" class=\"form-check-input checkMenu\" th:id="+data[i].name+" th:value="+data[i].name+">");

            }


        },
        error: function (data) {
            console.log("error");
        }
    });
})