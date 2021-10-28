package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnResourceProps {

  def apply(
    pathPart: Option[String] = None,
    parentId: Option[String] = None,
    restApiId: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnResourceProps =
    (new software.amazon.awscdk.services.apigateway.CfnResourceProps.Builder)
      .pathPart(pathPart.orNull)
      .parentId(parentId.orNull)
      .restApiId(restApiId.orNull)
      .build()
}
