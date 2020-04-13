/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_crud;

/**
 *
 * @author ASUS
 */
public class MVC_CRUD {
    View_CRUD viewCRUD = new View_CRUD();
    Model_CRUD modelCRUD = new Model_CRUD();
    Controller_CRUD controllerCRUD = new Controller_CRUD(modelCRUD, viewCRUD);
}
