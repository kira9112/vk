package domain;

import domain.CommentsInfo;
import domain.LikesInfo;
import domain.RepostsInfo;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int date;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private String text;
    private ViewsInfo viewsInfo;
    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;


}