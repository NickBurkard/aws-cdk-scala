package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ElasticInferenceAcceleratorProperty {

  def apply(
    count: Option[Number] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnInstance.ElasticInferenceAcceleratorProperty =
    (new software.amazon.awscdk.services.ec2.CfnInstance.ElasticInferenceAcceleratorProperty.Builder)
      .count(count.orNull)
      .`type`(`type`.orNull)
      .build()
}
