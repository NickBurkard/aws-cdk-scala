package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LabelProperty {

  def apply(
    key: String,
    value: String
  ): software.amazon.awscdk.services.eks.CfnFargateProfile.LabelProperty =
    (new software.amazon.awscdk.services.eks.CfnFargateProfile.LabelProperty.Builder)
      .key(key)
      .value(value)
      .build()
}
