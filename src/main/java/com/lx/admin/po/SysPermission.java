package com.lx.admin.po;

public class SysPermission {
    private Long perid;

    private String pername;

    private String type;

    private String url;

    private String percode;

    private String available;

    public Long getPerid() {
        return perid;
    }

    public void setPerid(Long perid) {
        this.perid = perid;
    }

    public String getPername() {
        return pername;
    }

    public void setPername(String pername) {
        this.pername = pername == null ? null : pername.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getPercode() {
        return percode;
    }

    public void setPercode(String percode) {
        this.percode = percode == null ? null : percode.trim();
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available == null ? null : available.trim();
    }
}