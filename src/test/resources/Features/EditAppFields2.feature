Feature: Feature to test Edit Application field2


  Scenario Outline: TC_03_Check user is able to Edit Application
    Given user enters credentials "<username>" and "<password>"
    When user enters details "<firstname>" and "<lastname>"
    Then select sex and marital status
    
    Examples: 
    |      username     | password   |firstname|lastname|
    |breathelife@lacapitale.com|MmdZLQ@7FWj0YbW|Dummy    |Test|