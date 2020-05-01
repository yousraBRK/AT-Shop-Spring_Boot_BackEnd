package com.yousra.Entity;

public class ReturnedObject <T>{

    private T obejct;
    private boolean success;
    private String msg;

    public ReturnedObject(T obejct, boolean success, String msg) {
        this.obejct = obejct;
        this.success = success;
        this.msg = msg;
    }

    public T getObejct() {
        return obejct;
    }

    public void setObejct(T obejct) {
        this.obejct = obejct;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
