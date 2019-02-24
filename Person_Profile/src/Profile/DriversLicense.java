/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profile;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.Image;
/**
 *
 * @author rusha
 */
public class DriversLicense {
    private String LicenseNumber;
    private String DateOfIssue;
    private String DateOfExpiration;
    private String BloodType;
    private ImageIcon Images;
    public String getLicenseNumber() {
        return LicenseNumber;
    }

    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    public String getDateOfIssue() {
        return DateOfIssue;
    }

    public void setDateOfIssue(String DateOfIssue) {
        this.DateOfIssue = DateOfIssue;
    }

    public String getDateOfExpiration() {
        return DateOfExpiration;
    }

    public void setDateOfExpiration(String DateOfExpiration) {
        this.DateOfExpiration = DateOfExpiration;
    }

    public String getBloodType() {
        return BloodType;
    }

    public void setBloodType(String BloodType) {
        this.BloodType = BloodType;
    }

    public ImageIcon getImages() {
        return Images;
    }

    public void setImages(ImageIcon Images) {
        this.Images = Images;
    }
   
    
}
