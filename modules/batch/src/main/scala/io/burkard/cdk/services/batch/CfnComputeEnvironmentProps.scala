package io.burkard.cdk.services.batch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnComputeEnvironmentProps {

  def apply(
    `type`: String,
    state: Option[String] = None,
    tags: Option[AnyRef] = None,
    computeResources: Option[software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty] = None,
    unmanagedvCpus: Option[Number] = None,
    serviceRole: Option[String] = None,
    computeEnvironmentName: Option[String] = None
  ): software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps =
    (new software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps.Builder)
      .`type`(`type`)
      .state(state.orNull)
      .tags(tags.orNull)
      .computeResources(computeResources.orNull)
      .unmanagedvCpus(unmanagedvCpus.orNull)
      .serviceRole(serviceRole.orNull)
      .computeEnvironmentName(computeEnvironmentName.orNull)
      .build()
}
