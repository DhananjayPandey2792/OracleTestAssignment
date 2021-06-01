$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Accordion.feature");
formatter.feature({
  "line": 2,
  "name": "Accordion functionality in demoqa",
  "description": "",
  "id": "accordion-functionality-in-demoqa",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@demoqa"
    }
  ]
});
formatter.before({
  "duration": 3919368420,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "To verify accordion text in accordion page",
  "description": "",
  "id": "accordion-functionality-in-demoqa;to-verify-accordion-text-in-accordion-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "i launch url \"https://demoqa.com/accordion/\" in demoqa",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "validate text Vivamus in section 1",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "validate text Vivamus in section 2",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "validate text Vivamus in section 3",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "validate text Vivamus in section 4",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://demoqa.com/accordion/",
      "offset": 14
    }
  ],
  "location": "Stepdefinition.launchUrl(String)"
});
formatter.result({
  "duration": 3875635417,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 33
    }
  ],
  "location": "Stepdefinition.validateText(int)"
});
formatter.result({
  "duration": 81534280,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 33
    }
  ],
  "location": "Stepdefinition.validateText(int)"
});
formatter.result({
  "duration": 128000421,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 33
    }
  ],
  "location": "Stepdefinition.validateText(int)"
});
formatter.result({
  "duration": 138124062,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 33
    }
  ],
  "location": "Stepdefinition.validateText(int)"
});
formatter.result({
  "duration": 132739597,
  "status": "passed"
});
formatter.after({
  "duration": 332870,
  "status": "passed"
});
formatter.uri("Menu.feature");
formatter.feature({
  "line": 2,
  "name": "Menu functionality in demoqa",
  "description": "",
  "id": "menu-functionality-in-demoqa",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@demoqa"
    }
  ]
});
formatter.before({
  "duration": 63469697,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "To verify menu navigation in menu page",
  "description": "",
  "id": "menu-functionality-in-demoqa;to-verify-menu-navigation-in-menu-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "i launch url \"https://demoqa.com/menu/\" in demoqa",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "i navigate to big band option \"Music-\u003eJazz-\u003eBig Band\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://demoqa.com/menu/",
      "offset": 14
    }
  ],
  "location": "Stepdefinition.launchUrl(String)"
});
formatter.result({
  "duration": 582207074,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Music-\u003eJazz-\u003eBig Band",
      "offset": 31
    }
  ],
  "location": "Stepdefinition.navigateToBigBand(String)"
});
formatter.result({
  "duration": 960176464,
  "status": "passed"
});
formatter.after({
  "duration": 26799,
  "status": "passed"
});
formatter.uri("datepicker.feature");
formatter.feature({
  "line": 2,
  "name": "Date picker functionality in demoqa",
  "description": "",
  "id": "date-picker-functionality-in-demoqa",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@demoqa"
    }
  ]
});
formatter.before({
  "duration": 56180393,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "To verify date selection in demoqa",
  "description": "",
  "id": "date-picker-functionality-in-demoqa;to-verify-date-selection-in-demoqa",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "i launch url \"https://demoqa.com/datepicker/\" in demoqa",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "i click on date input box",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "i click on previous button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "i select a specific date",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "selected date \"26\" displayed in date input field",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://demoqa.com/datepicker/",
      "offset": 14
    }
  ],
  "location": "Stepdefinition.launchUrl(String)"
});
formatter.result({
  "duration": 572618705,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.clickDateInput()"
});
formatter.result({
  "duration": 109340973,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.clickPreviousButton()"
});
formatter.result({
  "duration": 148691649,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.selectCalenderDate()"
});
formatter.result({
  "duration": 501289169,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "26",
      "offset": 15
    }
  ],
  "location": "Stepdefinition.verifyDateDisplayed(String)"
});
formatter.result({
  "duration": 35629507,
  "status": "passed"
});
formatter.after({
  "duration": 25389,
  "status": "passed"
});
formatter.uri("keyboardevent.feature");
formatter.feature({
  "line": 2,
  "name": "keyboard events functionality in demoqa",
  "description": "",
  "id": "keyboard-events-functionality-in-demoqa",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@demoqa"
    }
  ]
});
formatter.before({
  "duration": 34459170,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "To verify upload file in demoqa",
  "description": "",
  "id": "keyboard-events-functionality-in-demoqa;to-verify-upload-file-in-demoqa",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "i launch url \"https://demoqa.com/keyboard-events/\" in demoqa",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "i click on choose file",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click on upload button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "file should be upload",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://demoqa.com/keyboard-events/",
      "offset": 14
    }
  ],
  "location": "Stepdefinition.launchUrl(String)"
});
formatter.result({
  "duration": 668074314,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.chooseFile()"
});
formatter.result({
  "duration": 74670937,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.fileUpload()"
});
formatter.result({
  "duration": 101739249,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.verifyFile()"
});
formatter.result({
  "duration": 17032825,
  "status": "passed"
});
formatter.after({
  "duration": 64176,
  "status": "passed"
});
});