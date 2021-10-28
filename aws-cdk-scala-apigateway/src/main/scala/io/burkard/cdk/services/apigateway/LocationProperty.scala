package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LocationProperty {

  def apply(
    statusCode: Option[String] = None,
    method: Option[String] = None,
    name: Option[String] = None,
    path: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnDocumentationPart.LocationProperty =
    (new software.amazon.awscdk.services.apigateway.CfnDocumentationPart.LocationProperty.Builder)
      .statusCode(statusCode.orNull)
      .method(method.orNull)
      .name(name.orNull)
      .path(path.orNull)
      .`type`(`type`.orNull)
      .build()
}
