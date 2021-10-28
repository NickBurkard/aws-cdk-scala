package io.burkard.cdk.services.greengrassv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ComponentDependencyRequirementProperty {

  def apply(
    dependencyType: Option[String] = None,
    versionRequirement: Option[String] = None
  ): software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentDependencyRequirementProperty =
    (new software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentDependencyRequirementProperty.Builder)
      .dependencyType(dependencyType.orNull)
      .versionRequirement(versionRequirement.orNull)
      .build()
}
