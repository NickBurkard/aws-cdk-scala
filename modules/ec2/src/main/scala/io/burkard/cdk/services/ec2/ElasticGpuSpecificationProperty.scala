package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ElasticGpuSpecificationProperty {

  def apply(
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnInstance.ElasticGpuSpecificationProperty =
    (new software.amazon.awscdk.services.ec2.CfnInstance.ElasticGpuSpecificationProperty.Builder)
      .`type`(`type`.orNull)
      .build()
}
