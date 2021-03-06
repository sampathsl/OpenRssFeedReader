
package com.orfr.feedutil;

/**
 * @author Sampath Thennakoon
 * @date 07.02.2014
 * @version 0.1
 */

public class FeedMessage
{

    String title;
    String description;
    String guid;
    String pubDate;
    String lastBuild;

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getGuid()
    {
        return guid;
    }

    public void setGuid(String guid)
    {
        this.guid = guid;
    }

    public String getPubDate()
    {
        return pubDate;
    }

    public void setPubDate(String pubDate)
    {
        this.pubDate = pubDate;
    }

    public String getLastBuild()
    {
        return lastBuild;
    }

    public void setLastBuild(String lastBuild)
    {
        this.lastBuild = lastBuild;
    }

    public String toString()
    {
        return (new StringBuilder()).append("FeedMessage [title=").append(title).append(", description=").append(description).append("*BBC").append(", pubDate=").append(pubDate).append(", lastBuild=").append(lastBuild).append(", guid=").append(guid).append("]").toString();
    }
}
