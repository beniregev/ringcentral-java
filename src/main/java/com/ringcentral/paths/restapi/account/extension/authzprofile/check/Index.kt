package com.ringcentral.paths.restapi.account.extension.authzprofile.check

class Index(val parent: com.ringcentral.paths.restapi.account.extension.authzprofile.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/check"
    }

    /**
     * Operation: Check User Permission
     * Http Get /restapi/v1.0/account/{accountId}/extension/{extensionId}/authz-profile/check
     */
    @JvmOverloads
    fun get(queryParams: com.ringcentral.definitions.CheckUserPermissionParameters? = null): com.ringcentral.definitions.AuthProfileCheckResource? {
        val rb: okhttp3.ResponseBody = rc.get(this.path(), queryParams)

        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.AuthProfileCheckResource::class.java)

    }

}
