
package com.example.betterbuy;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Meta {

    @SerializedName("newest_id")
    @Expose
    private String newestId;
    @SerializedName("oldest_id")
    @Expose
    private String oldestId;
    @SerializedName("result_count")
    @Expose
    private Integer resultCount;
    @SerializedName("next_token")
    @Expose
    private String nextToken;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Meta() {
    }

    /**
     * 
     * @param resultCount
     * @param nextToken
     * @param oldestId
     * @param newestId
     */
    public Meta(String newestId, String oldestId, Integer resultCount, String nextToken) {
        super();
        this.newestId = newestId;
        this.oldestId = oldestId;
        this.resultCount = resultCount;
        this.nextToken = nextToken;
    }

    public String getNewestId() {
        return newestId;
    }

    public void setNewestId(String newestId) {
        this.newestId = newestId;
    }

    public String getOldestId() {
        return oldestId;
    }

    public void setOldestId(String oldestId) {
        this.oldestId = oldestId;
    }

    public Integer getResultCount() {
        return resultCount;
    }

    public void setResultCount(Integer resultCount) {
        this.resultCount = resultCount;
    }

    public String getNextToken() {
        return nextToken;
    }

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

}
