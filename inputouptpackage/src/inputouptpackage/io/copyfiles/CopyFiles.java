package inputouptpackage.io.copyfiles;

import java.io.File;

public class CopyFiles {
	public static void main(String[] args) {
		File sourceFiles = new File("D:\\GIT");
		File destFiles = new File("D:\\GITcopy");
		// System.out.println(sourceFiles.listFiles());
		// for(File file:sourceFiles.listFiles()) {
		// if(file.isDirectory())
		// System.out.println("Directory: " + file.getName());
		// else
		// System.out.println("File:" + file.getAbsolutePath());
		// }

		printDir(sourceFiles, destFiles);
	}

	public static void printDir(File sourceFiles, File destFiles) {
		if (sourceFiles.isDirectory()) {
			// System.out.println(sourceFiles.getAbsolutePath());
			// System.out.println(destFiles.getAbsolutePath());
			if (!destFiles.exists())
				destFiles.mkdir();
		}

		for (File file : sourceFiles.listFiles()) {
			File newFile = new File(destFiles, file.getName());
			System.out.println(newFile.getAbsolutePath());
			if (file.isDirectory()) {
				if (!newFile.exists()) {
					newFile.mkdir();
					printDir(file, newFile);
				}
			} else {
				printFiles(file, newFile);
			}
		}
	}
	
	public static void printFiles(File sourceFile, File destFile) {
		System.out.println(sourceFile.getAbsolutePath());
		System.out.println(destFile.getAbsolutePath());
	}
}
