package it.phoenix.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanTest {

  @Test
  public void zeroIsEmpty() {
    check("", 0);
  }

  @Test
  public void oneIsI() throws Exception {
    check("I", 1);
  }

  @Test
  public void twoIsII() throws Exception {
    check("II", 2);
  }

  @Test
  public void threeIsIII() throws Exception {
    check("III", 3);
  }

  @Test
  public void fourIsIV() throws Exception {
    check("IV", 4);
  }

  @Test
  public void fiveIsV() throws Exception {
    check("V", 5);
  }

  @Test
  public void sixIsVI() throws Exception {
    check("VI", 6);
  }

  @Test
  public void nineIsIX() throws Exception {
    check("IX", 9);
  }

  @Test
  public void tenIsX() throws Exception {
    check("X", 10);
  }

  @Test
  public void fourteenIsXIV() throws Exception {
    check("XIV", 14);
  }

  @Test
  public void from15to29() throws Exception {
    check("XV", 15);
    check("XVI", 16);
    check("XVII", 17);
    check("XVIII", 18);
    check("XIX", 19);
    check("XX", 20);
    check("XXIII", 23);
    check("XXIX", 29);
  }

  @Test
  public void fortyIsXL() throws Exception {
    check("XL", 40);
  }

  @Test
  public void fortyfourIsXLIV() throws Exception {
    check("XLIV", 44);
  }
  
  @Test
  public void _50IsL() throws Exception {
    check("L", 50);
  }
  
  @Test
  public void _90IsXC() throws Exception {
    check("XC", 90);
  }
  
  @Test
  public void _100IsC() throws Exception {
    check("C", 100);
  }
  
  @Test
  public void _400IsCD() throws Exception {
    check("CD", 400);
  }
  
  @Test
  public void _500IsD() throws Exception {
    check("D", 500);
  }
  
  @Test
  public void _900IsCM() throws Exception {
    check("CM", 900);
  }
  
  @Test
  public void _1000IsM() throws Exception {
    check("M", 1000);
  }
  
  
  
  private void check(String expectedString, int decimal) {
    assertEquals(expectedString, new Roman(decimal).toString());
  }

}
