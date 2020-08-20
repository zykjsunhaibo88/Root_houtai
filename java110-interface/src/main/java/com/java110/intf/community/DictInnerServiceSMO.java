package com.java110.intf.community;

import com.java110.dto.Dict.DictDto;
import com.java110.dto.Dict.DictQueryDto;

import java.util.List;

/**
 * <br>
 * Created by hu ping on 10/22/2019
 * <p>
 */

public interface DictInnerServiceSMO {


    List<DictDto> queryDict(DictQueryDto queryDto);

}
