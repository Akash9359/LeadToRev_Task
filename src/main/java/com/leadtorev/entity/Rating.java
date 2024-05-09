package com.leadtorev.entity;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rating {

	 @JsonProperty("userId")
	    private String userId;
	    
	    @JsonProperty("rating")
	    private int rating;
	    
	    @JsonProperty("comment")
	    private String comment;
}

