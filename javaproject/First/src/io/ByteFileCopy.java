package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteFileCopy {
 public static void main(String[] args) throws FileNotFoundException  {
	

//읽어올 대상 파일의 inPutStream인스턴스 생성
InputStream in= new FileInputStream("org.pdf");
//출력대상 파일의 outPutStream 인스턴스 생성 
OutputStream out=new FileOutputStream("org_copy.pdf");

//해당 경로의 팡리이 존재하지 않으면 파일을 생성해서 writ

BufferedInputStream bin =new BufferedInputStream(in,1024) ;
BufferedOutputStream bout=new BufferedOutputStream(out, 1024);

int copyByte=0;//복사한 사이즈
int bData=0;//원본에서 복사한 byte사이즈의 데이터

byte[] buf=new byte[1024];
int redLength=0;

System.out.println("복사를 시작합니다.");

while (true) {
	//redLength=in.read();
	//if(redLength==-1) {// 더이상 가져올 데이터가 없으면 -1반환 
	break;	
		
	}
	out.write(bData);// 출력:파일에 바이터 코드를 쓴다.
	//out.write(buf, 0,redLength);
	//copyByte += redLength;
	copyByte++;

in.close();//스트림 인스턴스 소멸 
out.close();
System.out.println("복사가 완료되었습니다.");
System.out.println("복사된 사이즈 "+copyByte+"byte");
 } 
 }

