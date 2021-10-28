package io.burkard.cdk.services.iotsitewise

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AccessPolicyResourceProperty {

  def apply(
    project: Option[software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.ProjectProperty] = None,
    portal: Option[software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.PortalProperty] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyResourceProperty =
    (new software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy.AccessPolicyResourceProperty.Builder)
      .project(project.orNull)
      .portal(portal.orNull)
      .build()
}
