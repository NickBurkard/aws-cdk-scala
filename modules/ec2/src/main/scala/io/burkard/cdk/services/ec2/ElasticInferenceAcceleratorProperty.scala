package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ElasticInferenceAcceleratorProperty {

  def apply(
    `type`: String,
    count: Option[Number] = None
  ): software.amazon.awscdk.services.ec2.CfnInstance.ElasticInferenceAcceleratorProperty =
    (new software.amazon.awscdk.services.ec2.CfnInstance.ElasticInferenceAcceleratorProperty.Builder)
      .`type`(`type`)
      .count(count.orNull)
      .build()
}
