package com.codeclan.example.files_and_folders.components;

import com.codeclan.example.files_and_folders.models.File;
import com.codeclan.example.files_and_folders.models.Folder;
import com.codeclan.example.files_and_folders.models.User;
import com.codeclan.example.files_and_folders.repositories.FileRepository;
import com.codeclan.example.files_and_folders.repositories.FolderRepository;
import com.codeclan.example.files_and_folders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        User user1 = new User("Stephen");
        userRepository.save(user1);

        Folder folder1 = new Folder("Folder 1", user1);
        folderRepository.save(folder1);
        Folder folder2 = new Folder("Folder 2", user1);
        folderRepository.save(folder2);
        Folder folder3 = new Folder("Folder 3", user1);
        folderRepository.save(folder3);

        File file1 = new File("file1", ".txt", "1mb", folder1);
        fileRepository.save(file1);
        File file2 = new File("file2", ".pdf", "5mb", folder1);
        fileRepository.save(file2);
        File file3 = new File("file3", ".doc", "2mb", folder1);
        fileRepository.save(file3);
        File file4 = new File("file4", ".png", "10mb", folder2);
        fileRepository.save(file4);
        File file5 = new File("file5", ".jpg", "8mb", folder2);
        fileRepository.save(file5);
        File file6 = new File("file6", ".exe", "50mb", folder3);
        fileRepository.save(file6);

//        user1.addFolder(folder1);
//        user1.addFolder(folder2);
//        user1.addFolder(folder3);
//        userRepository.save(user1);
//
//        folder1.addFile(file1);
//        folder1.addFile(file2);
//        folder1.addFile(file3);
//        folderRepository.save(folder1);
//
//        folder2.addFile(file4);
//        folder2.addFile(file5);
//        folderRepository.save(folder2);
//
//        folder3.addFile(file6);
//        folderRepository.save(folder3);
    }
}
