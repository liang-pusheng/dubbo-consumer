package im.lazycat.impl;

import com.liangpusheng.service.GoodService;
import im.lazycat.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("demoService")
public class DemoServiceImpl implements DemoService {

    @Autowired
    private GoodService goodService;

    @Override
    public String test() {
        return "success";
    }

    @Override
    public String remote() {
        return goodService.getGood(1).toString();
    }
}
