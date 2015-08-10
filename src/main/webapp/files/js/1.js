/**
 * Created by NickVeremeichyk on 7/22/15.
 */
//TODO toggling
$(function() {
    $('.checkbox').click(function() {

            $('.top_panel').css("display", "none");
            $('.top_panel_save').css("display", "inline-flex");
    });
});

$(function() {
    $('#cancel').click(function() {
        $('.top_panel').css("display", "inline-flex");
        $('.top_panel_save').css("display", "none");
    });
});

$(function() {
    $('#save').click(function() {
        var form = document.getElementById('saveToArchive');

       form.submit();
    });
});

