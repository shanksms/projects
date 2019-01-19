package cde.codeboje.springbootbook.commentstore.service;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.io.Serializable;

@EntityScan(
        basePackages = {"de.codeboje.springbootbook"}
)
@Entity
@Table(
        name = "comments_model",
        indexes = {
                @Index(name = "idx_pageId", columnList = "pageId")
        }
)

public class CommentModel implements Serializable {
    @Id
    @Column(length = 36)
    private String id;

    @Version
    private Integer version;

    @Column(length = 32)
    private String pageId;

    @Column(length = 32)
    private String userName;

    @Column
    private boolean spam;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isSpam() {
        return spam;
    }

    public void setSpam(boolean spam) {
        this.spam = spam;
    }
}
