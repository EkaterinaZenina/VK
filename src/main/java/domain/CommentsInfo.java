package domain;

public class CommentsInfo {
    private int allComments;
    private int closeComments;
    private int openComments;
    private int ReplyComments;
    private int canDelete;
    private int canEdit;
    private String Text;
    private int date;

    public int getAllComments() {
        return allComments;
    }

    public void setAllComments(int allComments) {
        this.allComments = allComments;
    }

    public int getCloseComments() {
        return closeComments;
    }

    public void setCloseComments(int closeComments) {
        this.closeComments = closeComments;
    }

    public int getOpenComments() {
        return openComments;
    }

    public void setOpenComments(int openComments) {
        this.openComments = openComments;
    }

    public int getReplyComments() {
        return ReplyComments;
    }

    public void setReplyComments(int replyComments) {
        ReplyComments = replyComments;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public void setText(String text) {
        Text = text;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
