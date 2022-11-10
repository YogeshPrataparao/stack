<h1 style="color:red">Register Here</h1>

<form action="/register" method="post">
    <table>
        <tr>
            <td>User Id:</td>
            <td><input type="number" name="uid"></td>
        </tr>
        <tr>
            <td>User Name:</td>
            <td><input type="text" name="uname"></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><input type="email" name="uemail"></td>
        </tr>
        <tr>
            <td>Mobile:</td>
            <td><input type="tel" name="umob"></td>
        </tr>
        <tr>
            <td>Address:</td>
            <td><input type="text" name="address"></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="text" name="password"></td>
        </tr>
        <tr>
            <td>Are you Customer:</td>
            <td><input type="radio" name="isCustomer" value="true">Yes
            <input type="radio" name="isCustomer" value="false">No</td>
        </tr>
        <tr>
            <td><input type="submit" value="Register"</td>
        </tr>
    </table>

</form>