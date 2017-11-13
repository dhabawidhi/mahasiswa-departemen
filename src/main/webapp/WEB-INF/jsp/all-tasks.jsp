<!DOCTYPE HTML>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="header.jsp"/>
	<div class="container text-center" id="taskDiv">
		<h3>My Tasks</h3>
		<hr>
		<div class="table-responsive">
			<table class="table table-striped table-bordered text-left">
				<thead>
					<tr>
						<th>ID</th>
						<th>Nama</th>
						<th>Departemen</th>
						<th>Edit</th>
						<th>Delete</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="mahasiswa" items="${mahasiswas}">
						<tr>
							<td>${mahasiswa.id}</td>
							<td>${mahasiswa.nama}</td>
							<td>${mahasiswa.departemen.departemen_nama}</td>
							<td><a href="update-mahasiswa?id=${mahasiswa.id}" ><span class="glyphicon glyphicon-pencil"></span></a></td>
							<td><a href="delete-mahasiswa?id=${mahasiswa.id}" onclick="myFunction()"><span class="glyphicon glyphicon-trash"></span></a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	<script>
	function myFunction() {
	    alert("Data sukses dihapus");
	}
</script>
<jsp:include page="footer.jsp"/>