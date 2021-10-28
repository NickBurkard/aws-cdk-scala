package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VersionWeightProperty {

  def apply(
    functionVersion: Option[String] = None,
    functionWeight: Option[Number] = None
  ): software.amazon.awscdk.services.lambda.CfnAlias.VersionWeightProperty =
    (new software.amazon.awscdk.services.lambda.CfnAlias.VersionWeightProperty.Builder)
      .functionVersion(functionVersion.orNull)
      .functionWeight(functionWeight.orNull)
      .build()
}
