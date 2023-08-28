package guiceframe;
import java.lang.annotation.Annotation;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

import guiceframe.annotation.WinWord;
public class TextEditorModule extends AbstractModule {
  @Override
  protected void configure() {
	  bind(SpellChecker.class).to(SpellCheckerImpl.class); //LinkBinding
////	  bind(SpellChecker.class).annotatedWith(WinWord.class).to(WinWordSpellCheckImpl.class);//Binding Annotation 
////	  bind(SpellChecker.class).annotatedWith(Names.named("OpenOffice"))
////      .to(NamedImpl.class); //Named Annotation
	  bind(String.class).annotatedWith(Names.named("Lang")).toInstance("English");//Constant Binding
////	  bind(SpellChecker.class).toProvider(ProviderSpellCheckerImpl.class); //Provider Class
////	      try {
//			bind(SpellChecker.class)
//			     .toConstructor(ConstrructorSpellCheckImpl.class.getConstructor(String.class));
//		} catch (NoSuchMethodException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SecurityException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	      bind(String.class) .annotatedWith(Names.named("JDBC")) .toInstance("jdbc:mysql://localhost:5326/emp");

  } 
  }
