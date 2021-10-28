package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LaunchTemplateSpec {

  def apply(
    version: Option[String] = None,
    id: Option[String] = None
  ): software.amazon.awscdk.services.eks.LaunchTemplateSpec =
    (new software.amazon.awscdk.services.eks.LaunchTemplateSpec.Builder)
      .version(version.orNull)
      .id(id.orNull)
      .build()
}
