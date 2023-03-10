@singUp
Feature: Create a new user
  As an new user
  I wants to create account with my id, username, firstName, lastName, email, password, phone and userStatus
  To sign up successfully

  @happyPath
  Scenario Outline: A new user sign up
    Given The client user
    When the client complete <id>, <username>, <firstName>, <lastName>, <email>, <password>, <phone> and <userStatus> field
    Then The service response successfully status code 200
    Examples:
      |id|username|firstName|lastName |email           |password|phone     |userStatus|
      |0 |Primis  |Martin   |Grasselli|martin@gmail.com|1234    |1161839866|0         |
      |1 |Primiz  |Marrin   |Grasselli|marrin@gmail.com|5678    |1161839867|0         |
      |2 |Primix  |Mattin   |Grasselli|mattin@gmail.com|4321    |1161839868|0         |



