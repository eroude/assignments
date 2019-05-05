
// WITH DOM  - FROM MAIN.JS CLASS-03 DOCUMENT OBJECT MODEL

 let global_result;
$(function() {
	createHTML();

	$.getJSON("json/data.json", function(result) {
		global_result = result;
		defaultLanguage();
	});

	$("#language_button_id").click(changeLanguage);



	$("#button_id").click(function() {
		let price = Number($("#input_field_id").val());
		const gst = price => Number((price * 0.05).toFixed(2));
		$("#div_result2_id").text("GST: $ " + gst(price));
		const qst = price => Number((price * 0.09975).toFixed(2))
		$("#div_result3_id").text("QST: $ " + qst(price));
		let total = (price, qst, gst) => (price + gst + qst).toFixed(2);
		$("#div_result4_id").text("Total: $ " + total(price, gst(price), qst(price)));
	});


	$("#reverse_button_id").click(function() {
		let total = Number($("#input_field_id").val());
		let before_tax = total / 1.14975;
		const gst = before_tax => Number((before_tax * 0.05).toFixed(2));
		$("#div_result2_id").text("GST: $ " + gst(before_tax));
		const qst = before_tax => Number((before_tax * 0.09975).toFixed(2));
		$("#div_result3_id").text("QST: $ " + qst(before_tax));
		let price = (total, qst, gst) => (total - gst - qst).toFixed(2);
		$("#div_result4_id").text("Price: $ " + price(total, gst(before_tax), qst(before_tax)));
	});
});

const createHTML = () => {
	let body = document.getElementsByTagName("BODY")[0];
	//--------------------------------------------------
	let div_container = document.createElement("DIV");
	div_container.setAttribute("class", "div_container_class");
	div_container.setAttribute("id", "div_container_id");
  //--------------------------------------------------
	let span = document.createElement("SPAN");
	span.setAttribute("class", "span_class");
	span.setAttribute("id", "span_id");
	let text_title = document.createTextNode("Quebec Tax Calculator");
	span.appendChild(text_title);
	div_container.appendChild(span);
  //--------------------------------------------------
	let input_field = document.createElement("INPUT");
	input_field.setAttribute("class", "input_field_class");
	input_field.setAttribute("id", "input_field_id");
	input_field.setAttribute("placeholder", "Enter price");
	div_container.appendChild(input_field);
  //--------------------------------------------------
	let calculate_button = document.createElement("BUTTON");
	calculate_button.setAttribute("class", "button_class");
	calculate_button.setAttribute("id", "button_id");
	let text_button = document.createTextNode("CALCULATE");
	calculate_button.appendChild(text_button);
	div_container.appendChild(calculate_button);
  //--------------------------------------------------
	let reverseCalculate_button = document.createElement("BUTTON");
	reverseCalculate_button.setAttribute("class", "button_class");
	reverseCalculate_button.setAttribute("id", "reverse_button_id");
	let text_button_reverse = document.createTextNode("REVERSE CALCULATE");
	reverseCalculate_button.appendChild(text_button_reverse);
	div_container.appendChild(reverseCalculate_button);
	//--------------------------------------------------
	let div_result1 = document.createElement("DIV");
	div_result1.setAttribute("class", "div_result1_class");
	div_result1.setAttribute("id", "div_result1_id");
	div_container.appendChild(div_result1);
	let div_result2 = document.createElement("DIV");
	div_result2.setAttribute("class", "div_result2_class");
	div_result2.setAttribute("id", "div_result2_id");
	div_container.appendChild(div_result2);
	let div_result3= document.createElement("DIV");
	div_result3.setAttribute("class", "div_result3_class");
	div_result3.setAttribute("id", "div_result3_id");
	div_container.appendChild(div_result3);
	let div_result4 = document.createElement("DIV");
	div_result4.setAttribute("class", "div_result4_class");
	div_result4.setAttribute("id", "div_result4_id");
	div_container.appendChild(div_result4);
	//--------------------------------------------------
	body.appendChild(div_container);
};


// AJAX


const defaultLanguage = () => displayFrench();

const displayFrench = () => {
	$("#language_button_id").text(global_result.FRENCH.BUTTON_TEXT);
	$("#span_id").text(global_result.FRENCH.TEXT_FOR_SPAN);
  $("#button_id").text(global_result.FRENCH.BUTTON2_TEXT);//calculate button
  $("#reverse_button_id").text(global_result.FRENCH.REVERSE_BUTTON_TEXT);// reverse calculate button
};

const displayEnglish = () => {
	$("#language_button_id").text(global_result.ENGLISH.BUTTON_TEXT);
	$("#span_id").text(global_result.ENGLISH.TEXT_FOR_SPAN);
  $("#button_id").text(global_result.ENGLISH.BUTTON2_TEXT);
  $("#reverse_button_id").text(global_result.ENGLISH.REVERSE_BUTTON_TEXT);
};

const changeLanguage = () => {
	const current_language = $("#language_button_id").text();
	if (current_language === "English") {
		displayEnglish();
	} else {
		displayFrench();
	}
 };



