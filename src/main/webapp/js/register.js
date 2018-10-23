function submit() {

    var sexTemp = $('input:radio[name="sex"]:checked');

    if ($.trim($("[name=username]").val()) == '') {
        alert('用户名不能为空！');
        return;
    }

    if ($.trim($("[name=password]").val()) == '') {
        alert('密码不能为空！');
        return;
    }

    if ($.trim($("[name=password]").val()).length < 6) {
        alert('密码不能小于6位！');
        return;
    }

    if ($.trim($("[name=telphone]")) == '') {
        alert('手机号码不能为空！');
        return;
    }

    if ($.trim($("[name=telphone]").val()).length != 11) {
        alert('手机号码格式错误！');
        return;
    }

    var jsonString = toJson("MSG_REGISTER_REQ",
        "v1.0.0",
        $("[name=username]"),
        $("[name=password]"),
        $("[name=nickname]"),
        sexTemp,
        $("[name=telphone]"),
        $("[name=email]")
    );

    $.ajax({
            url: "/gourdjyaoweb/register",
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
                                    alert("注册成功！");
                                    $(location).attr('href', '/gourdjyaoweb');
                                } else {
                                    alert("注册失败！");
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

function reset() {
    $("[name=username]").val('');
    $("[name=password]").val('');
    $("[name=nickname]").val('');
    $("[name=telphone]").val('');
    $("[name=email]").val('');
    $('input:radio[name=sex]').get(0).checked = true;
}