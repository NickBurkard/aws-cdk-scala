package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AutoScalingGroupOptions {

  def apply(
    bootstrapEnabled: Option[Boolean] = None,
    spotInterruptHandler: Option[Boolean] = None,
    machineImageType: Option[software.amazon.awscdk.services.eks.MachineImageType] = None,
    mapRole: Option[Boolean] = None,
    bootstrapOptions: Option[software.amazon.awscdk.services.eks.BootstrapOptions] = None
  ): software.amazon.awscdk.services.eks.AutoScalingGroupOptions =
    (new software.amazon.awscdk.services.eks.AutoScalingGroupOptions.Builder)
      .bootstrapEnabled(bootstrapEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .spotInterruptHandler(spotInterruptHandler.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .machineImageType(machineImageType.orNull)
      .mapRole(mapRole.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .bootstrapOptions(bootstrapOptions.orNull)
      .build()
}
