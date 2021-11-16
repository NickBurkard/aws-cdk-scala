package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnBasePathMappingProps {

  def apply(
    domainName: String,
    stage: Option[String] = None,
    basePath: Option[String] = None,
    restApiId: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnBasePathMappingProps =
    (new software.amazon.awscdk.services.apigateway.CfnBasePathMappingProps.Builder)
      .domainName(domainName)
      .stage(stage.orNull)
      .basePath(basePath.orNull)
      .restApiId(restApiId.orNull)
      .build()
}
