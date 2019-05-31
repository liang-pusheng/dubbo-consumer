package im.lazycat.impl;

import im.lazycat.service.DemoService;
import org.springframework.stereotype.Service;

@Service("demoService")
public class DemoServiceImpl implements DemoService {

    @Override
    public String test() {
        return "success";
    }
}
