package com.kosta.day10;

public class DAOExample {

	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dbWork(new OracleDao());
		dbWork(new MySqlDao());
		dbWork(new DataAccessObject() {
			
			@Override
			public void update() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void select() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void insert() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void delete() {
				// TODO Auto-generated method stub
				
			}
		});
	}

}
