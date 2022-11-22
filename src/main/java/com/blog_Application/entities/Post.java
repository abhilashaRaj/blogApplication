package com.blog_Application.entities;



import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="posts")
public class Post {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer postId;
	@Column(name="post_title", length=100, nullable=false)
	private String title;
	@Column(length=1000)
	private String content;
	private String imageName;
	private Date addedDate;
	@ManyToOne
	//@JoinColumn(name="category_id")
	private Category category;
	@ManyToOne
//	@JoinColumn(name="users_id")
	private User user;

}
