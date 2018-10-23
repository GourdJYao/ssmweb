function toJson(messageType, version) {
    if (arguments.length > 2) {
        var contentJSON = {};
        for (i = 2; i < arguments.length; i++) {
            if(arguments[i].val()==null||arguments[i].val().trim()==''){
                continue;
            }
            nameString = arguments[i].attr("name") ;
            contentJSON[nameString] = arguments[i].val();
        }
        var json = {
            "version": version,
            "messageType": messageType,
        };
        json["data"] = contentJSON;
        return json;
    } else {
        var json = {
            "version": version,
            "messageType": messageType,
            "data": {}
        };
        return json;
    }
}