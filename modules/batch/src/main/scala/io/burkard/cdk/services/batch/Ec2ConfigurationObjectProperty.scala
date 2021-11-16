package io.burkard.cdk.services.batch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Ec2ConfigurationObjectProperty {

  def apply(
    imageType: String,
    imageIdOverride: Option[String] = None
  ): software.amazon.awscdk.services.batch.CfnComputeEnvironment.Ec2ConfigurationObjectProperty =
    (new software.amazon.awscdk.services.batch.CfnComputeEnvironment.Ec2ConfigurationObjectProperty.Builder)
      .imageType(imageType)
      .imageIdOverride(imageIdOverride.orNull)
      .build()
}
