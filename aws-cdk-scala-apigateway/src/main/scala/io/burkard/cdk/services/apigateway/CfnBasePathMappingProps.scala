package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnBasePathMappingProps {

  def apply(
    stage: Option[String] = None,
    domainName: Option[String] = None,
    basePath: Option[String] = None,
    restApiId: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnBasePathMappingProps =
    (new software.amazon.awscdk.services.apigateway.CfnBasePathMappingProps.Builder)
      .stage(stage.orNull)
      .domainName(domainName.orNull)
      .basePath(basePath.orNull)
      .restApiId(restApiId.orNull)
      .build()
}
