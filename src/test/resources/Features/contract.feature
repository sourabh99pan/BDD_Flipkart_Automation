Feature: Feature to test Edit Application field1

  Scenario Outline: TC_04_Check contract functionality
    Given Contract user enters "<username>" and "<password>"
    When user enters language and policyholder
    Then user enters contract info "<firstname>" and "<lastname>"
    Then user enters maritalStatus "<Gender>" and "<dob>"
    Then user select address "<city>" and "<profession>"
    Then user select province "<postalCode>" and "<Telephone>"
    Then user enter branch number "<FinInsNumber>" and "<AccNum>"

    Examples: 
      | username                   | password        | firstname | lastname | Gender | dob      | city   | profession | postalCode | Telephone    | FinInsNumber | AccNum  |
      | breathelife@lacapitale.com | MmdZLQ@7FWj0YbW | Dummy     | Test     | Male   | 19920202 | Quebec | QA         | M1L 3K7    | 412-313-2423 |          111 | 1345629 |
