function savebusinfo() {
    var jsonString = toJson("MSG_SAVE_BUSLINE_REQ",
        "v1.0.0",
        $("[name=busname]"),
        $("[name=originname]"),
        $("[name=originlat]"),
        $("[name=originlon]"),
        $("[name=destinationname]"),
        $("[name=destinationlat]"),
        $("[name=destinationlon]")
    );
    alert(JSON.stringify(jsonString));
    $.ajax({
            url:"/gourdjyaoweb/bus/savebuslineinfo",
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
                                    alert("增加成功！");
                                    $(location).attr('href', '/gourdjyaoweb/bus/bus_info.html');
                                } else {
                                    alert("增加失败！");
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