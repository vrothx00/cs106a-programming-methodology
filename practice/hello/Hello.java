// This program displays hello on the screen

import acm.graphics.*;
import acm.program.*;

public class Hello extends GraphicsProgram {
	public void run() {
		add(new GLabel("hello, world", 100, 100));
	}
}
