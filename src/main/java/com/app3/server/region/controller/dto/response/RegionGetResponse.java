package com.app3.server.region.controller.dto.response;

import com.app3.server.region.domain.Region;

public record RegionGetResponse (
        String regionName,
        String imageUrl
) {
    public static RegionGetResponse of(Region region) {
        return new RegionGetResponse(
                region.getRegionName(),
                region.getImageUrl()
        );
    }
}