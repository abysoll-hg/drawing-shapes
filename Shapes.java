public class Shapes {
    public static void main(String[] args) {
        // Task 1: Draw a regular shape
        Turtle t = new Turtle();
        t.setCanvasSize(1000,1000);
        for (int i = 0; i < 4; i++) {
         t.forward(50);
         t.right(90);
        }

        // Task 2: Draw a regular shape many times
        t.up();
        t.backward(200);
        t.down();
        for (int i = 0; i < 15; i++) {
         for (int j = 0; j < 4; j++) {
          t.forward(50);
          t.right(90);
         }
         t.up();
         t.backward(150);
         t.left(100);
         t.down();
        }

        // Task 3: How many times does Turtle turn!
        int turnCount = 0;
        t.up();
        t.right(90);
        t.forward(400);
        t.down();
        for (int i = 0; i < 15; i++) {
         for (int j = 0; j < 4; j++) {
          t.forward(50);
          t.right(90);
          turnCount += 1;
         }
         t.up();
         t.backward(150);
         t.left(100);
         t.down();
        } 
        System.out.println(t+" has turned "+ turnCount+" times!");
        // Extension 1:
        // Additional use of loop variables
        t.up();
        t.left(90);
        t.forward(400);
        t.down();
        for (int i = 0; i < 15; i++) {
         for (int j = 0; j < 4; j++) {
          t.forward(50+4*i); // Changes size based on outer loop variable
          t.right(90);
         }
         t.up();
         t.backward(100);
         t.left(100);
         t.down();
        } 
        // Extension 2:
        // Draws a random amount of shapes from 1-15
        t.up();
        t.backward(500); 
        t.down();
        for (int i = 0; i < (int) (Math.random() * ((15-1) + 1)); i++) { 
         for (int j = 0; j < 4; j++) {
           t.forward(50);
           t.right(90);
         }
         t.up();
         t.backward(100);
         t.left(100);
         t.down();
        }
    }
}
