package io.burkard.cdk.services.batch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnComputeEnvironment {

  def apply(
    internalResourceId: String,
    state: Option[String] = None,
    tags: Option[AnyRef] = None,
    computeResources: Option[software.amazon.awscdk.services.batch.CfnComputeEnvironment.ComputeResourcesProperty] = None,
    `type`: Option[String] = None,
    serviceRole: Option[String] = None,
    computeEnvironmentName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.batch.CfnComputeEnvironment =
    software.amazon.awscdk.services.batch.CfnComputeEnvironment.Builder
      .create(stackCtx, internalResourceId)
      .state(state.orNull)
      .tags(tags.orNull)
      .computeResources(computeResources.orNull)
      .`type`(`type`.orNull)
      .serviceRole(serviceRole.orNull)
      .computeEnvironmentName(computeEnvironmentName.orNull)
      .build()
}
