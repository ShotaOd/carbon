package org.carbon.sample.v2.app.oauth.def;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Shota Oda 2017/07/17.
 */
@Getter
@AllArgsConstructor
public enum AuthScope {
    read_profile("read_profile"),
    update_profile("update_profile"),;

    private String code;

    public static AuthScope codeOf(String scope) {
        for (AuthScope authScope : values()) {
            if (authScope.code.equals(scope)) {
                return authScope;
            }
        }
        return null;
    }

    public static Set<AuthScope> codesOf(List<String> scopes) {
        if (scopes == null) {
            return Collections.singleton(AuthScope.read_profile);
        }
        return scopes.stream()
                .map(AuthScope::codeOf)
                .filter(Objects::nonNull)
                .collect(Collectors.toSet());
    }
}
