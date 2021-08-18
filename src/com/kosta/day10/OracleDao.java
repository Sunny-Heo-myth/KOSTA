package com.kosta.day10;

public class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println(getClass().getSimpleName() + "select method.");

	}

	@Override
	public void insert() {
		System.out.println(getClass().getSimpleName() + "select method.");

	}

	@Override
	public void update() {
		System.out.println(getClass().getSimpleName() + "select method.");

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

}
