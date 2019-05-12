package Picture;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      // [1]삽입 [2]모두보기

      // [1] 삽입 메뉴 선택 시
      // [1]Rect [2]Cir [3]Tri >> 1
      // color >> red
      
      // [2] 모두보기 선택 시
      // Rect (red)
      
      Scanner sc = new Scanner(System.in);
      GraphicTool gt = new GraphicTool();
      
      while(true){
         System.out.println("[1]삽입 [2]모두보기");
         int choice = sc.nextInt();
         if (choice == 1) {
            System.out.print("[1]Rect [2]Cir [3]Tri >> ");
            int num = sc.nextInt();
            System.out.print("color >> ");
            String color = sc.next();
            Shape sh = null;
            
            if (num == 1) {
               sh = new Rect(color);
            }else if (num == 2) {
               sh = new Cir(color);
            }else if (num == 3) {
               sh = new Tri(color);
            }
            
            gt.addShape(sh);
         }else if (choice == 2) {
            gt.allDraw();
         }
         
      }
      
      
   }

}

