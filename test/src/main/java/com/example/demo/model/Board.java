package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Board {
	
	private int board_seq;
	private String board_title;
	private String board_date;
	private String mb_nick;
	private String mb_pic;
	private String board_file;
	private String board_type;
	private String board_content;
	int cmt_count;
	int like_count;
}
