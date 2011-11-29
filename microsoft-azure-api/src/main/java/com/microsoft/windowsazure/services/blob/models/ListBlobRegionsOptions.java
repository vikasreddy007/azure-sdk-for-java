package com.microsoft.windowsazure.services.blob.models;

public class ListBlobRegionsOptions extends BlobServiceOptions {
    private String leaseId;
    private String snapshot;
    private Long rangeStart;
    private Long rangeEnd;
    private AccessCondition accessCondition;

    @Override
    public ListBlobRegionsOptions setTimeout(Integer timeout) {
        super.setTimeout(timeout);
        return this;
    }

    public String getLeaseId() {
        return leaseId;
    }

    public ListBlobRegionsOptions setLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }

    public String getSnapshot() {
        return snapshot;
    }

    public ListBlobRegionsOptions setSnapshot(String snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    public Long getRangeStart() {
        return rangeStart;
    }

    public ListBlobRegionsOptions setRangeStart(Long rangeStart) {
        this.rangeStart = rangeStart;
        return this;
    }

    public Long getRangeEnd() {
        return rangeEnd;
    }

    public ListBlobRegionsOptions setRangeEnd(Long rangeEnd) {
        this.rangeEnd = rangeEnd;
        return this;
    }

    public AccessCondition getAccessCondition() {
        return accessCondition;
    }

    public ListBlobRegionsOptions setAccessCondition(AccessCondition accessCondition) {
        this.accessCondition = accessCondition;
        return this;
    }
}
