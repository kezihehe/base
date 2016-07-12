/**
* @title User.java
* @package com.lisk.ssm.model
* @description TODO(用一句话描述该文件做什么)
* @author
* @date 2015年9月7日 下午1:06:35
* @version v1.00
*/ 
package com.lisk.demo;

/**
 * @classname User
 * @description TODO(这里用一句话描述这个类的作用)
 * @author
 * @date 2015年9月7日 下午1:06:35
 *
 */
public class User implements java.io.Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String username;

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}
