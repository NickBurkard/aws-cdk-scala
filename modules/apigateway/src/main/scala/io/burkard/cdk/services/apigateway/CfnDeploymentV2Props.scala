package io.burkard.cdk.services.apigateway

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDeploymentV2Props {

  def apply(
    apiId: String,
    description: Option[String] = None,
    stageName: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnDeploymentV2Props =
    (new software.amazon.awscdk.services.apigateway.CfnDeploymentV2Props.Builder)
      .apiId(apiId)
      .description(description.orNull)
      .stageName(stageName.orNull)
      .build()
}
