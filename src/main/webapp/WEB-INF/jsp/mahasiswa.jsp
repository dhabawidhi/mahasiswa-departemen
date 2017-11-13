<!DOCTYPE HTML>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="header.jsp"/>
	<div class="container text-center">
		<h3>Manage Task</h3>
		<hr>
		<form class="form-horizontal" method="POST" action="save-mahasiswa">
			<input type="hidden" name="id" value="${mahasiswa.id}"/>
			<div class="form-group">
				<label class="central-label col-md-3">Nama</label>
				<div class="col-md-7">
					<input type="text" class="form-control" name="nama" value="${mahasiswa.nama}"/>
				</div>	
			</div>
			<div class="form-group">
				<label class="central-label col-md-3">Departemen</label>
				<div class="col-md-7">
					<select name="departemen">
					<c:forEach var="departemen" items="${departemens}">
						<c:choose>
							<c:when test="${mahasiswa.departemen.id==departemen.id}">
								<option value="${departemen.id}" selected>${departemen.departemen_nama}</option>
							</c:when>
							<c:otherwise>
								<option value="${departemen.id}">${departemen.departemen_nama}</option>
							</c:otherwise>
						</c:choose>
							
					</c:forEach>
					</select>
				</div>	
			</div>
			<div class="form-group">
				<input type="submit" onclick="myFunction()" class="btn btn-primary" value="save"/>
			</div>
		</form>
		<script>
		function myFunction() {
		    alert("I am an alert box!");
		}
</script>
	</div>
<jsp:include page="footer.jsp"/>
	