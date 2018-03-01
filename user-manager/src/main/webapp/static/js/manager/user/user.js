/**
 * Created by xuzhuo on 2018/3/1.
 */
$(document).ready(function () {
    var tableBody = $("#userTable tbody");
    $.post("/user/userList", {}, function (data) {
        for (var i = 0; i < data.length; i++) {
            tableBody.append("<tr><td>" + data[i].id + "</td><td>" + data[i].loginName + "</td><td>" + data[i].userName + "</td></tr>");
        }
    })
});