package com.myspace.drl_fraud;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Result implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("score")
	private int score;

	@org.kie.api.definition.type.Label(value = "status")
	private java.lang.String status;

	public Result() {
	}

	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public Result(int score, java.lang.String status) {
		this.score = score;
		this.status = status;
	}

}