package com.linfd.scri.disinfectrobot.entity;

import java.util.List;

/*
* 异常代码
*
* "id":"xxx",//本机uuid
"to_id":"xxx",//目标uuid
"type":"exception_codes",//
"codes":[10010,.......]//异常代码
* */
public class ExceptionCodesCallbackEntity extends TypeEntity {

    /**
     * id : xxx
     * to_id : xxx
     * codes : [10010,20000]
     */

    private String id;
    private String to_id;
    private List<Integer> codes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTo_id() {
        return to_id;
    }

    public void setTo_id(String to_id) {
        this.to_id = to_id;
    }

    public List<Integer> getCodes() {
        return codes;
    }

    public void setCodes(List<Integer> codes) {
        this.codes = codes;
    }
}
