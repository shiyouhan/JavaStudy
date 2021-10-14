package top.syhan.address.view;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import top.syhan.address.MainApp;
import top.syhan.address.config.AppConstant;
import top.syhan.address.model.Person;
import top.syhan.address.util.DateUtil;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author apple
 */

public class PersonController {

    private MainApp mainApp;

    private FilteredList<Person> filteredData;
    @FXML
    private TableView<Person> personTable;

    @FXML
    private TableColumn<Person,String> nameColumn;

    @FXML
    private TableColumn<Person,String> clazzColumn;

    @FXML
    private Label nameLabel;

    @FXML
    private Label genderLabel;

    @FXML
    private Label addressLabel;

    @FXML
    private Label birthdayLabel;

    @FXML
    private ImageView avatar;

//    private ObservableList<Person> personData;

    @FXML
    private TextField inputField;

    public PersonController(){

    }

    @FXML
    private void initialize(){
        nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        clazzColumn.setCellValueFactory(cellData -> cellData.getValue().clazzProperty());
//        genderColumn.setCellValueFactory(cellData -> cellData.getValue().genderProperty());
//        showPersonDetails(null);
        personTable.getSelectionModel().selectedItemProperty().addListener(
                (observable,oldValue,newValue) -> showPersonDetails(newValue));
    }

    /**
     * 接收主窗体对象，获取数据
     *
     * @param mainApp mainApp
     */

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
        filteredData = new FilteredList<>(mainApp.getPersonData(), p -> true);
        inputField.textProperty().addListener((observable, oldValue, newValue) -> filteredData.setPredicate(person -> {
            if (newValue == null || newValue.isEmpty()) {
                return true;
            }
            String lowerCaseFilter = newValue.toLowerCase();
            return person.getName().toLowerCase().contains(lowerCaseFilter)
//                    || person.getGender().toLowerCase().contains(lowerCaseFilter)
                    || person.getClazz().toLowerCase().contains(lowerCaseFilter)
                    || person.getAddress().toLowerCase().contains(lowerCaseFilter);
        }));
        personTable.setItems(filteredData);
        showPersonDetails(filteredData.get(0));
        personTable.getSelectionModel().select(0);
    }

    /**
     * 显示用户详情
     *
     * @param person person
     */
    private void showPersonDetails(Person person){
        if (person != null){
            nameLabel.setText(person.getName());
//            clazzLabel.setText(person.getClazz());
            genderLabel.setText(person.getGender());
            addressLabel.setText(person.getAddress());
            birthdayLabel.setText(DateUtil.format(person.getBirthday()));
            avatar.setImage(person.getAvatar());
        }else {
            nameLabel.setText("姓名");
//            clazzLabel.setText("班级");
            genderLabel.setText("性别");
            addressLabel.setText("地址");
            birthdayLabel.setText("生日");
            avatar.setImage(new Image("http://5b0988e595225.cdn.sohucs.com/images/20181128/e44ca54a854c4860b9738b11425845a2.jpeg"));

        }
    }

    /**
     * 删除用户
     */
    public void handleDeletePerson() {
        int selectedIndex = personTable.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            mainApp.getPersonData().remove(selectedIndex);
        } else {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("提示");
            a.setHeaderText("错误操作");
            a.setContentText("必须选择人员才能删除");
            a.showAndWait();
        }
    }

    /***
     * 新增人员
     */
    public void handleNewPerson() {
        Person tempPerson = new Person(
                "施友涵", "软件2126", "男", "江苏无锡",
                LocalDate.of(2000,8,16),
                new Image("http://5b0988e595225.cdn.sohucs.com/images/20181128/e44ca54a854c4860b9738b11425845a2.jpeg"));
        mainApp.showEditPerson(tempPerson, AppConstant.NEW_PERSON);
    }

    /**
     * 查询用户
     */
    public void handleSearchPerson() {
        String keywords = inputField.getText().trim();
        ObservableList<Person> items = personTable.getItems();
        List<Person> list  = items.stream()
                .filter(p -> p.getName().contains(keywords) ||p.getClazz().contains(keywords))
                .collect(Collectors.toList());
        if (list.size() != 0) {
            personTable.setItems(FXCollections.observableList(list));
            showPersonDetails(list.get(0));
        }
        inputField.setText("");
    }

    /**
     * 编辑人员
     * */

    public void handleEditPerson() {
        Person selectedPerson = personTable.getSelectionModel().getSelectedItem();
        if (selectedPerson != null) {
            mainApp.showEditPerson(selectedPerson, AppConstant.EDIT_PERSON);
        } else {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("提示");
            a.setHeaderText("错误操作");
            a.setContentText("必须选择人员才能编辑");
            a.showAndWait();
        }
    }

}
