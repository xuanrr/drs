package com.nssol.project.monitor.druid;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.nssol.framework.web.controller.BaseController;

/**
 * druid 监控
 * 
 * @author zxy
 */
@Controller
@RequestMapping("/monitor/data")
public class DruidController extends BaseController
{
    private String prefix = "/druid";

    @RequiresPermissions("monitor:data:view")
    @GetMapping()
    public String index()
    {
        return redirect(prefix + "/index.html");
    }
}
