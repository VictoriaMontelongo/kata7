package view;

import model.Block;

public interface BlockDisplay{
    
  void paintBlock(int x, int y);
  void on(Moved moved);

    interface Moved {
        void to(int x, int y);
        
    }
    
}
