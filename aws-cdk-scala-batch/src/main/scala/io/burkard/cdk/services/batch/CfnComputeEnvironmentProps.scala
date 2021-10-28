package io.burkard.cdk.services.batch

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnComputeEnvironmentProps {

  def apply(
    state: Option[String] = None,
    tags: Option[AnyRef] = None,
    computeResources: Option[software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty] = None,
    `type`: Option[String] = None,
    serviceRole: Option[String] = None,
    computeEnvironmentName: Option[String] = None
  ): software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps =
    (new software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps.Builder)
      .state(state.orNull)
      .tags(tags.orNull)
      .computeResources(computeResources.orNull)
      .`type`(`type`.orNull)
      .serviceRole(serviceRole.orNull)
      .computeEnvironmentName(computeEnvironmentName.orNull)
      .build()
}
