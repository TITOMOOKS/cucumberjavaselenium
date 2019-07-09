$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/order.feature");
formatter.feature({
  "name": "Place an order in Tom\u0027s Sandwich",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user order burger from Tom\u0027s Sandwich",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@order01"
    }
  ]
});
formatter.step({
  "name": "user should be able to open the website",
  "keyword": "Given "
});
formatter.match({
  "location": "orderNowPage_steps.user_should_be_able_to_open_the_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to click to order now",
  "keyword": "When "
});
formatter.match({
  "location": "orderNowPage_steps.user_should_able_to_click_to_order_now()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the check box edison burger",
  "keyword": "And "
});
formatter.match({
  "location": "orderNowPage_steps.user_clicks_the_check_box_edison_burger()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "orderNowPage_steps.user_should_be_able_to_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to check out",
  "keyword": "And "
});
formatter.match({
  "location": "orderNowPage_steps.user_should_be_able_to_check_out()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter the name and email",
  "keyword": "And "
});
formatter.match({
  "location": "orderNowPage_steps.user_should_enter_the_name_and_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to submit",
  "keyword": "And "
});
formatter.match({
  "location": "orderNowPage_steps.user_should_be_able_to_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "thank you note should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "orderNowPage_steps.thank_you_note_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see confirmation number and total amount on the screen",
  "keyword": "And "
});
formatter.match({
  "location": "orderNowPage_steps.user_should_see_confirmation_number_and_total_amount_on_the_screen()"
});
formatter.result({
  "status": "passed"
});
});