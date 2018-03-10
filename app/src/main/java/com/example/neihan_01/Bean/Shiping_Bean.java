package com.example.neihan_01.Bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Shiping_Bean {

    /**
     * comments : []
     * display_time : 1515554803
     * group : {"360p_video":{"height":848,"uri":"360p/a363dafbd6394a34bd989f1843fb4178","url_list":[{"url":"http://ic.snssdk.com/neihan/video/playback/?video_id=a363dafbd6394a34bd989f1843fb4178&quality=360p&line=0&is_gif=0&device_platform="},{"url":"http://ic.snssdk.com/neihan/video/playback/?video_id=a363dafbd6394a34bd989f1843fb4178&quality=360p&line=1&is_gif=0&device_platform="}],"width":480},"480p_video":{"height":848,"uri":"480p/a363dafbd6394a34bd989f1843fb4178","url_list":[{"url":"http://ic.snssdk.com/neihan/video/playback/?video_id=a363dafbd6394a34bd989f1843fb4178&quality=480p&line=0&is_gif=0&device_platform="},{"url":"http://ic.snssdk.com/neihan/video/playback/?video_id=a363dafbd6394a34bd989f1843fb4178&quality=480p&line=1&is_gif=0&device_platform="}],"width":480},"720p_video":{"height":848,"uri":"720p/a363dafbd6394a34bd989f1843fb4178","url_list":[{"url":"http://ic.snssdk.com/neihan/video/playback/?video_id=a363dafbd6394a34bd989f1843fb4178&quality=720p&line=0&is_gif=0&device_platform="},{"url":"http://ic.snssdk.com/neihan/video/playback/?video_id=a363dafbd6394a34bd989f1843fb4178&quality=720p&line=1&is_gif=0&device_platform="}],"width":480},"activity":{},"allow_dislike":true,"bury_count":3,"category_activity_end_time":1506355200,"category_activity_schema_url":"","category_activity_start_time":1506222300,"category_activity_text":"赶紧来参加活动领红包吧","category_id":65,"category_is_activity":0,"category_name":"搞笑视频","category_show_ranking":0,"category_type":1,"category_visible":true,"comment_count":11,"content":"段友们，那个来什么用的！！！","cover_image_uri":"565a0002a46c9f07f02a","cover_image_url":"","create_time":1515525382,"danmaku_attrs":{"allow_send_danmaku":1,"allow_show_danmaku":1},"digg_count":73,"dislike_reason":[{"id":65,"title":"吧:搞笑视频","type":2},{"id":0,"title":"内容重复","type":4},{"id":5003276422,"title":"作者:大笨贱人","type":3}],"display_type":0,"download_url":"http://ic.snssdk.com/neihan/video/playback/?video_id=a363dafbd6394a34bd989f1843fb4178&quality=360p&line=0&is_gif=0&device_platform=&down_type=in","duration":10.12,"favorite_count":0,"flash_url":"","go_detail_count":671,"group_id":85187795279,"has_comments":0,"has_hot_comments":0,"id":85187795279,"id_str":"85187795279","is_anonymous":false,"is_can_share":1,"is_public_url":1,"is_video":1,"keywords":"","label":1,"large_cover":{"uri":"large/565a0002a46c9f07f02a","url_list":[{"url":"http://p3.pstatp.com/large/565a0002a46c9f07f02a"},{"url":"http://pb9.pstatp.com/large/565a0002a46c9f07f02a"},{"url":"http://pb1.pstatp.com/large/565a0002a46c9f07f02a"}]},"m3u8_url":"","media_type":3,"medium_cover":{"uri":"medium/565a0002a46c9f07f02a","url_list":[{"url":"http://p3.pstatp.com/w202/565a0002a46c9f07f02a"},{"url":"http://pb9.pstatp.com/w202/565a0002a46c9f07f02a"},{"url":"http://pb1.pstatp.com/w202/565a0002a46c9f07f02a"}]},"mp4_url":"http://ic.snssdk.com/neihan/video/playback/?video_id=a363dafbd6394a34bd989f1843fb4178&quality=480p&line=0&is_gif=0&device_platform=.mp4","online_time":1515525382,"origin_video":{"height":848,"uri":"origin/a363dafbd6394a34bd989f1843fb4178","url_list":[{"url":"http://ic.snssdk.com/neihan/video/playback/?video_id=a363dafbd6394a34bd989f1843fb4178&quality=origin&line=0&is_gif=0&device_platform="},{"url":"http://ic.snssdk.com/neihan/video/playback/?video_id=a363dafbd6394a34bd989f1843fb4178&quality=origin&line=1&is_gif=0&device_platform="}],"width":480},"play_count":6548,"publish_time":"","repin_count":0,"share_count":1,"share_type":0,"share_url":"http://m.neihanshequ.com/share/group/85187795279/?iid=0&app=joke_essay","status":112,"status_desc":"热门投稿","text":"段友们，那个来什么用的！！！","title":"","type":2,"uri":"a363dafbd6394a34bd989f1843fb4178","user":{"avatar_url":"http://p3.pstatp.com/medium/4ace001331d3150c64ee","followers":72,"followings":0,"is_following":false,"is_living":false,"is_pro_user":false,"medals":[{"count":7,"icon_url":"http://p1.pstatp.com/obj/3b6700087870735f5dcb","name":"hot_content","small_icon_url":"http://p1.pstatp.com/obj/3b22000b1e315df24be0"}],"name":"大笨贱人","ugc_count":65,"user_id":5003276422,"user_verified":false},"user_bury":0,"user_digg":0,"user_favorite":0,"user_repin":0,"video_height":848,"video_id":"a363dafbd6394a34bd989f1843fb4178","video_wh_ratio":1,"video_width":480}
     * online_time : 1515554803
     * type : 1
     */

    private int display_time;
    private GroupBean group;
    private int online_time;
    private int type;
    private List<?> comments;

    public int getDisplay_time() {
        return display_time;
    }

    public void setDisplay_time(int display_time) {
        this.display_time = display_time;
    }

    public GroupBean getGroup() {
        return group;
    }

    public void setGroup(GroupBean group) {
        this.group = group;
    }

    public int getOnline_time() {
        return online_time;
    }

    public void setOnline_time(int online_time) {
        this.online_time = online_time;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<?> getComments() {
        return comments;
    }

    public void setComments(List<?> comments) {
        this.comments = comments;
    }

    public static class GroupBean {
        /**
         * 360p_video : {"height":848,"uri":"360p/a363dafbd6394a34bd989f1843fb4178","url_list":[{"url":"http://ic.snssdk.com/neihan/video/playback/?video_id=a363dafbd6394a34bd989f1843fb4178&quality=360p&line=0&is_gif=0&device_platform="},{"url":"http://ic.snssdk.com/neihan/video/playback/?video_id=a363dafbd6394a34bd989f1843fb4178&quality=360p&line=1&is_gif=0&device_platform="}],"width":480}
         * 480p_video : {"height":848,"uri":"480p/a363dafbd6394a34bd989f1843fb4178","url_list":[{"url":"http://ic.snssdk.com/neihan/video/playback/?video_id=a363dafbd6394a34bd989f1843fb4178&quality=480p&line=0&is_gif=0&device_platform="},{"url":"http://ic.snssdk.com/neihan/video/playback/?video_id=a363dafbd6394a34bd989f1843fb4178&quality=480p&line=1&is_gif=0&device_platform="}],"width":480}
         * 720p_video : {"height":848,"uri":"720p/a363dafbd6394a34bd989f1843fb4178","url_list":[{"url":"http://ic.snssdk.com/neihan/video/playback/?video_id=a363dafbd6394a34bd989f1843fb4178&quality=720p&line=0&is_gif=0&device_platform="},{"url":"http://ic.snssdk.com/neihan/video/playback/?video_id=a363dafbd6394a34bd989f1843fb4178&quality=720p&line=1&is_gif=0&device_platform="}],"width":480}
         * activity : {}
         * allow_dislike : true
         * bury_count : 3
         * category_activity_end_time : 1506355200
         * category_activity_schema_url :
         * category_activity_start_time : 1506222300
         * category_activity_text : 赶紧来参加活动领红包吧
         * category_id : 65
         * category_is_activity : 0
         * category_name : 搞笑视频
         * category_show_ranking : 0
         * category_type : 1
         * category_visible : true
         * comment_count : 11
         * content : 段友们，那个来什么用的！！！
         * cover_image_uri : 565a0002a46c9f07f02a
         * cover_image_url :
         * create_time : 1515525382
         * danmaku_attrs : {"allow_send_danmaku":1,"allow_show_danmaku":1}
         * digg_count : 73
         * dislike_reason : [{"id":65,"title":"吧:搞笑视频","type":2},{"id":0,"title":"内容重复","type":4},{"id":5003276422,"title":"作者:大笨贱人","type":3}]
         * display_type : 0
         * download_url : http://ic.snssdk.com/neihan/video/playback/?video_id=a363dafbd6394a34bd989f1843fb4178&quality=360p&line=0&is_gif=0&device_platform=&down_type=in
         * duration : 10.12
         * favorite_count : 0
         * flash_url :
         * go_detail_count : 671
         * group_id : 85187795279
         * has_comments : 0
         * has_hot_comments : 0
         * id : 85187795279
         * id_str : 85187795279
         * is_anonymous : false
         * is_can_share : 1
         * is_public_url : 1
         * is_video : 1
         * keywords :
         * label : 1
         * large_cover : {"uri":"large/565a0002a46c9f07f02a","url_list":[{"url":"http://p3.pstatp.com/large/565a0002a46c9f07f02a"},{"url":"http://pb9.pstatp.com/large/565a0002a46c9f07f02a"},{"url":"http://pb1.pstatp.com/large/565a0002a46c9f07f02a"}]}
         * m3u8_url :
         * media_type : 3
         * medium_cover : {"uri":"medium/565a0002a46c9f07f02a","url_list":[{"url":"http://p3.pstatp.com/w202/565a0002a46c9f07f02a"},{"url":"http://pb9.pstatp.com/w202/565a0002a46c9f07f02a"},{"url":"http://pb1.pstatp.com/w202/565a0002a46c9f07f02a"}]}
         * mp4_url : http://ic.snssdk.com/neihan/video/playback/?video_id=a363dafbd6394a34bd989f1843fb4178&quality=480p&line=0&is_gif=0&device_platform=.mp4
         * online_time : 1515525382
         * origin_video : {"height":848,"uri":"origin/a363dafbd6394a34bd989f1843fb4178","url_list":[{"url":"http://ic.snssdk.com/neihan/video/playback/?video_id=a363dafbd6394a34bd989f1843fb4178&quality=origin&line=0&is_gif=0&device_platform="},{"url":"http://ic.snssdk.com/neihan/video/playback/?video_id=a363dafbd6394a34bd989f1843fb4178&quality=origin&line=1&is_gif=0&device_platform="}],"width":480}
         * play_count : 6548
         * publish_time :
         * repin_count : 0
         * share_count : 1
         * share_type : 0
         * share_url : http://m.neihanshequ.com/share/group/85187795279/?iid=0&app=joke_essay
         * status : 112
         * status_desc : 热门投稿
         * text : 段友们，那个来什么用的！！！
         * title :
         * type : 2
         * uri : a363dafbd6394a34bd989f1843fb4178
         * user : {"avatar_url":"http://p3.pstatp.com/medium/4ace001331d3150c64ee","followers":72,"followings":0,"is_following":false,"is_living":false,"is_pro_user":false,"medals":[{"count":7,"icon_url":"http://p1.pstatp.com/obj/3b6700087870735f5dcb","name":"hot_content","small_icon_url":"http://p1.pstatp.com/obj/3b22000b1e315df24be0"}],"name":"大笨贱人","ugc_count":65,"user_id":5003276422,"user_verified":false}
         * user_bury : 0
         * user_digg : 0
         * user_favorite : 0
         * user_repin : 0
         * video_height : 848
         * video_id : a363dafbd6394a34bd989f1843fb4178
         * video_wh_ratio : 1
         * video_width : 480
         */

        @SerializedName("360p_video")
        private _$360pVideoBean _$360p_video;
        @SerializedName("480p_video")
        private _$480pVideoBean _$480p_video;
        @SerializedName("720p_video")
        private _$720pVideoBean _$720p_video;
        private ActivityBean activity;
        private boolean allow_dislike;
        private int bury_count;
        private int category_activity_end_time;
        private String category_activity_schema_url;
        private int category_activity_start_time;
        private String category_activity_text;
        private int category_id;
        private int category_is_activity;
        private String category_name;
        private int category_show_ranking;
        private int category_type;
        private boolean category_visible;
        private int comment_count;
        private String content;
        private String cover_image_uri;
        private String cover_image_url;
        private int create_time;
        private DanmakuAttrsBean danmaku_attrs;
        private int digg_count;
        private int display_type;
        private String download_url;
        private double duration;
        private int favorite_count;
        private String flash_url;
        private int go_detail_count;
        private long group_id;
        private int has_comments;
        private int has_hot_comments;
        private long id;
        private String id_str;
        private boolean is_anonymous;
        private int is_can_share;
        private int is_public_url;
        private int is_video;
        private String keywords;
        private int label;
        private LargeCoverBean large_cover;
        private String m3u8_url;
        private int media_type;
        private MediumCoverBean medium_cover;
        private String mp4_url;
        private int online_time;
        private OriginVideoBean origin_video;
        private int play_count;
        private String publish_time;
        private int repin_count;
        private int share_count;
        private int share_type;
        private String share_url;
        private int status;
        private String status_desc;
        private String text;
        private String title;
        private int type;
        private String uri;
        private UserBean user;
        private int user_bury;
        private int user_digg;
        private int user_favorite;
        private int user_repin;
        private int video_height;
        private String video_id;
        private int video_wh_ratio;
        private int video_width;
        private List<DislikeReasonBean> dislike_reason;

        public _$360pVideoBean get_$360p_video() {
            return _$360p_video;
        }

        public void set_$360p_video(_$360pVideoBean _$360p_video) {
            this._$360p_video = _$360p_video;
        }

        public _$480pVideoBean get_$480p_video() {
            return _$480p_video;
        }

        public void set_$480p_video(_$480pVideoBean _$480p_video) {
            this._$480p_video = _$480p_video;
        }

        public _$720pVideoBean get_$720p_video() {
            return _$720p_video;
        }

        public void set_$720p_video(_$720pVideoBean _$720p_video) {
            this._$720p_video = _$720p_video;
        }

        public ActivityBean getActivity() {
            return activity;
        }

        public void setActivity(ActivityBean activity) {
            this.activity = activity;
        }

        public boolean isAllow_dislike() {
            return allow_dislike;
        }

        public void setAllow_dislike(boolean allow_dislike) {
            this.allow_dislike = allow_dislike;
        }

        public int getBury_count() {
            return bury_count;
        }

        public void setBury_count(int bury_count) {
            this.bury_count = bury_count;
        }

        public int getCategory_activity_end_time() {
            return category_activity_end_time;
        }

        public void setCategory_activity_end_time(int category_activity_end_time) {
            this.category_activity_end_time = category_activity_end_time;
        }

        public String getCategory_activity_schema_url() {
            return category_activity_schema_url;
        }

        public void setCategory_activity_schema_url(String category_activity_schema_url) {
            this.category_activity_schema_url = category_activity_schema_url;
        }

        public int getCategory_activity_start_time() {
            return category_activity_start_time;
        }

        public void setCategory_activity_start_time(int category_activity_start_time) {
            this.category_activity_start_time = category_activity_start_time;
        }

        public String getCategory_activity_text() {
            return category_activity_text;
        }

        public void setCategory_activity_text(String category_activity_text) {
            this.category_activity_text = category_activity_text;
        }

        public int getCategory_id() {
            return category_id;
        }

        public void setCategory_id(int category_id) {
            this.category_id = category_id;
        }

        public int getCategory_is_activity() {
            return category_is_activity;
        }

        public void setCategory_is_activity(int category_is_activity) {
            this.category_is_activity = category_is_activity;
        }

        public String getCategory_name() {
            return category_name;
        }

        public void setCategory_name(String category_name) {
            this.category_name = category_name;
        }

        public int getCategory_show_ranking() {
            return category_show_ranking;
        }

        public void setCategory_show_ranking(int category_show_ranking) {
            this.category_show_ranking = category_show_ranking;
        }

        public int getCategory_type() {
            return category_type;
        }

        public void setCategory_type(int category_type) {
            this.category_type = category_type;
        }

        public boolean isCategory_visible() {
            return category_visible;
        }

        public void setCategory_visible(boolean category_visible) {
            this.category_visible = category_visible;
        }

        public int getComment_count() {
            return comment_count;
        }

        public void setComment_count(int comment_count) {
            this.comment_count = comment_count;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCover_image_uri() {
            return cover_image_uri;
        }

        public void setCover_image_uri(String cover_image_uri) {
            this.cover_image_uri = cover_image_uri;
        }

        public String getCover_image_url() {
            return cover_image_url;
        }

        public void setCover_image_url(String cover_image_url) {
            this.cover_image_url = cover_image_url;
        }

        public int getCreate_time() {
            return create_time;
        }

        public void setCreate_time(int create_time) {
            this.create_time = create_time;
        }

        public DanmakuAttrsBean getDanmaku_attrs() {
            return danmaku_attrs;
        }

        public void setDanmaku_attrs(DanmakuAttrsBean danmaku_attrs) {
            this.danmaku_attrs = danmaku_attrs;
        }

        public int getDigg_count() {
            return digg_count;
        }

        public void setDigg_count(int digg_count) {
            this.digg_count = digg_count;
        }

        public int getDisplay_type() {
            return display_type;
        }

        public void setDisplay_type(int display_type) {
            this.display_type = display_type;
        }

        public String getDownload_url() {
            return download_url;
        }

        public void setDownload_url(String download_url) {
            this.download_url = download_url;
        }

        public double getDuration() {
            return duration;
        }

        public void setDuration(double duration) {
            this.duration = duration;
        }

        public int getFavorite_count() {
            return favorite_count;
        }

        public void setFavorite_count(int favorite_count) {
            this.favorite_count = favorite_count;
        }

        public String getFlash_url() {
            return flash_url;
        }

        public void setFlash_url(String flash_url) {
            this.flash_url = flash_url;
        }

        public int getGo_detail_count() {
            return go_detail_count;
        }

        public void setGo_detail_count(int go_detail_count) {
            this.go_detail_count = go_detail_count;
        }

        public long getGroup_id() {
            return group_id;
        }

        public void setGroup_id(long group_id) {
            this.group_id = group_id;
        }

        public int getHas_comments() {
            return has_comments;
        }

        public void setHas_comments(int has_comments) {
            this.has_comments = has_comments;
        }

        public int getHas_hot_comments() {
            return has_hot_comments;
        }

        public void setHas_hot_comments(int has_hot_comments) {
            this.has_hot_comments = has_hot_comments;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getId_str() {
            return id_str;
        }

        public void setId_str(String id_str) {
            this.id_str = id_str;
        }

        public boolean isIs_anonymous() {
            return is_anonymous;
        }

        public void setIs_anonymous(boolean is_anonymous) {
            this.is_anonymous = is_anonymous;
        }

        public int getIs_can_share() {
            return is_can_share;
        }

        public void setIs_can_share(int is_can_share) {
            this.is_can_share = is_can_share;
        }

        public int getIs_public_url() {
            return is_public_url;
        }

        public void setIs_public_url(int is_public_url) {
            this.is_public_url = is_public_url;
        }

        public int getIs_video() {
            return is_video;
        }

        public void setIs_video(int is_video) {
            this.is_video = is_video;
        }

        public String getKeywords() {
            return keywords;
        }

        public void setKeywords(String keywords) {
            this.keywords = keywords;
        }

        public int getLabel() {
            return label;
        }

        public void setLabel(int label) {
            this.label = label;
        }

        public LargeCoverBean getLarge_cover() {
            return large_cover;
        }

        public void setLarge_cover(LargeCoverBean large_cover) {
            this.large_cover = large_cover;
        }

        public String getM3u8_url() {
            return m3u8_url;
        }

        public void setM3u8_url(String m3u8_url) {
            this.m3u8_url = m3u8_url;
        }

        public int getMedia_type() {
            return media_type;
        }

        public void setMedia_type(int media_type) {
            this.media_type = media_type;
        }

        public MediumCoverBean getMedium_cover() {
            return medium_cover;
        }

        public void setMedium_cover(MediumCoverBean medium_cover) {
            this.medium_cover = medium_cover;
        }

        public String getMp4_url() {
            return mp4_url;
        }

        public void setMp4_url(String mp4_url) {
            this.mp4_url = mp4_url;
        }

        public int getOnline_time() {
            return online_time;
        }

        public void setOnline_time(int online_time) {
            this.online_time = online_time;
        }

        public OriginVideoBean getOrigin_video() {
            return origin_video;
        }

        public void setOrigin_video(OriginVideoBean origin_video) {
            this.origin_video = origin_video;
        }

        public int getPlay_count() {
            return play_count;
        }

        public void setPlay_count(int play_count) {
            this.play_count = play_count;
        }

        public String getPublish_time() {
            return publish_time;
        }

        public void setPublish_time(String publish_time) {
            this.publish_time = publish_time;
        }

        public int getRepin_count() {
            return repin_count;
        }

        public void setRepin_count(int repin_count) {
            this.repin_count = repin_count;
        }

        public int getShare_count() {
            return share_count;
        }

        public void setShare_count(int share_count) {
            this.share_count = share_count;
        }

        public int getShare_type() {
            return share_type;
        }

        public void setShare_type(int share_type) {
            this.share_type = share_type;
        }

        public String getShare_url() {
            return share_url;
        }

        public void setShare_url(String share_url) {
            this.share_url = share_url;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getStatus_desc() {
            return status_desc;
        }

        public void setStatus_desc(String status_desc) {
            this.status_desc = status_desc;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getUri() {
            return uri;
        }

        public void setUri(String uri) {
            this.uri = uri;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public int getUser_bury() {
            return user_bury;
        }

        public void setUser_bury(int user_bury) {
            this.user_bury = user_bury;
        }

        public int getUser_digg() {
            return user_digg;
        }

        public void setUser_digg(int user_digg) {
            this.user_digg = user_digg;
        }

        public int getUser_favorite() {
            return user_favorite;
        }

        public void setUser_favorite(int user_favorite) {
            this.user_favorite = user_favorite;
        }

        public int getUser_repin() {
            return user_repin;
        }

        public void setUser_repin(int user_repin) {
            this.user_repin = user_repin;
        }

        public int getVideo_height() {
            return video_height;
        }

        public void setVideo_height(int video_height) {
            this.video_height = video_height;
        }

        public String getVideo_id() {
            return video_id;
        }

        public void setVideo_id(String video_id) {
            this.video_id = video_id;
        }

        public int getVideo_wh_ratio() {
            return video_wh_ratio;
        }

        public void setVideo_wh_ratio(int video_wh_ratio) {
            this.video_wh_ratio = video_wh_ratio;
        }

        public int getVideo_width() {
            return video_width;
        }

        public void setVideo_width(int video_width) {
            this.video_width = video_width;
        }

        public List<DislikeReasonBean> getDislike_reason() {
            return dislike_reason;
        }

        public void setDislike_reason(List<DislikeReasonBean> dislike_reason) {
            this.dislike_reason = dislike_reason;
        }

        public static class _$360pVideoBean {
            /**
             * height : 848
             * uri : 360p/a363dafbd6394a34bd989f1843fb4178
             * url_list : [{"url":"http://ic.snssdk.com/neihan/video/playback/?video_id=a363dafbd6394a34bd989f1843fb4178&quality=360p&line=0&is_gif=0&device_platform="},{"url":"http://ic.snssdk.com/neihan/video/playback/?video_id=a363dafbd6394a34bd989f1843fb4178&quality=360p&line=1&is_gif=0&device_platform="}]
             * width : 480
             */

            private int height;
            private String uri;
            private int width;
            private List<UrlListBean> url_list;

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getUri() {
                return uri;
            }

            public void setUri(String uri) {
                this.uri = uri;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public List<UrlListBean> getUrl_list() {
                return url_list;
            }

            public void setUrl_list(List<UrlListBean> url_list) {
                this.url_list = url_list;
            }

            public static class UrlListBean {
                /**
                 * url : http://ic.snssdk.com/neihan/video/playback/?video_id=a363dafbd6394a34bd989f1843fb4178&quality=360p&line=0&is_gif=0&device_platform=
                 */

                private String url;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }

        public static class _$480pVideoBean {
            /**
             * height : 848
             * uri : 480p/a363dafbd6394a34bd989f1843fb4178
             * url_list : [{"url":"http://ic.snssdk.com/neihan/video/playback/?video_id=a363dafbd6394a34bd989f1843fb4178&quality=480p&line=0&is_gif=0&device_platform="},{"url":"http://ic.snssdk.com/neihan/video/playback/?video_id=a363dafbd6394a34bd989f1843fb4178&quality=480p&line=1&is_gif=0&device_platform="}]
             * width : 480
             */

            private int height;
            private String uri;
            private int width;
            private List<UrlListBeanX> url_list;

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getUri() {
                return uri;
            }

            public void setUri(String uri) {
                this.uri = uri;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public List<UrlListBeanX> getUrl_list() {
                return url_list;
            }

            public void setUrl_list(List<UrlListBeanX> url_list) {
                this.url_list = url_list;
            }

            public static class UrlListBeanX {
                /**
                 * url : http://ic.snssdk.com/neihan/video/playback/?video_id=a363dafbd6394a34bd989f1843fb4178&quality=480p&line=0&is_gif=0&device_platform=
                 */

                private String url;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }

        public static class _$720pVideoBean {
            public static class UrlListBeanXX {
            }
        }

        public static class ActivityBean {
        }

        public static class DanmakuAttrsBean {
            /**
             * allow_send_danmaku : 1
             * allow_show_danmaku : 1
             */

            private int allow_send_danmaku;
            private int allow_show_danmaku;

            public int getAllow_send_danmaku() {
                return allow_send_danmaku;
            }

            public void setAllow_send_danmaku(int allow_send_danmaku) {
                this.allow_send_danmaku = allow_send_danmaku;
            }

            public int getAllow_show_danmaku() {
                return allow_show_danmaku;
            }

            public void setAllow_show_danmaku(int allow_show_danmaku) {
                this.allow_show_danmaku = allow_show_danmaku;
            }
        }

        public static class LargeCoverBean {
            /**
             * uri : large/565a0002a46c9f07f02a
             * url_list : [{"url":"http://p3.pstatp.com/large/565a0002a46c9f07f02a"},{"url":"http://pb9.pstatp.com/large/565a0002a46c9f07f02a"},{"url":"http://pb1.pstatp.com/large/565a0002a46c9f07f02a"}]
             */

            private String uri;
            private List<UrlListBeanXXX> url_list;

            public String getUri() {
                return uri;
            }

            public void setUri(String uri) {
                this.uri = uri;
            }

            public List<UrlListBeanXXX> getUrl_list() {
                return url_list;
            }

            public void setUrl_list(List<UrlListBeanXXX> url_list) {
                this.url_list = url_list;
            }

            public static class UrlListBeanXXX {
                /**
                 * url : http://p3.pstatp.com/large/565a0002a46c9f07f02a
                 */

                private String url;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }

        public static class MediumCoverBean {
            /**
             * uri : medium/565a0002a46c9f07f02a
             * url_list : [{"url":"http://p3.pstatp.com/w202/565a0002a46c9f07f02a"},{"url":"http://pb9.pstatp.com/w202/565a0002a46c9f07f02a"},{"url":"http://pb1.pstatp.com/w202/565a0002a46c9f07f02a"}]
             */

            private String uri;
            private List<UrlListBeanXXXX> url_list;

            public String getUri() {
                return uri;
            }

            public void setUri(String uri) {
                this.uri = uri;
            }

            public List<UrlListBeanXXXX> getUrl_list() {
                return url_list;
            }

            public void setUrl_list(List<UrlListBeanXXXX> url_list) {
                this.url_list = url_list;
            }

            public static class UrlListBeanXXXX {
                /**
                 * url : http://p3.pstatp.com/w202/565a0002a46c9f07f02a
                 */

                private String url;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }

        public static class OriginVideoBean {
            /**
             * height : 848
             * uri : origin/a363dafbd6394a34bd989f1843fb4178
             * url_list : [{"url":"http://ic.snssdk.com/neihan/video/playback/?video_id=a363dafbd6394a34bd989f1843fb4178&quality=origin&line=0&is_gif=0&device_platform="},{"url":"http://ic.snssdk.com/neihan/video/playback/?video_id=a363dafbd6394a34bd989f1843fb4178&quality=origin&line=1&is_gif=0&device_platform="}]
             * width : 480
             */

            private int height;
            private String uri;
            private int width;
            private List<UrlListBeanXXXXX> url_list;

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getUri() {
                return uri;
            }

            public void setUri(String uri) {
                this.uri = uri;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public List<UrlListBeanXXXXX> getUrl_list() {
                return url_list;
            }

            public void setUrl_list(List<UrlListBeanXXXXX> url_list) {
                this.url_list = url_list;
            }

            public static class UrlListBeanXXXXX {
                /**
                 * url : http://ic.snssdk.com/neihan/video/playback/?video_id=a363dafbd6394a34bd989f1843fb4178&quality=origin&line=0&is_gif=0&device_platform=
                 */

                private String url;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }

        public static class UserBean {
            /**
             * avatar_url : http://p3.pstatp.com/medium/4ace001331d3150c64ee
             * followers : 72
             * followings : 0
             * is_following : false
             * is_living : false
             * is_pro_user : false
             * medals : [{"count":7,"icon_url":"http://p1.pstatp.com/obj/3b6700087870735f5dcb","name":"hot_content","small_icon_url":"http://p1.pstatp.com/obj/3b22000b1e315df24be0"}]
             * name : 大笨贱人
             * ugc_count : 65
             * user_id : 5003276422
             * user_verified : false
             */

            private String avatar_url;
            private int followers;
            private int followings;
            private boolean is_following;
            private boolean is_living;
            private boolean is_pro_user;
            private String name;
            private int ugc_count;
            private long user_id;
            private boolean user_verified;
            private List<MedalsBean> medals;

            public String getAvatar_url() {
                return avatar_url;
            }

            public void setAvatar_url(String avatar_url) {
                this.avatar_url = avatar_url;
            }

            public int getFollowers() {
                return followers;
            }

            public void setFollowers(int followers) {
                this.followers = followers;
            }

            public int getFollowings() {
                return followings;
            }

            public void setFollowings(int followings) {
                this.followings = followings;
            }

            public boolean isIs_following() {
                return is_following;
            }

            public void setIs_following(boolean is_following) {
                this.is_following = is_following;
            }

            public boolean isIs_living() {
                return is_living;
            }

            public void setIs_living(boolean is_living) {
                this.is_living = is_living;
            }

            public boolean isIs_pro_user() {
                return is_pro_user;
            }

            public void setIs_pro_user(boolean is_pro_user) {
                this.is_pro_user = is_pro_user;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getUgc_count() {
                return ugc_count;
            }

            public void setUgc_count(int ugc_count) {
                this.ugc_count = ugc_count;
            }

            public long getUser_id() {
                return user_id;
            }

            public void setUser_id(long user_id) {
                this.user_id = user_id;
            }

            public boolean isUser_verified() {
                return user_verified;
            }

            public void setUser_verified(boolean user_verified) {
                this.user_verified = user_verified;
            }

            public List<MedalsBean> getMedals() {
                return medals;
            }

            public void setMedals(List<MedalsBean> medals) {
                this.medals = medals;
            }

            public static class MedalsBean {
                /**
                 * count : 7
                 * icon_url : http://p1.pstatp.com/obj/3b6700087870735f5dcb
                 * name : hot_content
                 * small_icon_url : http://p1.pstatp.com/obj/3b22000b1e315df24be0
                 */

                private int count;
                private String icon_url;
                private String name;
                private String small_icon_url;

                public int getCount() {
                    return count;
                }

                public void setCount(int count) {
                    this.count = count;
                }

                public String getIcon_url() {
                    return icon_url;
                }

                public void setIcon_url(String icon_url) {
                    this.icon_url = icon_url;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getSmall_icon_url() {
                    return small_icon_url;
                }

                public void setSmall_icon_url(String small_icon_url) {
                    this.small_icon_url = small_icon_url;
                }
            }
        }

        public static class DislikeReasonBean {
            /**
             * id : 65
             * title : 吧:搞笑视频
             * type : 2
             */

            private int id;
            private String title;
            private int type;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }
        }
    }
}
