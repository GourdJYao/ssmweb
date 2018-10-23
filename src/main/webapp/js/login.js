function login() {
    if ($.trim($("[name=username]").val()) == '') {
        alert("用户名不能为空~");
        return;
    }
    if ($.trim($("[name=password]").val()) == '') {
        alert("密码不能为空~");
        return;
    }
    var jsonString = toJson("MSG_LOGIN_REQ",
        "v1.0.0",
        $("[name=username]"),
        $("[name=password]")
    );
    alert(JSON.stringify(jsonString));
    $.ajax({
            url:"/gourdjyaoweb/login",
            type: "POST",
            datatype: "json",
            contentType: "application/json; charset=utf-8",
            data: JSON.stringify(jsonString),
            success: function (data, stats) {
                if (stats == "success") {
                    //   window.location.href="/yc"
                    $.each(data, function (idx, item) {
                        if (idx != "data") {
                            return true;
                        }
                        if (item != null) {
                            $.each(item, function (idy, tempitems) {
                                if (idy != "resultCode") {
                                    return true;
                                }
                                if (tempitems != null && tempitems == 0) {
                                    alert("登录成功！");
                                    $(location).attr('href', '/gourdjyaoweb');
                                } else {
                                    alert("登录失败！");
                                }
                            });
                        }
                    });
                }
            },
            error: function (data) {
                alert(data);
                alert("请求失败");
            }
        }
    );
}