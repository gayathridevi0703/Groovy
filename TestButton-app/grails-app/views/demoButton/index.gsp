<html>
<h1>welcome</h1>

<g:link controller="DemoButtonController" action="doLogout">
    <button type="button">Submit</button>
</g:link>
<g:actionSubmit value="unsubmit" color="purple" style="color: white"
                onclick="return confirm('Are you sure???')" />
</html>