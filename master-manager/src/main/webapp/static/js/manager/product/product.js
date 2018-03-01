/**
 * Created by xuzhuo on 2018/3/1.
 */
$(document).ready(function () {
    var tableBody = $("#productTable tbody");
    $.post("/product/productList", {}, function (data) {
        for (var i = 0; i < data.length; i++) {
            tableBody.append("<tr><td>" + data[i].id + "</td><td>" + data[i].productName + "</td></tr>");
        }
    })
});