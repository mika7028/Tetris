package テトリス;

import java.awt.Graphics;
public class Block {
  public static void polygon
       (int xx, int yy, int block, Graphics offG,
        int pattern, int ran){
	  switch(ran){
	  case 0:
		  if(pattern==0){
			  offG.setColor(Clr.clr[ran]);
			  offG.fillRect(xx, yy+block, block, block);
              offG.fillRect(xx, yy, block, block);
              offG.fillRect(xx, yy-block, block, block);
              offG.fillRect(xx, yy-block*2, block, block);
              
              offG.setColor(Clr.clr[7]);
              offG.drawRect(xx, yy+block, block, block);
              offG.drawRect(xx, yy, block, block);
              offG.drawRect(xx, yy-block, block, block);
              offG.drawRect(xx, yy-block*2, block, block);
		  }
	  }
  }
}
