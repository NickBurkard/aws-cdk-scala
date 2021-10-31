package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BasePathMappingOptions {

  def apply(
    stage: Option[software.amazon.awscdk.services.apigateway.Stage] = None,
    basePath: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.BasePathMappingOptions =
    (new software.amazon.awscdk.services.apigateway.BasePathMappingOptions.Builder)
      .stage(stage.orNull)
      .basePath(basePath.orNull)
      .build()
}
