package io.burkard.cdk.services.batch

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LaunchTemplateSpecificationProperty {

  def apply(
    launchTemplateName: Option[String] = None,
    launchTemplateId: Option[String] = None,
    version: Option[String] = None
  ): software.amazon.awscdk.services.batch.CfnComputeEnvironment.LaunchTemplateSpecificationProperty =
    (new software.amazon.awscdk.services.batch.CfnComputeEnvironment.LaunchTemplateSpecificationProperty.Builder)
      .launchTemplateName(launchTemplateName.orNull)
      .launchTemplateId(launchTemplateId.orNull)
      .version(version.orNull)
      .build()
}