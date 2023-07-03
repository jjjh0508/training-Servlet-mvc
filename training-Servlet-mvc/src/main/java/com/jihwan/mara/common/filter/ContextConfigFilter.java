package com.jihwan.mara.common.filter;

import com.jihwan.mara.common.config.ConfigLocation;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.FileFilter;
import java.io.IOException;

@WebFilter("/*")
public class ContextConfigFilter  implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        if (ConfigLocation.CONNECTION_CONFIG_LOCATION == null) {
            String root = request.getServletContext().getRealPath("/");
            String connectionInfoPath = request.getServletContext().getInitParameter("connection-info");
            ConfigLocation.CONNECTION_CONFIG_LOCATION = root+"/"+connectionInfoPath;
            System.out.println(ConfigLocation.CONNECTION_CONFIG_LOCATION);
        }
        if (ConfigLocation.MAPPER_LOCATION == null) {
            String root =request.getServletContext().getRealPath("/");
            String mapperLocation = request.getServletContext().getInitParameter("mapper-location");
            ConfigLocation.MAPPER_LOCATION=root+"/"+mapperLocation;
            System.out.println(mapperLocation);
        }
        chain.doFilter(request, response);
    }
}
