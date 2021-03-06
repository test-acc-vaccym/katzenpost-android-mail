package com.fsck.k9.mail.store.katzenpost;


import java.util.HashMap;
import java.util.Map;

import com.fsck.k9.mail.AuthType;
import com.fsck.k9.mail.ConnectionSecurity;
import com.fsck.k9.mail.ServerSettings;
import com.fsck.k9.mail.store.webdav.WebDavStore;


/**
 * This class is used to store the decoded contents of an WebDavStore URI.
 *
 * @see WebDavStore#decodeUri(String)
 */
public class KatzenpostServerSettings extends ServerSettings {
    public final String provider;
    public final String linkkey;
    public final String idkey;

    public KatzenpostServerSettings(String provider, String username, String linkkey, String idkey) {
        super(Type.KATZENPOST, username);
        this.provider = provider;
        this.linkkey = linkkey;
        this.idkey = linkkey;
    }

    public String getAddress() {
        return username + "@" + provider;
    }
}
