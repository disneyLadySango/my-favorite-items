package jp.co.disney.lady.sango.disney.resolvers;

import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
public final class Query implements GraphQLQueryResolver {
    public String version() {
        return "1.0.0";
    }
}
