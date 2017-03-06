/**
 * Created by Gregor on 28.02.2017.
 */
$(function(){

    $("input[name=branche]").click(function(){
        $("div.content").not("."+this.value).hide();
        $("."+this.value).show();
    });

});