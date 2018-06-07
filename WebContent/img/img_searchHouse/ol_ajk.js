/**
 *
 * @authors wang.liguo (you@example.org)
 * @date    2015-09-28 14:40:41
 * @version $Id$
 */

var adstat_obj = document.getElementById("adstat_js");
if (adstat_obj && adstat_obj.src) {
	var adstat_domain = "",
		adstat_write = null;
	var adstat_a = document.createElement("a");
	adstat_a.href = adstat_obj.src;
	adstat_domain = adstat_a.hostname;
	if (adstat_domain) {
		adstat_write = function(a, b) {
			if (!a) {
				return
			}
			if (undefined == b) {
				b = "js"
			}
			switch (b) {
				case "js":
					var script = document.createElement("script");
					script.src = a;
					//script.async = true;
					var content = (document.getElementsByTagName('head')[0] || document.getElementsByTagName('body')[0]);
					content.appendChild(script);
					break;
				default:
			}
		};

		adstat_write("//" + adstat_domain + "/adrs/bms_tag.php?" + Math.random())
	}
};
