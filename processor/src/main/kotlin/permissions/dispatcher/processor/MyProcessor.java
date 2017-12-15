package permissions.dispatcher.processor;

import java.util.Locale;
import java.util.Map;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;

import permissions.dispatcher.test.MyAnnoClass;

/**
 * Created by regan.chon on 2017/12/15.
 */
@SupportedAnnotationTypes("permissions.dispatcher.test.MyProcessor")
public class MyProcessor extends AbstractProcessor {

    Elements mElementUtils;

    Map<String, String> mOptions;

    Messager mMessager;

    Filer mFiler;

    Types mTypeUtils;

    SourceVersion mSourceVersion;

    Locale mLocale;

    @Override
    public synchronized void init(ProcessingEnvironment processingEnvironment) {
        super.init(processingEnvironment);
        mElementUtils = processingEnvironment.getElementUtils();
        mOptions=processingEnvironment.getOptions();
        mMessager=processingEnvironment.getMessager();
        mFiler=processingEnvironment.getFiler();
        mTypeUtils=processingEnvironment.getTypeUtils();
        mSourceVersion=processingEnvironment.getSourceVersion();
        mLocale=processingEnvironment.getLocale();
    }

    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {

        Set<? extends Element> elements = roundEnvironment.getElementsAnnotatedWith(MyAnnoClass.class);
        TypeElement classElement=null;//声明类元素


        return false;
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.RELEASE_6;
    }
}
