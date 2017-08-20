package com.intive.pageObjects.base;

public class Page {

    private String url;

    protected Page(String url) {
        this.url = url;
    }

    protected <M> M map(Class<M> clazz) {
        M map = null;
        try {
            map = clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return map;
    }

    public <P> P loadPage(Class<P> clazz) {
        P page = null;
        try {
            page = clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return page;
    }
}
