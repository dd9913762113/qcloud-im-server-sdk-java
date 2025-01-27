package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 群成员离开之后回调
 *
 * @author bingo
 * @since 2021/11/16 19:29
 */
public class AfterMemberExitCallback {
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("ExitType")
    private String exitType;

    @JsonProperty("Operator_Account")
    private String operatorAccount;

    @JsonProperty("ExitMemberList")
    private List<ExitMemberItem> exitMemberList;

    public String getCallbackCommand() {
        return callbackCommand;
    }

    public void setCallbackCommand(String callbackCommand) {
        this.callbackCommand = callbackCommand;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExitType() {
        return exitType;
    }

    public void setExitType(String exitType) {
        this.exitType = exitType;
    }

    public String getOperatorAccount() {
        return operatorAccount;
    }

    public void setOperatorAccount(String operatorAccount) {
        this.operatorAccount = operatorAccount;
    }

    public List<ExitMemberItem> getExitMemberList() {
        return exitMemberList;
    }

    public void setExitMemberList(List<ExitMemberItem> exitMemberList) {
        this.exitMemberList = exitMemberList;
    }

    public static class ExitMemberItem {
        @JsonProperty("Member_Account")
        private String memberAccount;

        public String getMemberAccount() {
            return memberAccount;
        }

        public void setMemberAccount(String memberAccount) {
            this.memberAccount = memberAccount;
        }
    }
}
