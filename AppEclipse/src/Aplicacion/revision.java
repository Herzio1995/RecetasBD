package Aplicacion;

import javax.swing.JTextField;

import com.inet.jortho.FileUserDictionary;
import com.inet.jortho.SpellChecker;

public class revision {
	revision() {
	}
	
	public void detectarErroresOrtograficos(JTextField[] textFields) {
		SpellChecker.setUserDictionaryProvider(new FileUserDictionary());
		SpellChecker.registerDictionaries(null, null);
		
		
		for(JTextField textField:textFields) {
			SpellChecker.register(textField);
	    }
	}
}
