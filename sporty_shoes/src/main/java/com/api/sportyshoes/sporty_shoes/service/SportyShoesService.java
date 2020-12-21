package com.api.sportyshoes.sporty_shoes.service;

import java.util.Date;
import java.util.List;

import com.api.sportyshoes.sporty_shoes.exceptionHandler.BusinessException;
import com.api.sportyshoes.sporty_shoes.model.PurchaseReport;
import com.api.sportyshoes.sporty_shoes.model.Shoe;

public interface SportyShoesService {
	
	public Shoe createShoe(Shoe shoe) throws BusinessException;
	public Shoe getShoeById(int id) throws BusinessException;
	public Shoe updateShoe(Shoe shoe);
	public void deleteShoeById(int id) throws BusinessException;
	public List<Shoe> getAllShoes();
	
	public PurchaseReport createPurchaseReport(PurchaseReport pr) throws BusinessException;
	public PurchaseReport getPurchaseReportById(int id) throws BusinessException;
	public PurchaseReport updatePurchaseReport(PurchaseReport pr);
	public void deletePurchaseReportById(int id) throws BusinessException;
	public List<PurchaseReport> getAllPurchaseReports();
	public List<PurchaseReport> getAllPurchaseReportsByCategory(String category);
	public List<PurchaseReport> getAllPurchaseReportsByDOP(Date dop);

}