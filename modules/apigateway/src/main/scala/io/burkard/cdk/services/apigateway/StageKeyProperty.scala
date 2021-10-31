package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StageKeyProperty {

  def apply(
    stageName: Option[String] = None,
    restApiId: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnApiKey.StageKeyProperty =
    (new software.amazon.awscdk.services.apigateway.CfnApiKey.StageKeyProperty.Builder)
      .stageName(stageName.orNull)
      .restApiId(restApiId.orNull)
      .build()
}
