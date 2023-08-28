package guiceframe;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import guiceframe.annotation.WinWord;

public class TextEditor {
	private SpellChecker spellChecker;
	   @Inject
	   public TextEditor( SpellChecker spellChecker) {
	      this.spellChecker = spellChecker;
	   }
	   
	   public void makeSpellCheck(){
		    spellChecker.checkSpelling();
		}
	   
//	   @Inject
//	   public TextEditor( @WinWord SpellChecker spellChecker) {  -->Inject using Binding Annotation
//	      this.spellChecker = spellChecker;
//	   }
	   
	   
//	   @Inject
//	   public TextEditor(@Named("OpenOffice") SpellChecker spellChecker) {  //Inject using Named Annotation
//	      this.spellChecker = spellChecker;
//	   }
	   
}
