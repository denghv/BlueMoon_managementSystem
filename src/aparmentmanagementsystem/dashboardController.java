package aparmentmanagementsystem;

import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import models.HoKhau;
import models.QuanTriVien;


public class dashboardController implements Initializable{
    
    @FXML
    private Button logout;
    
    @FXML
    private Button minimize;
    
    @FXML
    private Label username;
    
//    @FXML
//    private ComboBox<?> danhSachTrangThai_cbb;
//    
//    @FXML
//    private ComboBox<?> danhSachGioiTinh_cbb;
    
    @FXML
    private Button trangChu_btn;
    
    @FXML
    private Button khoanThu_btn;
    
    @FXML
    private Button thongTinHoGD_btn;
    
    @FXML
    private Button thongTinQTV_btn;
    
    @FXML
    private Button v2Update_btn;
    
    @FXML
    private Button traCuuV2Update_btn;
    
    @FXML
    private Button themV2Update_btn;
    
    @FXML
    private Button suaV2Update_btn;
    
    @FXML
    private Button themKhoanThu_btn;
    
    @FXML
    private Button suaKhoanThu_btn;
    
    @FXML
    private Button traCuuKhoanThu_btn;
    
    @FXML
    private Button traCuuPhiQuanLy_btn;
    
    @FXML
    private Button traCuuPhiDichVu_btn;
    
    @FXML
    private Button traCuuPhiKhac_btn;
    
    @FXML
    private Button themPhiQuanLy_btn;
    
    @FXML
    private Button themPhiDichVu_btn;
    
    @FXML
    private Button themPhiKhac_btn;
    
    @FXML
    private Button suaPhiQuanLy_btn;
    
    @FXML
    private Button suaPhiDichVu_btn;
    
    @FXML
    private Button suaPhiKhac_btn;
    
    @FXML
    private Button themThongTinHoGD_btn;
    
    @FXML
    private Button xoaThongTinHoGD_btn;
    
    @FXML
    private Button suaThongTinHoGD_btn;
    
    @FXML
    private Button traCuuThongTinHoGD_btn;
    
    @FXML
    private Button suaThongTinQTV_btn;
    
    @FXML
    private Button traCuuThongTinQTV_btn;
    
    @FXML
    private Button suaHoKhau_btn;
    
    @FXML
    private Button suaNhanKhau_btn;
    
    @FXML
    private Button traCuuHoKhau_btn;
    
    @FXML
    private Button traCuuNhanKhau_btn;
    
    @FXML
    private Button themHoKhau_btn;
    
    @FXML
    private Button themNhanKhau_btn;
    
    @FXML
    private Button suaThongTinQTV1_btn;
    
    @FXML
    private Button doiMatKhau_btn;
    
    @FXML
    private AnchorPane trangChu_form;
    
    @FXML
    private AnchorPane khoanThu_form;
    
    @FXML
    private AnchorPane thongTinHoGD_form;
    
    @FXML
    private AnchorPane thongTinQTV_form;
    
    @FXML
    private AnchorPane v2Update_form;
    
    @FXML
    private AnchorPane traCuuV2Update_form;
    
    @FXML
    private AnchorPane themV2Update_form;
    
    @FXML
    private AnchorPane suaV2Update_form;
    
    @FXML
    private AnchorPane themKhoanThu_form;
    
    @FXML
    private AnchorPane suaKhoanThu_form;
    
    @FXML
    private AnchorPane traCuuPhiQuanLy_form;
    
    @FXML
    private AnchorPane traCuuPhiDichVu_form;
    
    @FXML
    private AnchorPane traCuuPhiKhac_form;
    
    @FXML
    private AnchorPane themPhiQuanLy_form;
    
    @FXML
    private AnchorPane themPhiDichVu_form;
    
    @FXML
    private AnchorPane themPhiKhac_form;
    
    @FXML
    private AnchorPane suaPhiQuanLy_form;
    
    @FXML
    private AnchorPane suaPhiDichVu_form;
    
    @FXML
    private AnchorPane suaPhiKhac_form;
    
    @FXML
    private AnchorPane traCuuKhoanThu_form;

    @FXML
    private AnchorPane themThongTinHoGD_form;
    
    @FXML
    private AnchorPane suaThongTinHoGD_form;
    
    @FXML
    private AnchorPane traCuuThongTinHoGD_form;
        
    @FXML
    private AnchorPane suaHoKhau_form;
    
    @FXML
    private AnchorPane suaNhanKhau_form;
    
    @FXML
    private AnchorPane traCuuHoKhau_form;
    
    @FXML
    private AnchorPane traCuuNhanKhau_form;
    
    @FXML
    private AnchorPane themHoKhau_form;
    
    @FXML
    private AnchorPane themNhanKhau_form;
    
    @FXML
    private AnchorPane suaThongTinQTV_form;
    
    @FXML
    private AnchorPane traCuuThongTinQTV_form;
    
    @FXML
    private AnchorPane suaThongTinQTV1_form;
    
    @FXML
    private AnchorPane doiMatKhau_form;
    
    @FXML
    private TableView<QuanTriVien> QTV_table;
    
    @FXML
    private TableView<HoKhau> hoKhau_table;
    
    @FXML
    private TableColumn<QuanTriVien, String> emailQTV_col;

    @FXML
    private TableColumn<QuanTriVien, String> gioiTinhQTV_col;

    @FXML
    private TableColumn<QuanTriVien, String> hoTenQTV_col;
    
     @FXML
    private TableColumn<QuanTriVien, String> maQTV_col;

    @FXML
    private TableColumn<QuanTriVien, String> ngaySinhQTV_col;

    @FXML
    private TableColumn<QuanTriVien, String> sdtQTV_col;
    
    @FXML
    private TableColumn<QuanTriVien, String> diaChiQTV_col;
    
    @FXML
    private TableColumn<HoKhau, String> maHoKhau_col;
    
    @FXML
    private TableColumn<HoKhau, String> ngaySuaHoKhau_col;

    @FXML
    private TableColumn<HoKhau, String> ngayTaoHoKhau_col;
    
    @FXML
    private TableColumn<HoKhau, String> tenChuHo_col;
    
    @FXML
    private TableColumn<HoKhau, Double> dienTich_col;
    
    @FXML
    private TableColumn<HoKhau, String> diaChiHoKhau_col;
    
    @FXML
    private TableColumn<HoKhau, String> chatLuongChungCu_col;
    
    @FXML
    private TextField diaChiQTV_txt;
    
    @FXML
    private TextField maQTV_txt;
    
    @FXML
    private TextField hoTenQTV_txt;
    
    @FXML
    private TextField sdtQTV_txt;
    
    @FXML
    private TextField emailQTV_txt;
    
    @FXML
    private TextField gioiTinhQTV_txt;
    
    @FXML
    private DatePicker ngaySinhQTV_txt;
    
    @FXML
    private TextField searchQTV_txt;
    
    @FXML
    private TextField addDiaChiHoKhau_txt;

    @FXML
    private TextField addDienTich_txt;
    
    @FXML
    private TextField addChatLuongChungCu_txt;
    
    @FXML
    private TextField addMaHoKhau_txt;
    
    @FXML
    private TextField addTenChuHo_txt;
    
    @FXML
    private DatePicker addNgayTaoHoKhau_txt;
    
    
    
    
    

    //OPTION_COMBO_BOX
//    private String[] trangThai = {"Đã nộp đủ", "Chưa nộp đủ"};
//    
//    public void trangThaiNopTien(){
//        List<String> DStrangThai = new ArrayList<>();
//        
//        for(String data: trangThai) {
//            DStrangThai.add(data);
//        }
//        
//        ObservableList listData = FXCollections.observableArrayList(DStrangThai);
//        danhSachTrangThai_cbb.setItems(listData);
//    }
//    
//    
//    private String[] gioiTinh = {"Nam", "Nữ"};
//    
//    public void gioiTinh(){
//        List<String> DSgioiTinh = new ArrayList<>();
//        
//        for(String data: gioiTinh) {
//            DSgioiTinh.add(data);
//        }
//        
//        ObservableList listData = FXCollections.observableArrayList(DSgioiTinh);
//        danhSachGioiTinh_cbb.setItems(listData);
//    }
    
    //SWITCH_FORM
    public void switchForm(ActionEvent event){
        if(event.getSource() == trangChu_btn){
            trangChu_form.setVisible(true);
            khoanThu_form.setVisible(false);
            thongTinHoGD_form.setVisible(false);
            thongTinQTV_form.setVisible(false);
            v2Update_form.setVisible(false);
        } else if(event.getSource() == khoanThu_btn){
            trangChu_form.setVisible(false);
            khoanThu_form.setVisible(true);
            thongTinHoGD_form.setVisible(false);
            thongTinQTV_form.setVisible(false);
            v2Update_form.setVisible(false);
        } else if(event.getSource() == thongTinHoGD_btn){
            trangChu_form.setVisible(false);
            khoanThu_form.setVisible(false);
            thongTinHoGD_form.setVisible(true);
            thongTinQTV_form.setVisible(false);
            v2Update_form.setVisible(false);
        } else if(event.getSource() == thongTinQTV_btn) {
            trangChu_form.setVisible(false);
            khoanThu_form.setVisible(false);
            thongTinHoGD_form.setVisible(false);
            thongTinQTV_form.setVisible(true);
            v2Update_form.setVisible(false);
        } else if(event.getSource() == v2Update_btn) {
            trangChu_form.setVisible(false);
            khoanThu_form.setVisible(false);
            thongTinHoGD_form.setVisible(false);
            thongTinQTV_form.setVisible(false);
            v2Update_form.setVisible(true);
        }   
    }
    
    public void switchFormKhoanThu(ActionEvent event){
        if(event.getSource() == themKhoanThu_btn){
            themKhoanThu_form.setVisible(true);
            suaKhoanThu_form.setVisible(false);
            traCuuKhoanThu_form.setVisible(false);
        } else if(event.getSource() == suaKhoanThu_btn){
            themKhoanThu_form.setVisible(false);
            suaKhoanThu_form.setVisible(true);
            traCuuKhoanThu_form.setVisible(false);
        } else if(event.getSource() == traCuuKhoanThu_btn){
            themKhoanThu_form.setVisible(false);
            suaKhoanThu_form.setVisible(false);
            traCuuKhoanThu_form.setVisible(true);
        } 
    }
    
    public void switchFormTraCuuPhi(ActionEvent event){
        if(event.getSource() == traCuuPhiQuanLy_btn){
            traCuuPhiQuanLy_form.setVisible(true);
            traCuuPhiDichVu_form.setVisible(false);
            traCuuPhiKhac_form.setVisible(false);
        } else if(event.getSource() == traCuuPhiDichVu_btn){
            traCuuPhiQuanLy_form.setVisible(false);
            traCuuPhiDichVu_form.setVisible(true);
            traCuuPhiKhac_form.setVisible(false);
        } else if(event.getSource() == traCuuPhiKhac_btn){
            traCuuPhiQuanLy_form.setVisible(false);
            traCuuPhiDichVu_form.setVisible(false);
            traCuuPhiKhac_form.setVisible(true);
        }
    } 
    
    public void switchFormThemPhi(ActionEvent event){
        if(event.getSource() == themPhiQuanLy_btn){
            themPhiQuanLy_form.setVisible(true);
            themPhiDichVu_form.setVisible(false);
            themPhiKhac_form.setVisible(false);
        } else if(event.getSource() == themPhiDichVu_btn){
            themPhiQuanLy_form.setVisible(false);
            themPhiDichVu_form.setVisible(true);
            themPhiKhac_form.setVisible(false);
        } else if(event.getSource() == themPhiKhac_btn){
            themPhiQuanLy_form.setVisible(false);
            themPhiDichVu_form.setVisible(false);
            themPhiKhac_form.setVisible(true);
        }
    }
    
    public void switchFormSuaPhi(ActionEvent event){
        if(event.getSource() == suaPhiQuanLy_btn){
            suaPhiQuanLy_form.setVisible(true);
            suaPhiDichVu_form.setVisible(false);
            suaPhiKhac_form.setVisible(false);
        } else if(event.getSource() == suaPhiDichVu_btn){
            suaPhiQuanLy_form.setVisible(false);
            suaPhiDichVu_form.setVisible(true);
            suaPhiKhac_form.setVisible(false);
        } else if(event.getSource() == suaPhiKhac_btn){
            suaPhiQuanLy_form.setVisible(false);
            suaPhiDichVu_form.setVisible(false);
            suaPhiKhac_form.setVisible(true);
        }
    }
    
    public void switchFormThongTinHoGD(ActionEvent event){
        if(event.getSource() == themThongTinHoGD_btn){
            themThongTinHoGD_form.setVisible(true);
            suaThongTinHoGD_form.setVisible(false);
            traCuuThongTinHoGD_form.setVisible(false);
        } else if(event.getSource() == suaThongTinHoGD_btn){
            themThongTinHoGD_form.setVisible(false);
            suaThongTinHoGD_form.setVisible(true);
            traCuuThongTinHoGD_form.setVisible(false);
        } else if(event.getSource() == traCuuThongTinHoGD_btn){
            themThongTinHoGD_form.setVisible(false);
            suaThongTinHoGD_form.setVisible(false);
            traCuuThongTinHoGD_form.setVisible(true);
        } 
    }
    
    public void switchFormSuaHoNhanKhau(ActionEvent event){
        if(event.getSource() == suaHoKhau_btn){
            suaHoKhau_form.setVisible(true);
            suaNhanKhau_form.setVisible(false);
        } else if(event.getSource() == suaNhanKhau_btn){
            suaHoKhau_form.setVisible(false);
            suaNhanKhau_form.setVisible(true);
        }
    }    
    
    public void switchFormTraCuuHoNhanKhau(ActionEvent event){
        if(event.getSource() == traCuuHoKhau_btn){
            traCuuHoKhau_form.setVisible(true);
            traCuuNhanKhau_form.setVisible(false);
        } else if(event.getSource() == traCuuNhanKhau_btn){
            traCuuHoKhau_form.setVisible(false);
            traCuuNhanKhau_form.setVisible(true);
        }
    }    
    
    public void switchFormThemHoNhanKhau(ActionEvent event){
        if(event.getSource() == themHoKhau_btn){
            themHoKhau_form.setVisible(true);
            themNhanKhau_form.setVisible(false);
        } else if(event.getSource() == themNhanKhau_btn){
            themHoKhau_form.setVisible(false);
            themNhanKhau_form.setVisible(true);
        }
    } 
    
    public void switchFormThongTinQTV(ActionEvent event){
        if(event.getSource() == suaThongTinQTV_btn){
            suaThongTinQTV_form.setVisible(true);
            traCuuThongTinQTV_form.setVisible(false);
        } else if(event.getSource() == traCuuThongTinQTV_btn){
            suaThongTinQTV_form.setVisible(false);
            traCuuThongTinQTV_form.setVisible(true);
        } 
    }
    
    public void switchFormSuaThongTinQTV(ActionEvent event){
        if(event.getSource() == suaThongTinQTV1_btn){
            suaThongTinQTV1_form.setVisible(true);
            doiMatKhau_form.setVisible(false);
        } else if(event.getSource() == doiMatKhau_btn){
            suaThongTinQTV1_form.setVisible(false);
            doiMatKhau_form.setVisible(true);
        }
    } 
    
    public void switchFormV2Update(ActionEvent event){
        if(event.getSource() == traCuuV2Update_btn){
            traCuuV2Update_form.setVisible(true);
            themV2Update_form.setVisible(false);
            suaV2Update_form.setVisible(false);
        } else if(event.getSource() == themV2Update_btn){
            traCuuV2Update_form.setVisible(false);
            themV2Update_form.setVisible(true);
            suaV2Update_form.setVisible(false);
        } else if(event.getSource() == suaV2Update_btn){
            traCuuV2Update_form.setVisible(false);
            themV2Update_form.setVisible(false);
            suaV2Update_form.setVisible(true);
        }
    }    
    
    
    private double x = 0;
    private double y = 0;
    
    String query = null;
    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet resultSet = null;
    QuanTriVien quantrivien = null;
    HoKhau hokhau = null;
    
    int myQTVIndex;
    
    
    ObservableList<QuanTriVien> QuanTriVienList = FXCollections.observableArrayList();
    //Table view QTV
    
    void updateQTVTable() {
        try {
            QuanTriVienList.clear();

            pst = connection.prepareStatement("select * from quantrivien");
            resultSet = pst.executeQuery();

            while(resultSet.next()){
                QuanTriVienList.add(new QuanTriVien(resultSet.getString("maQTV"), 
                        resultSet.getString("hoTen"), 
                        resultSet.getDate("ngaySinh"), 
                        resultSet.getString("gioiTinh"), 
                        resultSet.getString("sdt"),
                        resultSet.getString("email"), 
                        resultSet.getString("diaChi")));
                QTV_table.setItems(QuanTriVienList);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(dashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadQTV() {
        connection = database.connectDb();
        updateQTVTable();
        
        maQTV_col.setCellValueFactory(new PropertyValueFactory<>("maQTV"));
        hoTenQTV_col.setCellValueFactory(new PropertyValueFactory<>("hoTen"));
        ngaySinhQTV_col.setCellValueFactory(new PropertyValueFactory<>("ngaySinh"));
        gioiTinhQTV_col.setCellValueFactory(new PropertyValueFactory<>("gioiTinh"));
        sdtQTV_col.setCellValueFactory(new PropertyValueFactory<>("sdt"));
        emailQTV_col.setCellValueFactory(new PropertyValueFactory<>("email"));  
        diaChiQTV_col.setCellValueFactory(new PropertyValueFactory<>("diaChi"));
        
        QTV_table.setRowFactory( tv -> {
            TableRow<QuanTriVien> myQuanTriVienRow = new TableRow<>();
                myQuanTriVienRow.setOnMouseClicked (event -> 
                    {
                        if (event.getClickCount() == 1 && (!myQuanTriVienRow.isEmpty()))
                    {   
                        myQTVIndex =  QTV_table.getSelectionModel().getSelectedIndex();
         
                        maQTV_txt.setText(QTV_table.getItems().get(myQTVIndex).getMaQTV());
                        hoTenQTV_txt.setText(QTV_table.getItems().get(myQTVIndex).getHoTen());
                        // ngaySinhQTV_txt changes to Date type.
                        Date ngaySinhDate = QTV_table.getItems().get(myQTVIndex).getNgaySinh();
                        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        String ngaySinhString = dateFormat.format(ngaySinhDate);
                        ngaySinhQTV_txt.getEditor().setText(ngaySinhString);

                        gioiTinhQTV_txt.setText(QTV_table.getItems().get(myQTVIndex).getGioiTinh());
                        sdtQTV_txt.setText(QTV_table.getItems().get(myQTVIndex).getSdt());
                        emailQTV_txt.setText(QTV_table.getItems().get(myQTVIndex).getEmail());
                        diaChiQTV_txt.setText(QTV_table.getItems().get(myQTVIndex).getDiaChi());         
                                              
                }
             });
                return myQuanTriVienRow;
                   });
        
    }
    
    // add QTV
    @FXML
    void addQTV(MouseEvent event) {
        connection = database.connectDb();
        String maQTV = maQTV_txt.getText();
        String hoTenQTV = hoTenQTV_txt.getText();        
        String ngaySinhQTV = String.valueOf(ngaySinhQTV_txt.getValue());
        String gioiTinhQTV = gioiTinhQTV_txt.getText();
        String sdtQTV = sdtQTV_txt.getText();
        String emailQTV = emailQTV_txt.getText();
        String diaChiQTV = diaChiQTV_txt.getText();
        
        
        if (maQTV.isEmpty() || hoTenQTV.isEmpty() || ngaySinhQTV.isEmpty() || gioiTinhQTV.isEmpty() || sdtQTV.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Xin hãy điền đầy đủ thông tin cần thiết !");
            alert.showAndWait();
        }
        
        try 
        {
            pst = connection.prepareStatement("insert into quantrivien(MaQTV, HoTen, NgaySinh, GioiTinh, SDT, Email, DiaChi) values(?,?,?,?,?,?,?)");
            pst.setString(1, maQTV);
            pst.setString(2, hoTenQTV);
            pst.setString(3, ngaySinhQTV);
            pst.setString(4, gioiTinhQTV);
            pst.setString(5, sdtQTV);
            pst.setString(6, emailQTV);
            pst.setString(7, diaChiQTV);
            pst.executeUpdate();
          
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Thêm mới quản trị viên");
            alert.setHeaderText("Thêm quản trị viên");
            alert.setContentText("Đã thêm quản trị viên thành công !");
            alert.showAndWait();
            
            loadQTV();
            searchQTV();
            clearQTV();
        } 
        catch (SQLException ex)
        {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // delete QTV
    @FXML
    void deleteQTV(MouseEvent event) {
        connection = database.connectDb();
        String maQTV = maQTV_txt.getText();
        String hoTenQTV = hoTenQTV_txt.getText();        
        String ngaySinhQTV = String.valueOf(ngaySinhQTV_txt.getValue());
        String gioiTinhQTV = gioiTinhQTV_txt.getText();
        String sdtQTV = sdtQTV_txt.getText();
        String emailQTV = emailQTV_txt.getText();
        String diaChiQTV = diaChiQTV_txt.getText();
        
        try {
        if (maQTV.isEmpty() || hoTenQTV.isEmpty() || ngaySinhQTV.isEmpty() || gioiTinhQTV.isEmpty() || sdtQTV.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Xin hãy điền đầy đủ thông tin cần thiết !");
            alert.showAndWait();
        } else {
                Alert alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Xác nhận xóa");
                alert.setHeaderText(null);
                alert.setContentText("Bạn có chắc muốn XÓA quản trị viên " + maQTV_txt.getText() + "?");

                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)) {

                    pst = connection.prepareStatement("delete from quantrivien where MaQTV = ? ");
                    pst.setString(1, maQTV);
                    pst.executeUpdate();

                    pst = connection.prepareStatement("select MaQTV from quantrivien where maQTV = ?");
                    pst.setString(1, maQTV);
                    resultSet = pst.executeQuery();

                    // IF maQTV IS EXIST THEN PROCEED TO DELETE
                    if (resultSet.next()) {

                        pst = connection.prepareStatement("delete from quantrivien where maQTV = ?");
                        pst.setString(1, maQTV);
                        pst.executeUpdate();

                    }// IF NOT THEN NVM

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Thông báo xóa quản trị viên");
                    alert.setHeaderText(null);
                    alert.setContentText("Xóa thông tin quản trị viên thành công !");
                    alert.showAndWait();

                    // TO UPDATE quantrivien
                    loadQTV();
                    searchQTV();
                    clearQTV();

                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // search QTV
 
    void searchQTV() {
        loadQTV();
        QTV_table.setItems(QuanTriVienList);
        FilteredList<QuanTriVien> filterData = new FilteredList<>(QuanTriVienList, b -> true);
            
            searchQTV_txt.textProperty().addListener((observable, oldValue, newValue) -> {
                filterData.setPredicate(quantrivien -> {
                    if (newValue==null || newValue.isEmpty()) {
                        return true;
                    }
                    String toLowerCaseFilter = newValue.toLowerCase();
                    if(quantrivien.getMaQTV().contains(newValue)){
                        return true;
                    } else if(quantrivien.getHoTen().toLowerCase().contains(toLowerCaseFilter)){
                        return true;
                    } else if(quantrivien.getGioiTinh().toLowerCase().contains(toLowerCaseFilter)){
                        return true;
                    } else if(quantrivien.getSdt().toLowerCase().contains(toLowerCaseFilter)){
                        return true;
                    } else if(quantrivien.getEmail().toLowerCase().contains(toLowerCaseFilter)){
                        return true;
                    } else if(quantrivien.getDiaChi().toLowerCase().contains(toLowerCaseFilter)){
                        return true;
                    } else return false;
                   
                });
            });
                SortedList<QuanTriVien> sortedQTV = new SortedList<>(filterData);
                sortedQTV.comparatorProperty().bind(QTV_table.comparatorProperty());
                QTV_table.setItems(sortedQTV);
            }
    
    public void clearQTV() {
            maQTV_txt.setText(null);
            hoTenQTV_txt.setText(null);
            ngaySinhQTV_txt.setValue(null);
            gioiTinhQTV_txt.setText(null);
            sdtQTV_txt.setText(null);
            emailQTV_txt.setText(null);
            diaChiQTV_txt.setText(null);
    }
    
    
    
    // HO KHAU FROM HERE
    ObservableList<HoKhau> HoKhauList = FXCollections.observableArrayList();
    //Table view QTV
    
    void updateHoKhauTable() {
        try {
            HoKhauList.clear();

            pst = connection.prepareStatement("select * from hokhau");
            resultSet = pst.executeQuery();

            while(resultSet.next()){
                HoKhauList.add(new HoKhau(resultSet.getString("maHoKhau"), 
                        resultSet.getString("tenChuHo"), 
                        resultSet.getString("diaChiHoKhau"), 
                        resultSet.getDouble("dienTich"),
                        resultSet.getString("chatLuongChungCu"), 
                        resultSet.getDate("ngayTao"),
                        resultSet.getDate("ngaySua")));
                hoKhau_table.setItems(HoKhauList);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(dashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadHoKhau() {
        connection = database.connectDb();
        updateHoKhauTable();
        
        maHoKhau_col.setCellValueFactory(new PropertyValueFactory<>("maHoKhau"));
        tenChuHo_col.setCellValueFactory(new PropertyValueFactory<>("tenChuHo"));
        diaChiHoKhau_col.setCellValueFactory(new PropertyValueFactory<>("diaChiHoKhau"));
        dienTich_col.setCellValueFactory(new PropertyValueFactory<>("dienTich"));
        chatLuongChungCu_col.setCellValueFactory(new PropertyValueFactory<>("chatLuongChungCu"));
        ngayTaoHoKhau_col.setCellValueFactory(new PropertyValueFactory<>("ngayTao"));  
        ngaySuaHoKhau_col.setCellValueFactory(new PropertyValueFactory<>("ngaySua"));
        
    }
    
    // add Hokhau
    @FXML
    void addHoKhau(MouseEvent event) {
        connection = database.connectDb();
        
        String maHoKhau = addMaHoKhau_txt.getText();
        String tenChuHo = addTenChuHo_txt.getText();        
        String ngayThemHoKhau = String.valueOf(addNgayTaoHoKhau_txt.getValue());
        String diaChiHoKhau = addDiaChiHoKhau_txt.getText();
        String dienTichHoKhau = addDienTich_txt.getText();
        String chatLuongChungCu = addChatLuongChungCu_txt.getText();        
        
        if (maHoKhau.isEmpty() || tenChuHo.isEmpty() || ngayThemHoKhau.isEmpty() || diaChiHoKhau.isEmpty() || dienTichHoKhau.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Xin hãy điền đầy đủ thông tin cần thiết !");
            alert.showAndWait();
        }
        
        try 
        {
            pst = connection.prepareStatement("insert into hokhau(MaHoKhau, TenChuHo, DiaChiHoKhau, DienTich, ChatLuongChungCu, NgaySua) values(?,?,?,?,?,?)");
            pst.setString(1, maHoKhau);
            pst.setString(2, tenChuHo);
            pst.setString(3, diaChiHoKhau);
            pst.setString(4, dienTichHoKhau);
            pst.setString(5, chatLuongChungCu);
            pst.setString(6, ngayThemHoKhau);
            pst.executeUpdate();
          
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Thêm mới hộ khẩu");
            alert.setContentText("Đã thêm hộ khẩu thành công !");
            alert.showAndWait();
            
            loadHoKhau();
            clearHoKhau();
        } 
        catch (SQLException ex)
        {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // delete QTV
//    @FXML
//    void deleteQTV(MouseEvent event) {
//        connection = database.connectDb();
//        String maQTV = maQTV_txt.getText();
//        String hoTenQTV = hoTenQTV_txt.getText();        
//        String ngaySinhQTV = String.valueOf(ngaySinhQTV_txt.getValue());
//        String gioiTinhQTV = gioiTinhQTV_txt.getText();
//        String sdtQTV = sdtQTV_txt.getText();
//        String emailQTV = emailQTV_txt.getText();
//        String diaChiQTV = diaChiQTV_txt.getText();
//        
//        try {
//        if (maQTV.isEmpty() || hoTenQTV.isEmpty() || ngaySinhQTV.isEmpty() || gioiTinhQTV.isEmpty() || sdtQTV.isEmpty()) {
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setHeaderText(null);
//            alert.setContentText("Xin hãy điền đầy đủ thông tin cần thiết !");
//            alert.showAndWait();
//        } else {
//                Alert alert = new Alert(AlertType.CONFIRMATION);
//                alert.setTitle("Xác nhận xóa");
//                alert.setHeaderText(null);
//                alert.setContentText("Bạn có chắc muốn XÓA quản trị viên " + maQTV_txt.getText() + "?");
//
//                Optional<ButtonType> option = alert.showAndWait();
//
//                if (option.get().equals(ButtonType.OK)) {
//
//                    pst = connection.prepareStatement("delete from quantrivien where MaQTV = ? ");
//                    pst.setString(1, maQTV);
//                    pst.executeUpdate();
//
//                    pst = connection.prepareStatement("select MaQTV from quantrivien where maQTV = ?");
//                    pst.setString(1, maQTV);
//                    resultSet = pst.executeQuery();
//
//                    // IF maQTV IS EXIST THEN PROCEED TO DELETE
//                    if (resultSet.next()) {
//
//                        pst = connection.prepareStatement("delete from quantrivien where maQTV = ?");
//                        pst.setString(1, maQTV);
//                        pst.executeUpdate();
//
//                    }// IF NOT THEN NVM
//
//                    alert = new Alert(AlertType.INFORMATION);
//                    alert.setTitle("Thông báo xóa quản trị viên");
//                    alert.setHeaderText(null);
//                    alert.setContentText("Xóa thông tin quản trị viên thành công !");
//                    alert.showAndWait();
//
//                    // TO UPDATE quantrivien
//                    loadQTV();
//                    searchQTV();
//                    clearQTV();
//
//                }
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//    
//    // search QTV
// 
//    void searchQTV() {
//        loadQTV();
//        QTV_table.setItems(QuanTriVienList);
//        FilteredList<QuanTriVien> filterData = new FilteredList<>(QuanTriVienList, b -> true);
//            
//            searchQTV_txt.textProperty().addListener((observable, oldValue, newValue) -> {
//                filterData.setPredicate(quantrivien -> {
//                    if (newValue==null || newValue.isEmpty()) {
//                        return true;
//                    }
//                    String toLowerCaseFilter = newValue.toLowerCase();
//                    if(quantrivien.getMaQTV().contains(newValue)){
//                        return true;
//                    } else if(quantrivien.getHoTen().toLowerCase().contains(toLowerCaseFilter)){
//                        return true;
//                    } else if(quantrivien.getGioiTinh().toLowerCase().contains(toLowerCaseFilter)){
//                        return true;
//                    } else if(quantrivien.getSdt().toLowerCase().contains(toLowerCaseFilter)){
//                        return true;
//                    } else if(quantrivien.getEmail().toLowerCase().contains(toLowerCaseFilter)){
//                        return true;
//                    } else if(quantrivien.getDiaChi().toLowerCase().contains(toLowerCaseFilter)){
//                        return true;
//                    } else return false;
//                   
//                });
//            });
//                SortedList<QuanTriVien> sortedQTV = new SortedList<>(filterData);
//                sortedQTV.comparatorProperty().bind(QTV_table.comparatorProperty());
//                QTV_table.setItems(sortedQTV);
//            }
    
    public void clearHoKhau() {
            addMaHoKhau_txt.setText(null);
            addTenChuHo_txt.setText(null);
            addNgayTaoHoKhau_txt.setValue(null);
            addDienTich_txt.setText(null);
            addDiaChiHoKhau_txt.setText(null);
            addChatLuongChungCu_txt.setText(null);
    }
    
    
    
    
    @FXML
    void searchMaHoGiaDinh(MouseEvent event) {

    }

    @FXML
    void searchNhanKhau(MouseEvent event) {

    }
    
    @FXML
    void addNhanKhau(MouseEvent event) {

    }

    @FXML
    void addPhiDichVu(MouseEvent event) {

    }

    @FXML
    void addPhiKhac(MouseEvent event) {

    }

    @FXML
    void addPhiQuanLy(MouseEvent event) {

    }

    @FXML
    void changeHoKhau(MouseEvent event) {

    }

    @FXML
    void changeNhanKhau(MouseEvent event) {

    }

    @FXML
    void changePhiDichVu(MouseEvent event) {

    }

    @FXML
    void changePhiKhac(MouseEvent event) {

    }

    @FXML
    void changePhiQuanLy(MouseEvent event) {

    }

    @FXML
    void changeQTV(MouseEvent event) {

    }

    @FXML
    void close(ActionEvent event) {

    }

    @FXML
    void closeAddFee(MouseEvent event) {

    }

    @FXML
    void closeAddInForFamily(MouseEvent event) {

    }

    @FXML
    void closeChangeFee(MouseEvent event) {

    }

    @FXML
    void closeChangeInForFamily(MouseEvent event) {

    }

    @FXML
    void closeChangePass(MouseEvent event) {

    }

    @FXML
    void delete(MouseEvent event) {

    }

    @FXML
    void deletePhi(MouseEvent event) {

    }
    
    @FXML
    void insertFormQTV(ActionEvent event) {

    }
    //LOG_OUT
    public void logout() {
        try{
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Xác nhận");
            alert.setHeaderText(null);
            alert.setContentText("Bạn có chắc chắn muốn đăng xuất?");
            Optional<ButtonType> option = alert.showAndWait();
            
            if(option.get().equals(ButtonType.OK)){
                
                logout.getScene().getWindow().hide();
                
                Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(root);
                
                root.setOnMousePressed((MouseEvent event) -> {
                    x = event.getSceneX();
                    y = event.getSceneY();
                });
        
            root.setOnMouseDragged((MouseEvent event) -> {
                stage.setX(event.getScreenX() - x);
                stage.setY(event.getScreenY() - y);
            
                stage.setOpacity(.8f);
            });
        
            root.setOnMouseReleased((MouseEvent event) -> {
                stage.setOpacity(1);
            });
        
            stage.initStyle(StageStyle.TRANSPARENT);
                
            stage.setScene(scene);
            stage.show();
            }
        }catch(Exception e){e.printStackTrace();}
    }
    
    //SHOW_ACCOUNT_NAME
    public void displayUsername(){
        String user = data.username;
        user = user.substring(0, 1).toUpperCase() + user.substring(1);
        username.setText(user);
    }
    
    //CLOSE_PROGRAM
    public void close() {
        System.exit(0);
    }
    
    //MINIMIZE_PROGRAM
    public void minimize() {
        Stage stage = (Stage)minimize.getScene().getWindow();
        stage.setIconified(true);
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        displayUsername();
//        trangThaiNopTien();
        loadQTV();
        searchQTV();
        
        loadHoKhau();
        
    }
    
}
