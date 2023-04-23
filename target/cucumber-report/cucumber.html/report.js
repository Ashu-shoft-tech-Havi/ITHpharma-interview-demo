$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("IthPharma.feature");
formatter.feature({
  "line": 1,
  "name": "Home page Testing",
  "description": "/**\r\n* Created by Ashish Mor\r\n*/",
  "id": "home-page-testing",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9220938000,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "As a user i want to verify Home page",
  "description": "",
  "id": "home-page-testing;as-a-user-i-want-to-verify-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "As a user I am on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click On Home",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I verify text \"COVID 19\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click On registered Page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter Username \"Himesh\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter Password \"Himesh007@\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter Confrim Password \" Himesh007 \"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter FullName \"Ashish M mor\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter Email Adress \"Ashsihmor0757@gmail.com \"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter Hospital Name \"Barnet Hospital\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on registered button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I verify texta \"Passwords do not match\"",
  "keyword": "Then "
});
formatter.match({
  "location": "IthPharmaStep.asAUserIAmOnHomepage()"
});
formatter.result({
  "duration": 172720900,
  "status": "passed"
});
formatter.match({
  "location": "IthPharmaStep.iClickOnHome()"
});
formatter.result({
  "duration": 1581506400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "COVID 19",
      "offset": 15
    }
  ],
  "location": "IthPharmaStep.iVerifyText(String)"
});
formatter.result({
  "duration": 298855000,
  "status": "passed"
});
formatter.match({
  "location": "IthPharmaStep.iClickOnRegisteredPage()"
});
formatter.result({
  "duration": 336308700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Himesh",
      "offset": 18
    }
  ],
  "location": "IthPharmaStep.iEnterUsername(String)"
});
formatter.result({
  "duration": 1167937400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Himesh007@",
      "offset": 18
    }
  ],
  "location": "IthPharmaStep.iEnterPassword(String)"
});
formatter.result({
  "duration": 116308200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " Himesh007 ",
      "offset": 26
    }
  ],
  "location": "IthPharmaStep.iEnterConfrimPassword(String)"
});
formatter.result({
  "duration": 119256900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ashish M mor",
      "offset": 18
    }
  ],
  "location": "IthPharmaStep.iEnterFullName(String)"
});
formatter.result({
  "duration": 137702100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ashsihmor0757@gmail.com ",
      "offset": 22
    }
  ],
  "location": "IthPharmaStep.iEnterEmailAdress(String)"
});
formatter.result({
  "duration": 140646000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Barnet Hospital",
      "offset": 23
    }
  ],
  "location": "IthPharmaStep.iEnterHospitalName(String)"
});
formatter.result({
  "duration": 177754900,
  "status": "passed"
});
formatter.match({
  "location": "IthPharmaStep.iClickOnRegisteredButton()"
});
formatter.result({
  "duration": 41122000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Passwords do not match",
      "offset": 16
    }
  ],
  "location": "IthPharmaStep.iVerifyTexta(String)"
});
formatter.result({
  "duration": 379320800,
  "status": "passed"
});
formatter.after({
  "duration": 115600,
  "status": "passed"
});
});