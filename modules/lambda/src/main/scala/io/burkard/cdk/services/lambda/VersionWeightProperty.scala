package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VersionWeightProperty {

  def apply(
    functionVersion: String,
    functionWeight: Number
  ): software.amazon.awscdk.services.lambda.CfnAlias.VersionWeightProperty =
    (new software.amazon.awscdk.services.lambda.CfnAlias.VersionWeightProperty.Builder)
      .functionVersion(functionVersion)
      .functionWeight(functionWeight)
      .build()
}
