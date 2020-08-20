package com.java110.intf.order;

import com.java110.dto.corder.CorderDto;

import java.util.List;


public interface ICordersInnerServiceSMO {

    int queryCordersCount(CorderDto corderDto);


    List<CorderDto> queryCorders(CorderDto corderDto);

}
