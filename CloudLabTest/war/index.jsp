<%@ page 
import="com.google.appengine.api.blobstore.BlobstoreServiceFactory" %>
<%@ page import="com.google.appengine.api.blobstore.BlobstoreService" %>
<%BlobstoreService blobstoreService = 
BlobstoreServiceFactory.getBlobstoreService(); %>
<html>
	<head>
		<title>Upload Test</title>
	</head>
	<body>		AString =  req.GetParameter("A");
		System.out.println("AString");
	</body>
</html>