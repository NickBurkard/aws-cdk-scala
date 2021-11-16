package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LaunchTemplateSpec {

  def apply(
    id: String,
    version: Option[String] = None
  ): software.amazon.awscdk.services.eks.LaunchTemplateSpec =
    (new software.amazon.awscdk.services.eks.LaunchTemplateSpec.Builder)
      .id(id)
      .version(version.orNull)
      .build()
}
