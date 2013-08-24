package MysticOres.Util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

import MysticOres.MysticOres;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Localizations
{
	private Localizations(){}
	
	public static void Initialize()
	{
		File source = Loader.instance().getReversedModObjectList().get(MysticOres.instance).getSource();
		Pattern pattern = Pattern.compile(".*(assets/" + "mysticmods/lang/(.+)\\.(.+))");
		for(String file : getResources(source, pattern))
		{
			Matcher matcher = pattern.matcher(file);
			matcher.find();
			String resource = "/" + matcher.group(1);
			String lang = matcher.group(2);
			boolean isXML = matcher.group(3).equalsIgnoreCase("XML");
			LanguageRegistry.instance().loadLocalization(resource, lang, isXML);
		}
	}
	
	private static Collection<String> getResources(File file, Pattern pattern)
	{
		ArrayList<String> retval = new ArrayList<String>();
		if(file.isDirectory())
			retval.addAll(getResourcesFromDirectory(file, pattern));
		else retval.addAll(getResourcesFromJarFile(file, pattern));
		return retval;
	}
	
	private static Collection<String> getResourcesFromJarFile(File file, Pattern pattern)
	{
		ArrayList<String> retval = new ArrayList<String>();
		ZipFile Zip;
		try 
		{
			Zip = new ZipFile(file);
		}
		catch (ZipException Ex)
		{
			throw new Error(Ex);
		}
		catch(IOException Ex)
		{
			throw new Error(Ex);
		}
		Enumeration<? extends ZipEntry> entries = Zip.entries();
		while (entries.hasMoreElements())
		{
			ZipEntry ZipE = entries.nextElement();
			String FileName = ZipE.getName();
			boolean accept = pattern.matcher(FileName).matches();
			if(accept)
				retval.add(FileName);
		}
		try 
		{
			Zip.close();
		}
		catch(IOException Ex)
		{
			throw new Error(Ex);
		}
		return retval;	
	}
	
	private static Collection<String> getResourcesFromDirectory(File directory, Pattern pattern)
	{
		ArrayList<String> retval = new ArrayList<String>();
		File[] FileList = directory.listFiles();
		for (File file : FileList)
		{
			if (file.isDirectory())
			{
				retval.addAll(getResourcesFromDirectory(file, pattern));
			}
			else try
			{
				String fileName = file.getCanonicalPath().replace('\\', '/');
				boolean accept = pattern.matcher(fileName).matches();
				if (accept) retval.add(fileName);
			}
			catch(final IOException e)
			{
				throw new Error(e);
			}
		}
		return retval;
	}
}
