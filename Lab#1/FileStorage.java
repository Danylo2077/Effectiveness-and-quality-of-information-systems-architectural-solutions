public interface FileStorage {
    void uploadFile(String fileName, byte[] fileData);
    byte[] downloadFile(String fileName);
    void deleteFile(String fileName);
}