package com.lining.gradlebuild;

import com.fission.recordupload.RecordBean;

/**
 * Created by lining on 2017/10/30.
 */

public class TextBean extends RecordBean{
    public String userId;
    public String userName;

    public TextBean(String category, String action_type) {
        super(category, action_type);
    }
}
