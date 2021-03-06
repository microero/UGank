package me.bakumon.ugank.entity;

import java.util.List;

/**
 * CategoryResult
 *
 * @author bakumon
 * @date 2016/12/8
 */
public class CategoryResult {

    public boolean error;
    public List<ResultsBean> results;
    public List<ResultsBean> results1;

    public static class ResultsBean {

        public String _id;
        public String createdAt;
        public String desc;
        public String publishedAt;
        public String source;
        public String type;
        public String url;
        public boolean used;
        public String who;
        public List<String> images;
    }
}
