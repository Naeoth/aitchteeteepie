/**
 * generated by Xtext 2.12.0
 */
package aitchteeteepie.xtext.dsl.generator;

import aitchteeteepie.AuthFlag;
import aitchteeteepie.BodyFlag;
import aitchteeteepie.CommandLineInterface;
import aitchteeteepie.DataFieldItem;
import aitchteeteepie.DownloadFlag;
import aitchteeteepie.Flag;
import aitchteeteepie.FormFileFieldItem;
import aitchteeteepie.FormFlag;
import aitchteeteepie.HeadersFlag;
import aitchteeteepie.HelpFlag;
import aitchteeteepie.HttpHeaderItem;
import aitchteeteepie.Item;
import aitchteeteepie.JsonFlag;
import aitchteeteepie.Method;
import aitchteeteepie.ProxyFlag;
import aitchteeteepie.RawJsonFieldItem;
import aitchteeteepie.TimeoutFlag;
import aitchteeteepie.UrlParameterItem;
import aitchteeteepie.VerboseFlag;
import aitchteeteepie.VersionFlag;
import com.google.common.collect.Iterators;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class CurlBetterThanHttpieGenerator extends AbstractGenerator {
  private boolean formFlag = false;
  
  @Override
  public void doGenerate(final Resource res, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    fsa.generateFile(res.getURI().trimFileExtension().appendFileExtension("curl").lastSegment(), 
      this.compile(IterableExtensions.<CommandLineInterface>head(IteratorExtensions.<CommandLineInterface>toIterable(Iterators.<CommandLineInterface>filter(res.getAllContents(), CommandLineInterface.class)))).toString());
  }
  
  protected CharSequence _compile(final CommandLineInterface req) {
    CharSequence _xblockexpression = null;
    {
      String _url = req.getUrl();
      boolean _tripleEquals = (_url == null);
      if (_tripleEquals) {
        req.setUrl("localhost");
      }
      Method _method = req.getMethod();
      boolean _tripleEquals_1 = (_method == null);
      if (_tripleEquals_1) {
        req.setMethod(Method.GET);
      }
      String _protocol = req.getProtocol();
      boolean _tripleEquals_2 = (_protocol == null);
      if (_tripleEquals_2) {
        req.setProtocol("https");
      }
      int _port = req.getPort();
      boolean _tripleEquals_3 = (_port == 0);
      if (_tripleEquals_3) {
        req.setPort(80);
      }
      final Function1<Flag, Object> _function = (Flag option) -> {
        return this.compile(option);
      };
      final List<Object> flagsCmpl = ListExtensions.<Flag, Object>map(req.getFlags(), _function);
      final Function1<Item, Boolean> _function_1 = (Item param) -> {
        return Boolean.valueOf(param.eClass().getName().equals("UrlParameterItem"));
      };
      final Iterable<Item> UrlParameterItem = IterableExtensions.<Item>filter(req.getItems(), _function_1);
      final Function1<Item, Boolean> _function_2 = (Item param) -> {
        return Boolean.valueOf(param.eClass().getName().equals("HttpHeaderItem"));
      };
      final Iterable<Item> HttpHeaderItem = IterableExtensions.<Item>filter(req.getItems(), _function_2);
      final Function1<Item, Boolean> _function_3 = (Item param) -> {
        return Boolean.valueOf(param.eClass().getName().equals("DataFieldItem"));
      };
      final Iterable<Item> DataFieldItem = IterableExtensions.<Item>filter(req.getItems(), _function_3);
      final Function1<Item, Boolean> _function_4 = (Item param) -> {
        return Boolean.valueOf(param.eClass().getName().equals("FormFileFieldItem"));
      };
      final Iterable<Item> FormFileFieldItem = IterableExtensions.<Item>filter(req.getItems(), _function_4);
      final Function1<Item, Boolean> _function_5 = (Item param) -> {
        return Boolean.valueOf(param.eClass().getName().equals("RawJsonFieldItem"));
      };
      final Iterable<Item> RawJsonFieldItem = IterableExtensions.<Item>filter(req.getItems(), _function_5);
      final Function1<Item, Object> _function_6 = (Item param) -> {
        return this.compile(param);
      };
      final Iterable<Object> urlParametersCmpl = IterableExtensions.<Item, Object>map(UrlParameterItem, _function_6);
      final Function1<Item, Object> _function_7 = (Item param) -> {
        return this.compile(param);
      };
      final Iterable<Object> httpHeadersCmpl = IterableExtensions.<Item, Object>map(HttpHeaderItem, _function_7);
      final Function1<Item, Object> _function_8 = (Item param) -> {
        return this.compile(param);
      };
      final Iterable<Object> dataFieldsCmpl = IterableExtensions.<Item, Object>map(DataFieldItem, _function_8);
      final Function1<Item, Object> _function_9 = (Item param) -> {
        return this.compile(param);
      };
      final Iterable<Object> formFieldsCmpl = IterableExtensions.<Item, Object>map(FormFileFieldItem, _function_9);
      final Function1<Item, Object> _function_10 = (Item param) -> {
        return this.compile(param);
      };
      final Iterable<Object> rawJsonFieldCmpl = IterableExtensions.<Item, Object>map(RawJsonFieldItem, _function_10);
      String dataFieldsString = "";
      if (((IterableExtensions.size(dataFieldsCmpl) > 0) && (!this.formFlag))) {
        String _join = IterableExtensions.join(dataFieldsCmpl, "&");
        String _plus = ("-d \"" + _join);
        String _plus_1 = (_plus + "\"");
        dataFieldsString = _plus_1;
      } else {
        dataFieldsString = IterableExtensions.join(dataFieldsCmpl, " ");
      }
      String urlParametersString = "";
      int _size = IterableExtensions.size(urlParametersCmpl);
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        String _join_1 = IterableExtensions.join(urlParametersCmpl, "&");
        String _plus_2 = ("?" + _join_1);
        urlParametersString = _plus_2;
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("curl ");
      Object _compile = this.compile(req.getMethod());
      _builder.append(_compile);
      _builder.append(" ");
      String _join_2 = IterableExtensions.join(httpHeadersCmpl, " ");
      _builder.append(_join_2);
      _builder.append(" ");
      String _join_3 = IterableExtensions.join(flagsCmpl, " ");
      _builder.append(_join_3);
      _builder.append(" ");
      String _protocol_1 = req.getProtocol();
      _builder.append(_protocol_1);
      _builder.append("://");
      String _url_1 = req.getUrl();
      _builder.append(_url_1);
      _builder.append(":");
      int _port_1 = req.getPort();
      _builder.append(_port_1);
      _builder.append(urlParametersString);
      _builder.append(" ");
      _builder.append(dataFieldsString);
      String _join_4 = IterableExtensions.join(formFieldsCmpl, " ");
      _builder.append(_join_4);
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _compile(final Flag f) {
    StringConcatenation _builder = new StringConcatenation();
    Object _compile = this.compile(f);
    _builder.append(_compile);
    return _builder;
  }
  
  protected CharSequence _compile(final VerboseFlag vb) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("-v");
    return _builder;
  }
  
  protected CharSequence _compile(final DownloadFlag dl) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("-O");
    return _builder;
  }
  
  protected CharSequence _compile(final HeadersFlag hf) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("-D");
    return _builder;
  }
  
  protected CharSequence _compile(final BodyFlag bf) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("-i");
    return _builder;
  }
  
  protected CharSequence _compile(final HelpFlag hf) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("-h");
    return _builder;
  }
  
  protected CharSequence _compile(final VersionFlag hf) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("--version");
    return _builder;
  }
  
  protected CharSequence _compile(final TimeoutFlag tf) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("-m ");
    float _timeout = tf.getTimeout();
    _builder.append(_timeout);
    return _builder;
  }
  
  protected CharSequence _compile(final Method get) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("-X ");
    String _name = get.getName();
    _builder.append(_name);
    return _builder;
  }
  
  protected CharSequence _compile(final FormFlag ff) {
    CharSequence _xblockexpression = null;
    {
      this.formFlag = true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Content-Type: application/x-www-form-urlencoded; charset=utf-8");
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _compile(final JsonFlag jf) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("-H \"Content-Type: application/json\"");
    return _builder;
  }
  
  protected CharSequence _compile(final AuthFlag af) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("--user ");
    String _username = af.getUsername();
    _builder.append(_username);
    _builder.append(":");
    String _password = af.getPassword();
    _builder.append(_password);
    _builder.append(" ");
    String _hostname = af.getHostname();
    _builder.append(_hostname);
    return _builder;
  }
  
  protected CharSequence _compile(final ProxyFlag pf) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("--proxy-user ");
    String _username = pf.getUsername();
    _builder.append(_username);
    _builder.append(":");
    String _password = pf.getPassword();
    _builder.append(_password);
    return _builder;
  }
  
  protected CharSequence _compile(final HttpHeaderItem http) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("-H \"");
    String _field = http.getField();
    _builder.append(_field);
    _builder.append(": ");
    String _value = http.getValue();
    _builder.append(_value);
    _builder.append("\"");
    return _builder;
  }
  
  protected CharSequence _compile(final UrlParameterItem urlParam) {
    StringConcatenation _builder = new StringConcatenation();
    String _field = urlParam.getField();
    _builder.append(_field);
    _builder.append("=");
    String _value = urlParam.getValue();
    _builder.append(_value);
    return _builder;
  }
  
  protected CharSequence _compile(final FormFileFieldItem formField) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("-d \"@");
    String _value = formField.getValue();
    _builder.append(_value, " ");
    _builder.append("\"");
    return _builder;
  }
  
  protected CharSequence _compile(final DataFieldItem data) {
    CharSequence _xifexpression = null;
    if (this.formFlag) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(" ");
      _builder.append("-F ");
      String _field = data.getField();
      _builder.append(_field, " ");
      _builder.append("=");
      String _value = data.getValue();
      _builder.append(_value, " ");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      String _field_1 = data.getField();
      _builder_1.append(_field_1);
      _builder_1.append("=");
      String _value_1 = data.getValue();
      _builder_1.append(_value_1);
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  protected CharSequence _compile(final RawJsonFieldItem rawJsonField) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#TODO");
    return _builder;
  }
  
  public CharSequence compile(final Object bf) {
    if (bf instanceof BodyFlag) {
      return _compile((BodyFlag)bf);
    } else if (bf instanceof FormFlag) {
      return _compile((FormFlag)bf);
    } else if (bf instanceof HeadersFlag) {
      return _compile((HeadersFlag)bf);
    } else if (bf instanceof JsonFlag) {
      return _compile((JsonFlag)bf);
    } else if (bf instanceof AuthFlag) {
      return _compile((AuthFlag)bf);
    } else if (bf instanceof DataFieldItem) {
      return _compile((DataFieldItem)bf);
    } else if (bf instanceof DownloadFlag) {
      return _compile((DownloadFlag)bf);
    } else if (bf instanceof FormFileFieldItem) {
      return _compile((FormFileFieldItem)bf);
    } else if (bf instanceof HelpFlag) {
      return _compile((HelpFlag)bf);
    } else if (bf instanceof HttpHeaderItem) {
      return _compile((HttpHeaderItem)bf);
    } else if (bf instanceof ProxyFlag) {
      return _compile((ProxyFlag)bf);
    } else if (bf instanceof RawJsonFieldItem) {
      return _compile((RawJsonFieldItem)bf);
    } else if (bf instanceof TimeoutFlag) {
      return _compile((TimeoutFlag)bf);
    } else if (bf instanceof UrlParameterItem) {
      return _compile((UrlParameterItem)bf);
    } else if (bf instanceof VerboseFlag) {
      return _compile((VerboseFlag)bf);
    } else if (bf instanceof VersionFlag) {
      return _compile((VersionFlag)bf);
    } else if (bf instanceof CommandLineInterface) {
      return _compile((CommandLineInterface)bf);
    } else if (bf instanceof Flag) {
      return _compile((Flag)bf);
    } else if (bf instanceof Method) {
      return _compile((Method)bf);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(bf).toString());
    }
  }
}
