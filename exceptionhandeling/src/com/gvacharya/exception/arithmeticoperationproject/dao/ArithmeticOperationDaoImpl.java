package com.gvacharya.exception.arithmeticoperationproject.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ArithmeticOperationDaoImpl implements ArithmeticOperationDao{

	@Override
	public int addition(int number1, int number2) {
		int result=0;
		try(
				Writer fw= new FileWriter("addition.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				
				
			){
			
			bw.write((number1+number2) + "");
			
		
			
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(
				Reader fr = new FileReader("addition.txt");
				BufferedReader br = new BufferedReader(fr);
			){
			
			result = Integer.parseInt(br.readLine());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public int substraction(int number1, int number2) {
		int result=0;
		try(
				Writer fw= new FileWriter("substraction.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				
				
			){
			
			bw.write((number1-number2) + "");
			
		
			
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(
				Reader fr = new FileReader("substraction.txt");
				BufferedReader br = new BufferedReader(fr);
			){
			
			result = Integer.parseInt(br.readLine());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public int multiplication(int number1, int number2) {
		int result=0;
		try(
				Writer fw= new FileWriter("multiplication.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				
				
			){
			
			bw.write((number1*number2) + "");
			
		
			
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(
				Reader fr = new FileReader("multiplication.txt");
				BufferedReader br = new BufferedReader(fr);
			){
			
			result = Integer.parseInt(br.readLine());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public int division(int number1, int number2) {
		int result=0;
		try(
				Writer fw= new FileWriter("division.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				
				
			){
			
			bw.write((number1/number2) + "");
			
		
			
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(
				Reader fr = new FileReader("division.txt");
				BufferedReader br = new BufferedReader(fr);
			){
			
			result = Integer.parseInt(br.readLine());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
