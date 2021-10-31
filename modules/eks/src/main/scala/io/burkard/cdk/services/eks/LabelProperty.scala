package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LabelProperty {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.eks.CfnFargateProfile.LabelProperty =
    (new software.amazon.awscdk.services.eks.CfnFargateProfile.LabelProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
